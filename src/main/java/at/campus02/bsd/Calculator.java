package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The calculator provides the methods for different calculations
 *
 * @author Jakob Moesenbacher
 *
 */
public class Calculator {
    /**
     * The logger which is used for all Logs
     */
    private static Logger logger = LogManager.getLogger();


    /**
     * <p>This method gets two values (number1 & number2) then they will
     * be added to each other and the result will be returned
     * </p>
     * @param number1 is a double value which is given to the Method
     * @param number2 is the second double value which is given to the Method
     * @return the result of the Method which is a double value
     */
    public double add(double number1, double number2){
        double result = 0.0;
        result = number1 + number2;
        logger.debug(number1 + ", " + number2);
        return result;
    }

    /**
     * <p>This method gets two values (number1 & number2) then they will
     * be subtracted from each other and the result will be returned
     * </p>
     * @param number1 is a double value which is given to the Method
     * @param number2 is the second double value which is given to the Method
     * @return the result of the Method which is a double value
     */
    public double minus(double number1, double number2){
        double result = 0.0;
        result = number1 - number2;
        logger.debug(number1 + ", " + number2);
        return result;
    }

    /**
     * <p>This method gets two values (number1 & number2) then they will
     * be divided by each other and the result will be returned
     * </p>
     * @param number1 is a double value which is given to the Method
     * @param number2 is the second double value which is given to the Method
     * @return the result of the Method which is a double value
     * @throws ArithmeticException is thrown when number2 is zero because it should not be possible to divide by zero
     */
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

    /**
     * <p>This method gets two values (number1 & number2) then they will
     * be multiplyed with each other and the result will be returned
     * </p>
     * @param number1 is a double value which is given to the Method
     * @param number2 is the second double value which is given to the Method
     * @return the result of the Method which is a double value
     */
    public double multiply(double number1, double number2){
        double result = 0.0;
        result = number1 * number2;
        logger.debug(number1 + ", " + number2);
        return result;
    }


    /**
     * <p>This method calculates the factorial of a number
     * </p>
     * @param number1 is a double value which is given to the Method
     * @return the result of the Method which is a double value
     */
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
