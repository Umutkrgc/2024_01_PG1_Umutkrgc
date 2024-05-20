package Chapter05;

import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        // Close the scanner
        input.close();

        // Handle the special case of 0 separately
        if (decimal == 0) {
            System.out.println("Binary equivalent: 0");
            return;
        }

        StringBuilder binaryBuilder = new StringBuilder();

        // Convert decimal to binary by repeatedly dividing by 2
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryBuilder.append(remainder); // Add the remainder to the binary string
            decimal /= 2; // Divide decimal by 2 for the next iteration
        }

        // Reverse the binary string and display the result
        System.out.println("Binary equivalent: " + binaryBuilder.reverse().toString());

    }
}
