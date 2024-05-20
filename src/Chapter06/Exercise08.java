package Chapter06;

public class Exercise08 {
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("------------------------");
        for (double celsius = 40.0; celsius >= 32.0; celsius--) {
            System.out.printf("%.1f\t\t%.1f\n", celsius, celsiusToFahrenheit(celsius));
        }

        System.out.println("\nFahrenheit\tCelsius");
        System.out.println("------------------------");
        for (double fahrenheit = 120.0; fahrenheit >= 30.0; fahrenheit -= 10) {
            System.out.printf("%.1f\t\t%.2f\n", fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }
}
//tekrar bak