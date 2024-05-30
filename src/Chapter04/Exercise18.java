package Chapter04;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters (e.g., M1): ");
        String userInput = input.next();

        if (userInput.length() != 2) {
            System.out.println("Invalid input. Please enter exactly two characters.");
            return;
        }

        char major = Character.toUpperCase(userInput.charAt(0));
        char status = userInput.charAt(1);

        String majorName;
        switch (major) {
            case 'M':
                majorName = "Mathematics";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'I':
                majorName = "Information Technology";
                break;
            default:
                System.out.println("Invalid major characters.");
                return;
        }
        String statusName;
        switch (status) {
            case '1':
                statusName= "Freshman";
                break;
            case '2':
                statusName = "Sophomore";
                break;
            case '3':
                statusName = "Junior";
                break;
            case '4':
                statusName = "Senior";
                break;
            default:
                System.out.println("Invalid status character");
                return;
        }
        System.out.println(majorName + " " + statusName);
    }
}
