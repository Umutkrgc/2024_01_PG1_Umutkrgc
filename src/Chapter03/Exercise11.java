package chapter03;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month and year (eg: 3 2006): ");
        int month = input.nextInt();
        int year = input.nextInt();

        int daysInMonths;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                daysInMonths = 31;
                break;
            case 4, 6, 9, 11:
                daysInMonths = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonths = 29;
                } else {
                    daysInMonths = 28;
                }
                break;
            default:
                daysInMonths = -1;
        }

        if (daysInMonths == -1) {
            System.out.println("Invalid month entered.");
        } else {
            System.out.println(month + " " + year + " had " + daysInMonths + " days.");
        }
    }
}
