package Chapter05;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = 0;
        int count = 0;
        System.out.print("Enter numbers: ");

        while (true) {
            int num = input.nextInt();
            if (num > max){
                max = num;
                count = 1;
            } else if (num == max) {
                count ++;
            }
            if (num == 0) break;
        }

        System.out.println("The largest number is: " + max);
        System.out.println("The occurence count of the largest number is: " + count);
    }
}
