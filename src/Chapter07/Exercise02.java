package Chapter07;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("enter  number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
            System.out.println();
        }
        System.out.println("Numbers in reverse order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        input.close();
    }
}
