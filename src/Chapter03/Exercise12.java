package chapter03;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Three-digit integer: ");
        int num = input.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("invalid input!!");
        } else {
            int digit1 = num / 100;
            int digit3 = num % 10;

            if (digit1 == digit3) {
                System.out.println(num + " is a palindrome number.");
            } else {
                System.out.println(num + " is not a palindrome number");
            }
        }
    }
}
