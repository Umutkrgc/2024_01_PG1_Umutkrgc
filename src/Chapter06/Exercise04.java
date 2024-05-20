package Chapter06;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Reversed integer: ");
        reverse(number);

        input.close();
    }

    public static void reverse(int number){
        String numberStr= Integer.toString(number);

        for (int i= numberStr.length()-1;i>=0;i--){
            System.out.print(numberStr.charAt(i));
        }
        System.out.println();
    }
}
