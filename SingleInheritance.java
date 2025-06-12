class Parent {
    void calculate() {
        System.out.println("This is the Parent class method.");
    }
}

class Child extends Parent {
    @Override
    void calculate() {
        int a = 10, b = 5;
        int sum = a + b;
        System.out.println("Child class method performing addition: " + sum);
    }
}

public class SingleInheritance{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.calculate();
    }
}