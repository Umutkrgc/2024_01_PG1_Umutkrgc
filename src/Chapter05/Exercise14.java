package Chapter05;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        do {
            System.out.print("Enter the first positive integer: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input.Please enter a valid integer.");
                input.next();
            }
            num1 = input.nextInt();

            System.out.print("Enter the second positive integer:");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input.Please enter a valid integer.");
                input.next();
            }
            num2 = input.nextInt();

            if(num1 <= 0 || num2 <= 0){
                System.out.println("Please enter positive integers only.");
            }
        }while (num1 <= 0 || num2 <= 0);

        int d = Math.min(num1,num2);
        while (d>=1){
            if (num1 % d ==0 && num2 % d == 0){
                System.out.printf("%d ve %d sayılarının en büyük ortak böleni %d'dir.%n", num1, num2, d);
                break;
            }
            d--;
        }
        input.close();
    }
}
