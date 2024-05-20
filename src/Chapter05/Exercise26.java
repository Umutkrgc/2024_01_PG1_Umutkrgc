package Chapter05;

public class Exercise26 {
    public static void main(String[] args) {
        int[] iterations = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};

        for (int i : iterations) {
            double e = 1.0;
            double item = 1.0;

            for (int j = 1; j <= i; j++) {
                item /= j;
                e += item;
            }

            System.out.printf("For i = %d, e ≈ %.10f\n", i, e);
        }
    }
}
