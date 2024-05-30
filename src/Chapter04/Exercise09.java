package Chapter04;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        input.close();
        int num = (int) ch;
        System.out.println("The Unicode of '" + ch + "' is: " + num);
    }
}
