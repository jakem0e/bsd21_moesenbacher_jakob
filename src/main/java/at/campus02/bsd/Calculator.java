package at.campus02.bsd;

public class Calculator {
    public double add(double number1, double number2){
        double result = 0.0;
        result = number1 + number2;
        return result;
    }

    public double minus(double number1, double number2){
        double result = 0.0;
        result = number1 - number2;
        return result;
    }

    public double divide(double number1, double number2){
        double result = 0.0;
        result = number1 / number2;
        return result;
    }

    public double multiply(double number1, double number2){
        double result = 0.0;
        result = number1 * number2;
        return result;
    }

    public double factorial(double number1){
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
