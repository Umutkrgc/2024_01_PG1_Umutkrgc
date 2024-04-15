package Chapter05;

public class Exercise07 {
    public static void main(String[] args) {
        final double INITIAL_TUITION = 10000.0;
        final double TUITION_INCREASE_RATE = 0.05;
        final int YEARS = 10;
        final int FOUR_YEARS = 4;

        double tuition = INITIAL_TUITION;
        double totalCostFourYears = 0.0;

        for (int year = 1; year <= YEARS; year++) {
            tuition += tuition * TUITION_INCREASE_RATE;
            if (year > YEARS - FOUR_YEARS) {
                totalCostFourYears += tuition;
            }
        }

        System.out.printf("Tuition in ten years: $%.2f\n", tuition);
        System.out.printf("Total cost of four years' worth of tuition after the tenth year: $%.2f\n", totalCostFourYears);
    }

}
