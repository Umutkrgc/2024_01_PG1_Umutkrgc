package Chapter02;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double outSideFahrenheit = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();
        double windChillTemperature = 35.74 + 0.6215 * outSideFahrenheit - 33.75 * Math.pow(speed, 0.16) + 0.4275 * outSideFahrenheit * Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + windChillTemperature);
    }
}
//hata