package Chapter05;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int piece = 0;
        int positive = 0;
        int negative = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");
        int num;


        do {
            num = input.nextInt();
            if (num == 0) {
                if (piece == 0) {
                    System.out.println("No numbers are entered except 0");

                }
                break;
            } else {
                if (num < 0) {
                    negative += 1;
                } else {
                    positive += 1;
                }
                total += num;
                piece += 1;
            }
        } while (num != 0);

        double average = piece != 0 ? (double) total / piece : 0;

        System.out.println("Total: " + total);
        System.out.println("Positive numbers count: " + positive);
        System.out.println("Negative numbers count: " + negative);
        System.out.println("Average: " + average);

        input.close();
    }
}
