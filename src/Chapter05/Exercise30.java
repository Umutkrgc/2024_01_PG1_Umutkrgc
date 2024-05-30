package Chapter05;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amounts: ");
        double monthlySaving = input.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5 for 5%): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        input.close();

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        double totalAmount = 0;
        for (int i = 0; i < months; i++) {
            totalAmount = (totalAmount + monthlySaving) * (1 + monthlyInterestRate);
        }
        System.out.printf("After %d months, the account value is $%.2f%n", months, totalAmount);

    }
}
