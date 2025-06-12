import java.util.*;

class Student {
    String name;
    List<Integer> marks;

    Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    int getTotal() {
        int sum = 0;
        for (int mark : marks) sum += mark;
        return sum;
    }

    double getAverage() {
        return getTotal() / (double) marks.size();
    }
}

public class StudentManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = sc.nextLine();
            List<Integer> marks = new ArrayList<>();
            for (int j = 1; j <= 5; j++) {
                System.out.print("Enter mark " + j + ": ");
                marks.add(sc.nextInt());
            }
            sc.nextLine();
            students.add(new Student(name, marks));
        }

        for (Student s : students) {
            System.out.println("\nStudent: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("Total: " + s.getTotal());
            System.out.printf("Average: %.2f\n", s.getAverage());
        }
    }
}