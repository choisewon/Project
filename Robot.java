
/**
 * 여기에 RobotWalk 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Robot
{
    public static void main(String[] args)
    {        
        double speed = 10;
        String traffic_signal = "노란색";
        
        speed = RobotWalk(traffic_signal, speed);
        System.out.println(speed);
    }
    public static double RobotWalk(String traffic_signal, double speed)
    {
        if (traffic_signal == "녹색"){}
        else if (traffic_signal == "노란색")
        {
            speed = speed * 1.2;
        }
        else
        {
            speed = 0;
        }
        return speed;
    }

}
