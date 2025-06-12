class Calculator {
    int num1, num2;
    String operation;

    Calculator() {
        num1 = 0;
        num2 = 0;
        System.out.println("Default constructor: Values initialized to 0.");
    }

    Calculator(int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println("Addition result: " + (num1 + num2));
    }

    Calculator(int a, int b, String operation) {
        num1 = a;
        num2 = b;
        this.operation = operation;
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Addition result: " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("Subtraction result: " + (num1 - num2));
                break;
            case "multiply":
                System.out.println("Multiplication result: " + (num1 * num2));
                break;
            case "divide":
                if (num2 != 0)
                    System.out.println("Division result: " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }
}

public class ConstructorOverloading{
    public static void main(String[] args) {
        new Calculator();
        new Calculator(10, 5);
        new Calculator(20, 4, "multiply");
    }
}