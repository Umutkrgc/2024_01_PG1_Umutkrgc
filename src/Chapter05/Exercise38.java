package Chapter05;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        input.close();

        if (decimal == 0) {
            System.out.println("Octal equivalent: 0");
            return;
        }

        StringBuilder octalBuilder = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 8;
            octalBuilder.append(remainder); // Add the remainder to the octal string
            decimal /= 8; // Divide decimal by 8 for the next iteration
        }

        System.out.println("Octal equivalent: " + octalBuilder.reverse().toString());

    }
}
