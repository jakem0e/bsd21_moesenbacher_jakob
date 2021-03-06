package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.*;

public class calculatorTest {
    private Calculator calc;

    @BeforeEach
    public  void setup(){
        calc = new Calculator();
    }

    //ADD
    @Test
    public void addExpected(){
        Assertions.assertEquals(10, calc.add(6.0, 4.0));
    }

    @Test
    public void addActual(){
        double result = 6.0 + 4.0;
        Assertions.assertEquals(result, calc.add(6.0, 4.0));
    }

    //MINUS
    @Test
    public void minusExpected(){
        Assertions.assertEquals(2, calc.minus(6.0, 4.0));
    }

    @Test
    public void minusActual(){
        double result = 6.0 - 4.0;
        Assertions.assertEquals(result, calc.minus(6.0, 4.0));
    }

    //DIVIDE
    @Test
    public void divideExpected01(){
        Assertions.assertEquals(2.5, calc.divide(5.0, 2.0));
    }

    @Test
    public void divideActual(){
        double result = 5.0/2.0;
        Assertions.assertEquals(result, calc.divide(5.0, 2.0));
    }

    @Test
    public void divideExpected02(){Assertions.assertThrows(ArithmeticException.class, () -> {
        calc.divide(5, 0);
    });
    }

    //MULTIPLY
    @Test
    public void multiplyExpected(){
        Assertions.assertEquals(10, calc.multiply(5.0, 2.0));
    }

    @Test
    public void multiplyActual(){
        double result = 5.0*2.0;
        Assertions.assertEquals(result, calc.multiply(5.0, 2.0));
    }

    //FACTORIAL
    @Test
    public void factorialExpected01(){
        Assertions.assertEquals(0, calc.factorial(-5));
    }

    @Test
    public void factorialExpected02(){
        Assertions.assertEquals(1, calc.factorial(0));
    }

    @Test
    public void factorialExpected03(){
        Assertions.assertEquals(120, calc.factorial(5));
    }
    @Test
    public void factorialExpected04(){
        Assertions.assertEquals(1, calc.factorial(0));
    }
    @Test
    public void factorialExpected05(){
        Assertions.assertEquals(1, calc.factorial(1));
    }
}
