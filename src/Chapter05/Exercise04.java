package Chapter05;

public class Exercise04 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;

        System.out.println("Miles\tKilometers");
        System.out.println("------------------");

        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * KILOMETERS_PER_MILE;
            System.out.printf("%d\t\t%.3f\n", miles, kilometers);
        }
    }
}
