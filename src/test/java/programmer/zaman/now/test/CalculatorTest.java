package programmer.zaman.now.test;

import org.junit.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess(){
        var result = calculator.add(10, 10);
    }

    @Test
    public void testMinusSuccess(){
        var result = calculator.minus(10, 10);
    }
}
