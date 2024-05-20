package Chapter06;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        long number = input.nextLong();
        input.close();

        System.out.println("Sum of digits: "+ sumDigits(number));
    }
    public static int sumDigits(long n){
        int sum=0;
        while (n != 0) {
            sum+= n%10;
            n /=10;
        }
        return sum;
    }

}
