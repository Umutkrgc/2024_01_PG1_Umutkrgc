package Chapter04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a side: ");
        double s = input.nextDouble();
        double Area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + Area);
    }
}
