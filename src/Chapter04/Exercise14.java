package Chapter04;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade : ");
        char grade = input.next().toUpperCase().charAt(0);

        int numericValue = -1;
        if (grade == 'A') numericValue = 4;
        else if (grade == 'B') numericValue = 3;
        else if (grade == 'C') numericValue = 2;
        else if (grade == 'D') numericValue = 1;
        else if (grade == 'F') numericValue = 0;
        else {
            System.out.println(grade + " is an invalid grade.");
            return;
        }
        System.out.println("The numeric value for grade " + grade + " is " + numericValue + ".");
    }
}
