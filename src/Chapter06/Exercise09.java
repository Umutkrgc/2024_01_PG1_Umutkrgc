package Chapter06;

public class Exercise09 {
    /**
     * Convert from feet to meters
     */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /**
     * Convert from meters to feet
     */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println("Feet\t\tMeters");
        System.out.println("------------------------");
        for (double feet = 1.0; feet <= 10.0; feet++) {
            System.out.printf("%.1f\t\t%.3f\n", feet, footToMeter(feet));
        }

        System.out.println("\nMeters\t\tFeet");
        System.out.println("------------------------");
        for (double meters = 20.0; meters <= 65.0; meters += 5.0) {
            System.out.printf("%.1f\t\t%.3f\n", meters, meterToFoot(meters));
        }
    }
}
