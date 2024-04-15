package Chapter05;

public class Exercise05 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;
        final double KILOGRAMS_PER_POUND = 1 / POUNDS_PER_KILOGRAM;

        System.out.println("Kilograms\tPounds\t\t|\tPounds\tKilograms");
        System.out.println("-----------------------------------------------");

        for (int kilograms = 1, pounds = 20; kilograms <= 199 && pounds <= 515; kilograms += 2, pounds += 5) {
            double poundsToKilograms = pounds * KILOGRAMS_PER_POUND;
            System.out.printf("%d\t\t%.1f\t\t|\t%d\t%.2f\n", kilograms, kilograms * POUNDS_PER_KILOGRAM, pounds, poundsToKilograms);
        }
    }
}
