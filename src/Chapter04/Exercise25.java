package Chapter04;

import java.util.Random;

public class Exercise25 {
    public static void main(String[] args) {
        Random random = new Random();

        String plateNumber = "";
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            plateNumber += letter;
        }

        for (int i = 0; i < 4; i++) {
            int digit = random.nextInt(10);
            plateNumber += digit;
        }

        System.out.println("Generated Plate Number: " + plateNumber);
    }
}
