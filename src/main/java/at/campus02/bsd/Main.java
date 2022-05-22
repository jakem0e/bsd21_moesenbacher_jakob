package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    // Creating a logger
    private static Logger logger = LogManager.getLogger();


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
