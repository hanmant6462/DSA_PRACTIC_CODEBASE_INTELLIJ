package Practice;

public class Java8FunctinalInterfaceCalculator {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        CalculatorOperation addition = (a, b) -> a + b;
        CalculatorOperation subtraction = (a, b) -> a - b;
        CalculatorOperation multiplication = (a, b) -> a * b;
        CalculatorOperation division = (a, b) -> a / b;

        double sum = Calculator.calculate(num1, num2, addition);
        double difference = Calculator.calculate(num1, num2, subtraction);
        double product = Calculator.calculate(num1, num2, multiplication);
        double quotient = Calculator.calculate(num1, num2, division);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}


    class Calculator {
    public static double calculate(double a, double b, CalculatorOperation operation) {
        return operation.operate(a, b);
    }
}
@FunctionalInterface
interface CalculatorOperation {
    double operate(double a, double b);
}

