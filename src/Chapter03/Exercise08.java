package chapter03;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integer number : ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();

        int min, middle, max;

        if (firstNum <= secondNum && firstNum <= thirdNum) {
            min = firstNum;
            if (secondNum <= thirdNum) {
                middle = secondNum;
                max = thirdNum;
            } else {
                middle = thirdNum;
                max = secondNum;
            }
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            min = secondNum;
            if (firstNum <= thirdNum) {
                middle = firstNum;
                max = thirdNum;
            } else {
                middle = thirdNum;
                max = firstNum;
            }
        } else {
            min = thirdNum;
            if (firstNum <= secondNum) {
                middle = firstNum;
                max = secondNum;
            } else {
                middle = secondNum;
                max = firstNum;
            }
        }
        System.out.println("Integers in non-decreasing order:");
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);


    }
}
