package chapter03;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int) (Math.random()*2);
        System.out.print("Enter your guess (0 for heads, 1 for tails): ");
        int guess = input.nextInt();
        System.out.println(num);
        switch (guess){
            case 0:
                if (guess == num) {
                    System.out.println("Congratulations! The result is heads.");
                }else {
                    System.out.println("Sorry, the result is tails.");
                }
                break;
            case 1:
                if (guess == num) {
                    System.out.println("Congratulations! The result is tails.");
                } else {
                    System.out.println("Sorry, the result is heads.");
                }
                break;
            default:
                System.out.println("Invalid input!!");
        }
    }
}
