package chapter03;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double point_x = input.nextDouble();
        double point_y = input.nextDouble();
        System.out.print("Enter a point's x- and y-coordinates: ");
        input.close();
        double point1_x = 0;
        double point1_y = 0;
        double point2_x = 200;
        double point2_y = 0;
        double point3_x = 0;
        double point3_y = 100;
        if (Math.abs(point_x) < point2_x && (Math.abs(point_y) < point3_y)) {
            System.out.println("The point is in the triangle");
        } else System.out.println("The point is not in the triangle");
    }
}
