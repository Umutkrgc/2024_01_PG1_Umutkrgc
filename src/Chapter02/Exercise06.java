package Chapter02;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int firstDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int thirdDigit = number % 10;
        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println("The sum of the digits is " + sum);

    }
}
