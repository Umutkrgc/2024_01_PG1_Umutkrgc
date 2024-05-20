package Chapter05;

public class Exercise33 {
    public static void main(String[] args) {
        for (int number = 1; number < 10000; number++) {
            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number");
            }
        }

    }

    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
