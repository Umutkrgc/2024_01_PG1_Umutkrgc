package Chapter04;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();

        month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

        int days = 0;

        switch (month) {
            case "Jan":
                days = 31;
                break;
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    days = 29;
                else
                    days = 28;
                break;
            case "Mar":
                days = 31;
                break;
            case "Apr":
                days = 30;
                break;
            case "May":
                days = 31;
                break;
            case "Jun":
                days = 30;
                break;
            case "Jul":
                days = 31;
                break;
            case "Aug":
                days = 30;
                break;
            case "Sep":
                days = 31;
                break;
            case "Oct":
                days = 30;
                break;
            case "Nov":
                days = 31;
                break;
            case "Dec":
                days = 30;
                break;
            default:
                System.out.println("Invalid month input");
                System.exit(1);
        }
        System.out.println(month + " " + year + " has " + days + " days.");
    }
}
