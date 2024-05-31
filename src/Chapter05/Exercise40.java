package Chapter05;

import java.util.Random;

public class Exercise40 {
    public static void main(String[] args) {
        int times = 0;
        int head = 0;
        int tail = 0;
        Random random = new Random();
        while (true) {
            int randomInt = random.nextInt(2) + 1;
            if (randomInt == 1) {
                head += 1;
            } else {
                tail += 1;
            }
            if (times == 1000000) {
                break;
            }
            times += 1;
        }

        System.out.println("head: " + head + " and tail: " + tail);
    }
}
