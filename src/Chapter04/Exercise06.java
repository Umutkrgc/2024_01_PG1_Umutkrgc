package Chapter04;

import java.util.Random;

public class Exercise06 {
    public static void main(String[] args) {
        int radius = 40;

        Random random = new Random();

        double angle1 = random.nextDouble() * 2 * Math.PI;
        double angle2 = random.nextDouble() * 2 * Math.PI;
        double angle3 = random.nextDouble() * 2 * Math.PI;

        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double angleA = Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2));
        double angleB = Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3));
        double angleC = Math.acos((side3 * side3 + side1 * side1 - side2 * side2) / (2 * side3 * side1));

        angleA = Math.toDegrees(angleA);
        angleB = Math.toDegrees(angleB);
        angleC = Math.toDegrees(angleC);

        System.out.println("Angle A: " + angleA);
        System.out.println("Angle B: " + angleB);
        System.out.println("Angle C: " + angleC);


    }
}
