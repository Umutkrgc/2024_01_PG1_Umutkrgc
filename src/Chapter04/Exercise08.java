package Chapter04;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int asci = input.nextInt();
        char ch = (char) asci;
        System.out.println("The chareacter for ASCII code " + asci + " is " + ch);
    }
}
