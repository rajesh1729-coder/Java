import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        String vowelsSet = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                if (vowelsSet.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialChars++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
        
        scanner.close();
    }
}