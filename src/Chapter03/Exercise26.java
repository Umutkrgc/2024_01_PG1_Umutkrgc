package chapter03;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer ");
        int integer = input.nextInt();
        input.close();
        boolean divisibleBy5 = integer % 5 == 0;
        boolean divisibleBy6 = integer % 6 == 0;
        System.out.println("Is " + integer + " divisible by 5 and 6? " + (divisibleBy5 && divisibleBy6));
        System.out.println("Is " + integer + " divisible by 5 or 6? " + (divisibleBy5 || divisibleBy6));
        System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + (divisibleBy5 ^ divisibleBy6));
    }
}
