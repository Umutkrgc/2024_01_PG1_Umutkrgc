package Chapter04;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length from the center of a pentagon to the vertex: ");
        double r = input.nextDouble(); // r is the length from the center to a vertex
        double s = 2 * r * Math.sin(Math.PI / 5); //s is the length of the side
        double Area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f%n", Area);
    }
}
