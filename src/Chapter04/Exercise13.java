package Chapter04;

import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        char letter = input.next().toUpperCase().charAt(0);
        input.close();

        boolean isVowel = false;
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            isVowel = true;
        }

        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is an invalid input.");
        } else if (isVowel) {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is a consonant.");
        }
    }
}
