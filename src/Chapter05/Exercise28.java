package Chapter05;

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int firstDayOfYear = input.nextInt();

        input.close();

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int dayCount = 0;

        for (int month = 0; month < 12; month++) {
            System.out.printf("%s 1, %d is %s\n", months[month], year, daysOfWeek[(firstDayOfYear - 1 + 7) % 7]); // +7 yaparak negatiften kurtariyoruz bu sayede dizi sinirlari icerisnde kaliyor

            firstDayOfYear = (firstDayOfYear + daysInMonth[month]) % 7;

            if (isLeapYear(year) && month == 1) {
                firstDayOfYear++;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


