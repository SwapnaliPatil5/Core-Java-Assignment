package Assignment_1;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            // Otherwise, the character is a consonant
            System.out.println(ch + " is a consonant");
        }
        scanner.close();
    }
}
