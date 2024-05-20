package Chapter05;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for loan amount and loan period
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Number of Years: ");
        int loanPeriodYears = scanner.nextInt();

        scanner.close();

        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");

        // Calculate and display payments for each interest rate from 5% to 8%
        double interestRate = 5.0;
        while (interestRate <= 8.0) {
            double monthlyRate = interestRate / 100 / 12;
            int loanMonths = loanPeriodYears * 12;

            double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanMonths));
            double totalPayment = monthlyPayment * loanMonths;

            System.out.printf("%.3f%%\t\t%.2f\t\t%.2f%n", interestRate, monthlyPayment, totalPayment);

            // Increase interest rate by 1/8 (0.125)
            interestRate += 0.125;
        }
    }
}
