package chapter03;

import java.util.Random;

public class Exercise16 {
    public static void main(String[] args) {
        int centerX = 0;
        int centerY = 0;
        int width = 100;
        int height = 200;

        Random random = new Random();
        int randomX = centerX - width / 2 + random.nextInt(width);
        int randomY = centerY - width / 2 + random.nextInt(height);

        System.out.println("Random Coordinate in Rectangle:");
        System.out.println("(" + randomX + ", " + randomY + ")");
    }
}
