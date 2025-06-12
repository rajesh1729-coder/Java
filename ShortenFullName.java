import java.util.Scanner;
public class ShortenFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        String shortName = firstName.charAt(0) + "" + lastName.charAt(0);
        System.out.println("Shortened Name: " + shortName);
        scanner.close();
    }
}