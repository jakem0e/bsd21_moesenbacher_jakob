package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is the entry Point where the program starts
 *
 * Please see the {@link at.campus02.bsd.Calculator} class for the Methods of the Calculations.
 * @author Jakob Moesenbacher
 *
 */
public class Main {
    /**
     * The logger which is used for all Logs
     */
    private static Logger logger = LogManager.getLogger();


    /**
     * <p>The main is the entry point where the application starts
     * it prints the results of the Calculations from the Calculations class
     * </p>
     * @param args standard arguments
     */
    public static void main(String[] args) {

        logger.info("Info Logger");
        logger.error("Error Logger");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 5));
        System.out.println(calculator.minus(2, 5));
        System.out.println(calculator.divide(2, 5));
        System.out.println(calculator.multiply(2, 5));
        System.out.println(calculator.factorial(5));
    }

}
