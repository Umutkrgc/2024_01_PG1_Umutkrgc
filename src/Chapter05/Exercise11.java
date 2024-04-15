package Chapter05;

public class Exercise11 {
    public static void main(String[] args) {
        final int START_NUMBER = 100;
        final int END_NUMBER = 200;
        final int NUMBERS_PER_LINE = 10;

        int count = 0;

        for (int number = START_NUMBER; number <= END_NUMBER; number++) {
            if ((number % 5 == 0 || number % 6 == 0) && !(number % 5 == 0 && number % 6 == 0)) {
                System.out.print(number + " ");
                count++;

                if (count == NUMBERS_PER_LINE) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
