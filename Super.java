import java.util.Scanner;

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void display() {
        super.display();
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void display() {
        super.display();
        System.out.println("This is a rectangle.");
    }
}

public class Super{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape type (circle/rectangle): ");
        String shapeType = scanner.next();

        Shape shape;
        if (shapeType.equalsIgnoreCase("circle")) {
            shape = new Circle();
        } else {
            shape = new Rectangle();
        }

        shape.display();
        scanner.close();
    }
}