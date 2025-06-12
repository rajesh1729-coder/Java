import java.util.Scanner;
public class CharacterOccurrenceFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to find: ");
        char ch = scanner.next().charAt(0);
        int firstIndex = str.indexOf(ch);
        int lastIndex = str.lastIndexOf(ch);
        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + ch + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + ch + "' is at index: " + lastIndex);
        } else {
            System.out.println("Character '" + ch + "' not found in the string.");
        }
        scanner.close();
    }
}