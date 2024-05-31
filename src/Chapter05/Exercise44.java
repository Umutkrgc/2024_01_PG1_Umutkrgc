package Chapter05;

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        short num = input.nextShort();

        System.out.println("The bits are ");
        for (int i = 15; i >= 0; i--) {
            int bit = (num >> i) & 1;
            System.out.print(bit);
        }
    }
}
