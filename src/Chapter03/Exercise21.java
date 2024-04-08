package chapter03;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = input.nextInt();
        System.out.print("Please enter the month of the year: ");
        int month = input.nextInt();
        System.out.print("Please enter the day of the month: ");
        int day = input.nextInt();
        int q = day;
        int m = month;
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (m + 1)) / 10 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        String[] dayOfWeekNames = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String dayofWeek = dayOfWeekNames[h];
        System.out.println("Day of the week is " + dayofWeek);    }
}
