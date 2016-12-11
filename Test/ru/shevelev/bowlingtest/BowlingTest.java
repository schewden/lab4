package ru.shevelev.bowlingtest;

import org.junit.Test;
import ru.shevelev.bowling.Bowling;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Денис on 11.12.2016.
 */
public class BowlingTest {
   private Bowling bowling = new Bowling();

    @Test
    public void testCheckProject() {
        for (int i = 0; i < 20; i++) {
            bowling.roll(0);
            assertEquals(0, bowling.score());
        }
    }

    @Test
    public void testRollOnePin() {
        for (int i = 0; i < 20; i++)
            bowling.roll(1);
        assertEquals(20, bowling.score());
    }

    @Test
    public void testDropTenPin() {
        bowling.roll(8);
        bowling.roll(2);
        bowling.roll(4);
        for (int i = 0; i < 17; i++) {
            bowling.roll(0);
        }
        assertEquals(18, bowling.score());
    }

    @Test
    public void testDropStrike() {
        bowling.roll(10);
        bowling.roll(2);
        bowling.roll(4);
        for (int i = 0; i < 17; i++) {
            bowling.roll(0);
        }
        assertEquals(22, bowling.score());
    }

    @Test
    public void testDropStrikeForTheEntireGame() {
        for (int i = 0; i < 20; i++) {
            bowling.roll(10);
        }
        assertEquals(300, bowling.score());
    }
}
