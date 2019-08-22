package se.ecjava.patrik;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void Test() {
        //arrange
        int AssmentX =5;
        int AssmentY = 10;
        int Expected = 15;
        //act
        int actual = Main.calcMethodAdd(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual);
    }
}
