import java.util.Scanner;

public class StringOperations{

    public static String hidePhoneNumber(String phone) {
        if (phone.length() < 4) return "Invalid number";
        return phone.substring(0, phone.length() - 4).replaceAll(".", "*") +
               phone.substring(phone.length() - 4);
    }

    public static String hideEmail(String email) {
        int at = email.indexOf('@');
        if (at <= 1) return "Invalid email";
        return email.charAt(0) + "" + email.substring(at - 1);
    }

    public static String maskMiddle(String str) {
        if (str.length() <= 2) return str;
        return str.charAt(0) + "*".repeat(str.length() - 2) + str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        System.out.println("Masked Phone: " + hidePhoneNumber(phone));

        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Masked Email: " + hideEmail(email));

        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        System.out.println("Masked String: " + maskMiddle(str));
    }
}