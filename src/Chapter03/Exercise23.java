package chapter03;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a point (x,y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if(Math.abs(x) < 5 && Math.abs(y) < 2.5){
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        }else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
