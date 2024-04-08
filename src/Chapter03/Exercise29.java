package chapter03;

import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter circle1's center x-, y-coordinates, and radius:");
        double circle1CenterXCoordinates = input.nextDouble();
        double circle1CenterYCoordinates = input.nextDouble();
        double circle1Radius = input.nextDouble();
        System.out.println("Please enter circle2's center x-, y-coordinates, and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double circle2Radius = input.nextDouble();
        input.close();
        if ( Math.abs(circle1Radius - circle2Radius) == 6 ){
            System.out.println("");
        }

    }
}
