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
    public void TestAddition() {
        //arrange
        int AssmentX =5;
        int AssmentY = 10;
        int Expected = 15;
        //act
        int actual = Main.calcMethodAdd(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual);
    }
    @Test
    public void TestSubtraction() {
        //arrange
        int AssmentX =10;
        int AssmentY = 5;
        int Expected = 5;
        //act
        int actual = Main.calcMethodSub(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual);
    }
    @Test
    public void TestMultiplication() {
        //arrange
        int AssmentX =10;
        int AssmentY = 5;
        int Expected = 50;
        //act
        int actual = Main.calcMethodMulti(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual);
    }
    @Test
    public void TestDivision() {
        //arrange
        int AssmentX =10;
        int AssmentY = 5;
        int Expected = 2;
        //act
        int actual = Main.calcMethodDiv(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual);
    }

}
