package Chapter05;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numLines;
        do {
            System.out.print("Enter the number of lines (1 to 15): ");
            numLines = input.nextInt();
        } while (numLines < 1 || numLines > 15);

        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= numLines - i; j++) {
                System.out.println(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2 ; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
