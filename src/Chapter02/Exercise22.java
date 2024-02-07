package Chapter02;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your money with the last 2 digits in fractions : ");

        int amount = input.nextInt();

        input.close();

        double dollars= amount/100;
        double cent = amount % 100;

        System.out.println(dollars+" dollars "+cent+" cent");
    }
}
// dogru bir cozum mu ?