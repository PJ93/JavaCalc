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
        double AssmentX =5;
        double AssmentY = 10;
        double Expected = 15;
        double delta = 0.01; //margain for error, needt to make assertEquals work with doubles
        //act
        double actual = Main.calcMethodAdd(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual, delta);
    }
    @Test
    public void TestSubtraction() {
        double AssmentX =10;
        double AssmentY = 5;
        double Expected = 5;
        double actual = Main.calcMethodSub(AssmentX, AssmentY);
        double delta = 0.01;
        //Assert
        assertEquals(Expected, actual, delta);
    }
    @Test
    public void TestMultiplication() {
        //arrange
        double AssmentX =10;
        double AssmentY = 5;
        double Expected = 50;
        double delta = 0.01;
        //act
        double actual = Main.calcMethodMulti(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual, delta);
    }
    @Test
    public void TestDivision() {
        //arrange
        double AssmentX =10;
        double AssmentY = 5;
        double Expected = 2;
        double delta = 0.01;
        //act
        double actual = Main.calcMethodDiv(AssmentX, AssmentY);
        //Assert
        assertEquals(Expected, actual, delta);
    }

}
