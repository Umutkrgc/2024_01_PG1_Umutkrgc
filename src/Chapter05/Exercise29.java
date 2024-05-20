package Chapter05;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int firstDayOfYear = input.nextInt();

        input.close();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        for (int month = 0; month < 12; month++) {
            System.out.println("\n" + months[month] + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < (firstDayOfYear % 7); i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= daysInMonth[month]; day++) {
                System.out.printf("%4d", day);

                if (((firstDayOfYear + day) % 7 == 0) || (day == daysInMonth[month])) {
                    System.out.println();
                }
            }

            firstDayOfYear = (firstDayOfYear + daysInMonth[month]) % 7;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}