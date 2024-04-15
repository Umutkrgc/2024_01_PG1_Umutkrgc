package Chapter05;

public class Exercise06 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;
        final double MILES_PER_KILOMETER = 1 / KILOMETERS_PER_MILE;

        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        System.out.println("----------------------------------------------");

        for (int miles = 1, kilometers = 20; miles <= 10 && kilometers <= 65; miles++, kilometers += 5) {
            double kilometersToMiles = kilometers * MILES_PER_KILOMETER;
            System.out.printf("%d\t\t%.3f\t\t|\t%d\t\t%.3f\n", miles, miles * KILOMETERS_PER_MILE, kilometers, kilometersToMiles);
        }
    }
}
