package Chapter05;

public class Exercise12 {
    public static void main(String[] args) {
        final int TARGET_VALUE = 12000;

        int n = 0;

        while (n * n <= TARGET_VALUE) {
            n++;
        }

        System.out.println("The smallest integer n such that n^2 > 12000 is: " + n);
    }
}
