package Chapter04;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the number of sides of a regular polygon: ");
        double n = input.nextDouble();
        System.out.println("Please enter the sides of a regular polygon: ");
        double s = input.nextDouble();
        input.close();
        double Area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area of the polygon is: " +Area);
        //Not: çıktı farklı oluyor halbuki formulü aynı şekilde yazdım.
        // The area of the polygon is: 72.69017017488386 çıkıyor 74.69017017488385 olarak çıkması gerekirken
    }
}
