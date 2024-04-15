package Chapter05;

public class Exercise03 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;

        System.out.println("Kilograms\tPounds");
        System.out.println("-------------------");

        for (int kilograms = 1; kilograms <= 199; kilograms += 2) {
            double pounds = kilograms * POUNDS_PER_KILOGRAM;
            System.out.printf("%d\t\t%.1f\n", kilograms, pounds);//isin sekil kismi chatgpt ile yapildi
        }
    }
}
