package Chapter07;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] counts = new int[100];//tum degerler 0 dan baslatiliyor

        System.out.print("Enter the integers between 1 and 100 (end with 0): ");
        while (true) {
            int number = input.nextInt();
            if (number == 0)
                break;
            if (number >= 1 && number <= 100)
                counts[number - 1]++;//degerini arttirdik
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }
        input.close();
    }
}
//dizideki tekrari sayamak counts[]++