package Chapter02;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMillisecond = System.currentTimeMillis();
        long totalSeconds = totalMillisecond / 100;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;

        System.out.println("Current time in GMT" + offset + " is " + currentHour + ":" + currentMinute + ":" + currentSecond);
        //dogrulugundan emin degilim.
    }
}
