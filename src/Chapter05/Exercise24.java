package Chapter05;

public class Exercise24 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 97; i += 2) {
            sum += (double) i / (i + 2);
        }
        System.out.println("Sum of the series: " + sum);
    }
}
