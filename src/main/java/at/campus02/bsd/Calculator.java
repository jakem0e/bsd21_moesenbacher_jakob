package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {
    private static Logger logger = LogManager.getLogger();


    public double add(double number1, double number2){
        double result = 0.0;
        result = number1 + number2;
        logger.debug(number1 + ", " + number2);
        return result;
    }

    public double minus(double number1, double number2){
        double result = 0.0;
        result = number1 - number2;
        logger.debug(number1 + ", " + number2);
        return result;
    }

    public double divide(double number1, double number2){
        double result = 0.0;
        if(number2 == 0){
            logger.error("Divided by zero.");
            throw new ArithmeticException();
        }
        else {
            result = number1 / number2;
        }
        logger.debug(number1 + ", " + number2);
        return result;
    }

    public double multiply(double number1, double number2){
        double result = 0.0;
        result = number1 * number2;
        logger.debug(number1 + ", " + number2);
        return result;
    }

    public double factorial(double number1){
        logger.debug(number1);
        if(number1 < 0){
            return 0;
        }
        else if (number1 <= 1 && number1 >= 0){
            return 1;
        }
        else {
            return number1 * factorial(number1 - 1);
        }
    }
}
