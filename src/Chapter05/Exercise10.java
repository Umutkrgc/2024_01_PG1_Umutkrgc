package Chapter05;

public class Exercise10 {
    public static void main(String[] args) {
        final int START_NUMBER = 100;
        final int END_NUMBER = 1000;
        final int NUMBERS_PER_LINE = 10;

        int number = START_NUMBER;
        int count = 0;

        while (number <= END_NUMBER) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                count++;

                if (count == NUMBERS_PER_LINE) {
                    System.out.println();
                    count = 0;
                }
            }

            number++;
        }
    }
}
