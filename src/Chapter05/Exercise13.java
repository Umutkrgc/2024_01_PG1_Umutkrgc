package Chapter05;

public class Exercise13 {
    public static void main(String[] args) {
        final int TARGET_VALUE = 12000;

        int n = 0;

        while (n * n * n < TARGET_VALUE) {
            n++;
        }

        System.out.println("The largest integer n such that n^3 is less than " + TARGET_VALUE + " is: " + (n - 1));

    }
}
