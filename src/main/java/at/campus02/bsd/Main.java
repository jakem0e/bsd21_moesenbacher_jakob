package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 5));
        System.out.println(calculator.minus(2, 5));
        System.out.println(calculator.divide(2, 5));
        System.out.println(calculator.multiply(2, 5));
        System.out.println(calculator.factorial(5));
    }

}
