package Chapter02;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        long minutes = input.nextLong();
        // 1 day = 1440 minutes
        // 365 day (1 year) = 525.600 minutes
        long minutesInYear = 365 * 24 * 60;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / (24 * 60);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
