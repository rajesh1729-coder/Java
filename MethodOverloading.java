class Calculator {
    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, boolean isSubtraction) {
        return isSubtraction ? a - b : a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    double calculate(double a, double b, boolean isDivision) {
        return isDivision ? a / b : a * b;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.calculate(10, 5));
        System.out.println("Subtraction: " + calc.calculate(10, 5, true));
        System.out.println("Multiplication: " + calc.calculate(4.5, 2.0));
        System.out.println("Division: " + calc.calculate(10.0, 2.0, true));
    }
}