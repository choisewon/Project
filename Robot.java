
/**
 * 여기에 RobotWalk 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Robot
{
    public void RobotWalk()
    {
        double speed = 10;
        String tratfic_signal;
        if (tratfic_signal == "녹색")
        {
            
        }
        else if (tratfic_signal == "노란색")
        {
            speed = speed*1.2;
        }
        else
        {
            speed = 0;
        }
    }
    public static void main(String[] args)
    {
        RobotWalk();
    }
}
