package Chapter04;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();

        System.out.println("Your word length is: " + word.length() + " and firs character is: " + word.substring(0,1).toUpperCase());
    }
}
