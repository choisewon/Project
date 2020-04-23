

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (2018315003 최세원, 2018315036 양유석)
 * @version (2020/04/23)
 */
public class RobotTest
{
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void RobotWalkTest()
    {
        Robot robot1 = new Robot(10.0);
        Robot robot2 = new Robot(10.0);
        Robot robot3 = new Robot(10.0);
        robot1.RobotWalk("녹색");
        robot2.RobotWalk("노란색");
        robot3.RobotWalk("빨간색");
        assertEquals(10.0, robot1.getSpeed(), 0.1);
        assertEquals(12.0, robot2.getSpeed(), 0.1);
        assertEquals(0.0, robot3.getSpeed(), 0.1);
    }
}

