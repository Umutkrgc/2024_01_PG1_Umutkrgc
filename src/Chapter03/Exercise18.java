package chapter03;

import java.io.Console;
import java.util.Scanner;


public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight: ");
        double weight = input.nextDouble();
        if (weight > 0 && weight <= 1)
            System.out.println("You will pay 3.5$");
        else if (weight > 1 && weight <= 3) {
            System.out.println("You will pay 5.5$");
        } else if (weight > 3 && weight <= 10) {
            System.out.println("You will pay 8.5$");
        } else if (weight > 10 && weight <= 20) {
            System.out.println("You will pay 10.5$");
        } else
            System.out.println("the package cannot be shipped.");
    }
}
