package chapter03;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. edge: ");
        double edge1 = input.nextDouble();

        System.out.print("2. edge: ");
        double edge2 = input.nextDouble();

        System.out.print("3. edge: ");
        double edge3 = input.nextDouble();

        double perimeter = edge1 + edge2 + edge3;

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1)
            System.out.println("Perimeter is : " + perimeter);
        else
            System.out.println("Input is invalid");
    }
}
