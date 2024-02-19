package chapter03;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11,56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consist of");
        if (numberOfDollars % 2 == 0)
            System.out.println(numberOfDollars + " dollars");
        else
            System.out.println(numberOfDollars + " dollar");

        if (numberOfQuarters % 2 == 0)
            System.out.println(numberOfQuarters + " quarters");
        else
            System.out.println(numberOfQuarters + " quarter");

        if (numberOfDimes % 2 == 0)
            System.out.println(numberOfDimes + " dimes");
        else
            System.out.println(numberOfDimes + "dime");

        if (numberOfNickels % 2 == 0)
            System.out.println(numberOfNickels + " nickels");
        else
            System.out.println(numberOfNickels + " nickel");

        if (numberOfPennies % 2 == 0)
            System.out.println(numberOfPennies + " pennies");
        else
            System.out.println(numberOfPennies + " penny");
    }
}
