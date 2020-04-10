
/**
 * Robot Walk 메소드를 테스트하는 메인 메소드가 있는 클래스
 * 
 * @author (2018315003 최세원, 2018315036 양유석) 
 * @version (2020/04/10)
 */
public class RobotTest
{
    public static void main(String[] args)
    {
        String traffic_signal;
        double robot_speed;
        
        System.out.println("Testcase1 - traffic_signal : 녹색 current_speed : 10");
        Robot r1 = new Robot(10);
        traffic_signal = "녹색";
        robot_speed = r1.RobotWalk(traffic_signal);
        System.out.println("기대 결과 : 10.0");
        System.out.println("결과 : " + robot_speed);
        
        System.out.println("Testcase2 - traffic_signal : 노란색 current_speed : 10");
        Robot r2 = new Robot(10);
        traffic_signal = "노란색";
        robot_speed = r2.RobotWalk(traffic_signal);
        System.out.println("기대 결과 : 12.0");
        System.out.println("결과 : " + robot_speed);
        
        System.out.println("Testcase3 - traffic_signal : 빨간색 current_speed : 10");
        Robot r3 = new Robot(10);
        traffic_signal = "빨간색";
        robot_speed = r3.RobotWalk(traffic_signal);
        System.out.println("기대 결과 : 0.0");
        System.out.println("결과 : " + robot_speed);
    }
}
