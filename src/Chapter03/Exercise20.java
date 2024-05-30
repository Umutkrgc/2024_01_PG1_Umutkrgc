package chapter03;


import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double outSideFahrenheit = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();

        // twc = 35.74 + 0.6215 ta - 35.75v0.16 + 0.4275tav0.16

        double windChillTemperature = 35.74 + 0.6215 * outSideFahrenheit
                - 35.75 * Math.pow(speed, 0.16) + 0.4275 * outSideFahrenheit * Math.pow(speed, 0.16);

        if (-58 < outSideFahrenheit && outSideFahrenheit < 41 && speed >= 2)
            System.out.println("The wind chill index is " + windChillTemperature);
        else
            System.out.println("Invalid value");
    }
}
