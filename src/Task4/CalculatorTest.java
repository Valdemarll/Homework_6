package Task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator(5, 3);
    @Test
    public void getNum1() {
        assertEquals(5, calculator.getNum1());
    }

    @Test
    public void setNum1() {
        calculator.setNum1(4);
        assertEquals(4, calculator.getNum1());
    }

    @Test
    public void getNum2() {
        assertEquals(3, calculator.getNum2());
    }

    @Test
    public void setNum2() {
        calculator.setNum2(2);
        assertEquals(2, calculator.getNum2());
    }

    @Test
    public void add() {
        Calculator.Add add = calculator.new Add();
        assertEquals(8, add.act());
    }

    @Test
    public void sub() {
        Calculator.Sub sub = calculator.new Sub();
        assertEquals(2, sub.act());
    }

    @Test
    public void multiply() {
        Calculator.Multiply multiply = calculator.new Multiply();
        assertEquals(15, multiply.act());
    }

    @Test
    public void div() {
        Calculator.Div div = calculator.new Div();
        assertEquals(1, div.act());
    }
}