package Chapter07;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAX_SCORES = 100;
        int[] scores = new int[MAX_SCORES];
        int count = 0;
        int sum = 0;

        System.out.println("Enter the scores (negative number to end): ");
        while (true) {
            int score = input.nextInt();
            if (score < 0)
                break;
            if (count < MAX_SCORES) {
                scores[count] = score;
                sum += score;
                count++;
            } else {
                System.out.println("Maximum number of scores reached.");
                break;
            }

        }

        double average = sum / (double) count;

        int aboveOrEqualCount = 0;
        int belowCount = 0;
        for (int i = 0; i < count; i++) {
            if (scores[i] >= average)
                aboveOrEqualCount++;
            else
                belowCount++;
        }
        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of scores below the average: " + belowCount);

        input.close();

    }

}
