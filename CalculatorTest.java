import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    // tests the logic of the Add function to ensure that it is working the way it is supposed to
    @Test
    public void add() {
        Calculator test = new Calculator();
        int output = test.Add(20, 35);
        assertEquals(55, output);
    }

    // tests the logic of the Subtract function to ensure that it is working the way it is supposed to
    @Test
    public void subtract() {
        Calculator test1 = new Calculator();
        int output = test1.Subtract(10, 3);
        assertEquals(7, output);
    }

    // tests the logic of the Multiply function to ensure that it is working the way it is supposed to
    @Test
    public void multiply() {
        Calculator test2 = new Calculator();
        int output = test2.Multiply(10, 7);
        assertEquals(70, output);
    }

    // tests the logic of the Divide function to ensure that it is working the way it is supposed to
    @Test
    public void divide() {
        Calculator test3 = new Calculator();
        int output = test3.Divide(9, 3);
        assertEquals(3, output);
    }
}