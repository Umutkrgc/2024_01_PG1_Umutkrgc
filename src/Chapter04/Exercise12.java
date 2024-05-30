package Chapter04;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        char hexDigit = input.next().charAt(0);
        input.close();

        String binaryValue = "";
        if (hexDigit == '0') binaryValue = "0000";
        else if (hexDigit == '1') binaryValue = "0001";
        else if (hexDigit == '2') binaryValue = "0010";
        else if (hexDigit == '3') binaryValue = "0011";
        else if (hexDigit == '4') binaryValue = "0100";
        else if (hexDigit == '5') binaryValue = "0101";
        else if (hexDigit == '6') binaryValue = "0110";
        else if (hexDigit == '7') binaryValue = "0111";
        else if (hexDigit == '8') binaryValue = "1000";
        else if (hexDigit == '9') binaryValue = "1001";
        else if (hexDigit == 'A' || hexDigit == 'a') binaryValue = "1010";
        else if (hexDigit == 'B' || hexDigit == 'b') binaryValue = "1011";
        else if (hexDigit == 'C' || hexDigit == 'c') binaryValue = "1100";
        else if (hexDigit == 'D' || hexDigit == 'd') binaryValue = "1101";
        else if (hexDigit == 'E' || hexDigit == 'e') binaryValue = "1110";
        else if (hexDigit == 'F' || hexDigit == 'f') binaryValue = "1111";
        else {
            System.out.println(hexDigit + " is an invalid input.");
            return;
        }
        System.out.println("The binary value is " + binaryValue);
    }
}
