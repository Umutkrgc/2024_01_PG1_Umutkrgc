package Chapter04;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of bounding circle of a pentagon: ");
        double radius = input.nextDouble();
        input.close();

        double angle = Math.toRadians(360.0 / 5);
        for (int i = 0; i < 5; i++) {
            double x = radius * Math.sin(i * angle);
            double y = radius * Math.cos(i * angle);
            System.out.println("Corner " + (i + 1) + " coordinate: (" + x + " , " + y + ")");
        }
    }
}
