package Chapter05;

public class Exercise20 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
