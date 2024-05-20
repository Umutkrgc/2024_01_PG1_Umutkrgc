package Chapter05;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double initialDeposit = input.nextDouble();

        System.out.print("Enter annual percentage yield (e.g., 5.75): ");
        double annualPercentageYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        input.close();

        double monthlyInterestRate = annualPercentageYield / 100 / 12;

        System.out.println("Month\tCD Value");

        double cdValue = initialDeposit;
        for (int month = 1; month <= months; month++) {
            cdValue = cdValue + cdValue * monthlyInterestRate;
            System.out.printf("%d\t%.2f%n", month, cdValue);
        }
    }
}
