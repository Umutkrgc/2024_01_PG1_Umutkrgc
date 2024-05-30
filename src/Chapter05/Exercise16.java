package Chapter05;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Integer : ");
        int num = input.nextInt();

        System.out.print(num + " the least divisors of the number: ");
        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                System.out.print(factor);
                num /= factor;
                if (num != 1) {
                    System.out.print(", ");
                }
            } else {
                factor++;
            }
        }
        input.close();
    }
}
