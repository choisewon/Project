
/**
 * 로봇 보행속도 변경을 할 Robotwalk 메소드와 메소드를 테스트 할 메인 메소드가 담겨있는 클래스
 * 
 * @author (2018315003 최세원, 2018315036 양유석 ) 
 * @version (2020/04/09)
 */
public class Robot
{
   /**
   * 메인 메소드 - RobotWalk 모듈 테스트
   */
    public static void main(String[] args)
    {        
        double current_speed;
        String traffic_signal;
        
        System.out.println("Testcase1 - traffic_signal : 녹색 current_speed : 10");
        current_speed = 10;
        traffic_signal = "녹색";
        current_speed = RobotWalk(traffic_signal, current_speed);
        System.out.println("기대 결과 : 10.0");
        System.out.println("결과 : " + current_speed);
        
        System.out.println("Testcase2 - traffic_signal : 노란색 current_speed : 10");
        current_speed = 10;
        traffic_signal = "노란색";
        current_speed = RobotWalk(traffic_signal, current_speed);
        System.out.println("기대 결과 : 12.0");
        System.out.println("결과 : " + current_speed);
        
        
        System.out.println("Testcase3 - traffic_signal : 빨간색 current_speed : 10");
        current_speed = 10;
        traffic_signal = "빨간색";
        current_speed = RobotWalk(traffic_signal, current_speed);
        System.out.println("기대 결과 : 0.0");
        System.out.println("결과 : " + current_speed);
    }
    
    /**
     * RobotWalk - 로봇 보행속도 변경 모듈
     * @param  traffic_signal:String  현재 신호의 상태를 받아온다.
               speed:double  현재 로봇의 속도를 받아온다.
     * @return  신호에 의해 변경된 로봇의 속도 type:double
     */
    public static double RobotWalk(String traffic_signal, double current_speed)
    {
        if (traffic_signal == "녹색"){}
        else if (traffic_signal == "노란색"){
            current_speed *= 1.2;
        }
        else{
            current_speed = 0;
        }
        return current_speed;
    }

}
