package Chapter02;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v0, v1, and t: ");
        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();
        double time = input.nextDouble();
        double average = (velocity1 - velocity0) / time;
        System.out.println("The average acceleration is " + average);
    }
}
