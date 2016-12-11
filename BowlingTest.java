import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Денис on 11.12.2016.
 */
public class BowlingTest {
    Bowling bowling = new Bowling();
    @Test
        public void testCheckProject(){
        for (int i=0; i<20;i++){
            bowling.roll(0);
            assertEquals(0, bowling.score());
        }
    }

    @Test
        public void testRollOnePin(){
        for (int i = 0; i < 20; i++)
            bowling.roll(1);
        assertEquals(20, bowling.score());
    }
}