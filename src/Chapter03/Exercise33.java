package chapter03;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight and the price of first package: ");
        double weightPackage1 = input.nextDouble();
        double pricePackage1 = input.nextDouble();
        System.out.println("Please enter the weight and the price of second package:");
        double weightPackage2 = input.nextDouble();
        double pricePackage2 = input.nextDouble();

        double Package1 = pricePackage1 / weightPackage1;
        double Package2 = pricePackage2 / weightPackage2;
        if (Package2 == Package1) {
            System.out.println("Two packages have the same price.");
        } else if (Package2 > Package1) {
            System.out.println("Package 1 has a better price.");
        } else System.out.println("Package 2 has a better price.");
    }
}
