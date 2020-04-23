/**
 * 로봇 보행속도 변경을 할 Robotwalk 메소드가 있는 클래스
 * 
 * @author (2018315003 최세원, 2018315036 양유석 ) 
 * @version (2020/04/23)
 */
public class Robot
{
    private double current_speed;
    
    public Robot(double speed){
        current_speed = speed;
    }
    
    public double  getSpeed()
    {
        return this.current_speed;
    }
    
    /**
     * RobotWalk - 로봇 보행속도 변경 모듈
     * @param  traffic_signal:String  현재 신호의 상태를 받아온다.
               speed:double  현재 로봇의 속도를 받아온다.
     * @return  신호에 의해 변경된 로봇의 속도 type:double
     */
    public void RobotWalk(String traffic_signal)
    {
        if (traffic_signal == "녹색"){}
        else if (traffic_signal == "노란색"){
            this.current_speed *= 1.2;
        }
        else{
            this.current_speed = 0;
        }
        //return this.current_speed;
    }
}
