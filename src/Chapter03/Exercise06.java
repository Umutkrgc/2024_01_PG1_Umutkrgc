package chapter03;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter feet : ");
        double feet = input.nextDouble();

        System.out.print("Enter inches : ");
        double inches = input.nextDouble();

        final double weightKilograms = weightPounds * 0.453593;

        final double totalInch = (feet * 12) + inches;

        final double meters = totalInch * 0.0254;

        final double bmi = weightKilograms / Math.pow(meters, 2);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
