package Chapter04;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        input.close();

        if (decimal >= 0 && decimal <= 15) {
            char hex;
            if (decimal >= 0 && decimal <= 9) {
                hex = (char) (decimal + '0');
            } else {
                hex = (char) (decimal - 10 + 'A');
            }
            System.out.println("The hex value is " + hex);
        } else {
            System.out.println("Invalid input.");
        }
    }
}
