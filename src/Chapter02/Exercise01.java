package chapter02;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celcius = input.nextDouble();
        double fahreneit = (9.0 / 5.0) * celcius + 32;
        System.out.println(celcius + "Celsius is " + fahreneit + "Fahreneit");

    }
}
