package chapter03;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today`s day :");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today :");
        int daysElapsed = input.nextInt();

        int futureDay = ((today + daysElapsed) % 7);

        String dayName = "";
        switch (futureDay) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
        }
        System.out.println("Today is " + todayName(today) + " and the future day is " + dayName);
    }

    public static String todayName(int dayNumber) {
        switch (dayNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Invalid Day";
        }
    }
}
