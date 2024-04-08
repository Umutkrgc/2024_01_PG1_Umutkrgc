package Chapter04;

import java.util.Scanner;
import static java.lang.Math.*;
public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first point coordinate (x1,y1): ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());
        System.out.println("Please enter the second point coordinate (x2,y2): ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());
        input.close();
        double radius = 6371.01;   // Earth's radius in kilometers
        double d = radius * Math.acos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));
        System.out.printf("The distance between the two points is %.2f km\n", d);
    }
}
