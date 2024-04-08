package chapter03;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 0 to convert USD to RMB, 1 for RMB to USD: ");
        int exchangeRate = input.nextInt();
        if (exchangeRate == 0  ){
            System.out.println("Please enter the amount rate in dollars: ");
            double rateDollar = input.nextDouble();
            double totalRBM =  rateDollar * exchangeRate;
            System.out.println(rateDollar + " is " + totalRBM + "yuan");
        }else if (exchangeRate == 1){
            System.out.println("Please enter the amount rate in RMB: ");
            double rateRBM = input.nextDouble();
            double totalDollar =  rateRBM / exchangeRate;
            System.out.println(rateRBM + " is " + totalDollar + "dollar");
        }else{
            System.out.println("Incorrect input");
        }
    }
}
