import java.util.Scanner;
public class StringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the word to check at the start: ");
        String startWord = scanner.nextLine();
        System.out.print("Enter the word to check at the end: ");
        String endWord = scanner.nextLine();
        boolean startsWith = str.startsWith(startWord);
        boolean endsWith = str.endsWith(endWord);
        System.out.println("Does the string start with \"" + startWord + "\"? " + startsWith);
        System.out.println("Does the string end with \"" + endWord + "\"? " + endsWith);
        scanner.close();
    }
}