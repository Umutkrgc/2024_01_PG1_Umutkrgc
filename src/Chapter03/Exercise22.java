package chapter03;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a point (x,y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.sqrt((x * x) + ( y * y ));
        if(distance <= 10){
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        }else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }

    }
}
