package Chapter02;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double foot = input.nextDouble();
        double meters = foot * 0.305;
        System.out.println(foot + " feet is " + meters + " meters");

    }
}
