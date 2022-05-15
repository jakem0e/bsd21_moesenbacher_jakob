package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void divideExpected(){
        Assertions.assertEquals(2.5, calc.divide(5.0, 2.0));
    }

    @Test
    public void divideActual(){
        double result = 5.0/2.0;
        Assertions.assertEquals(result, calc.divide(5.0, 2.0));
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
}
