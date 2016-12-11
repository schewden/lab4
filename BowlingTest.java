import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Денис on 11.12.2016.
 */
public class BowlingTest {
    @Test
        public void testCheckProject(){
        Bowling bowling = new Bowling();
        for (int i=0; i<20;i++){
            bowling.roll(0);
            assertEquals(0, bowling.score());
        }
    }
}
