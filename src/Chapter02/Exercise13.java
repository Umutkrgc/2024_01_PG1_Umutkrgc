package chapter02;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double amount = input.nextDouble();
        double monthlyRate = 0.05 / 12;
        // System.out.println(monthlyRate); /checkpoint
        double monthlySave = 1 + monthlyRate;
        double totalValue0 = amount * monthlySave;
        double totalValue1 = (amount + totalValue0) * monthlySave;
        double totalValue2 = (amount + totalValue1) * monthlySave;
        double totalValue3 = (amount + totalValue2) * monthlySave;
        double totalValue4 = (amount + totalValue3) * monthlySave;
        double totalValue5 = (amount + totalValue4) * monthlySave;

        System.out.println("After the sixth month, the account value is $" + totalValue5);

    }
}
