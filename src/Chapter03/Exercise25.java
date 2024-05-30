package chapter03;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        // Prompt the user to enter four points
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first point on line1 (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Please enter the second point on line1 (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Please enter the first point on line2 (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Please enter the second point on line2 (x4, y4): ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Calculate the intersecting point
        // Get a, b, c, d, e, f
        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        if ((a * d - b * c) == 0) {
            System.out.println("The lines are parallel.");
        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
}
