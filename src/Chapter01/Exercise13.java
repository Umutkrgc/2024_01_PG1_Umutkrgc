package chapter01;

public class Exercise13 {
    public static void main(String[] args) {
        //Write a program that solves the following equation and displays the value for x and y
        // 3.4x + 50.2y = 44.5
        // 2.1x + 0.55y = 5.9
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);

        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println(" x değeri = " + x);

        System.out.println(" y değeri = " + y);
    }
}
