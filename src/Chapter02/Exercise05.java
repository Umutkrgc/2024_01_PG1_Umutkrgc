package Chapter02;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subTotal = input.nextDouble();
        double graturityRate = input.nextDouble();
        double graturity = (subTotal/100)*graturityRate;
        double total = subTotal + graturity ;
        System.out.println("The gratuity is $" + graturity + " and total is $" + total);
    }

}
