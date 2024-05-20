package Chapter05;

public class Exercise27 {
    public static void main(String[] args) {
        int count=0;

        for (int year =101; year<=2100; year++){

            boolean isLeap = (year % 4 == 0 && year % 100 !=0)||(year%400==0);
            if (isLeap) {
                System.out.printf("%d ", year);
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n\nTotal number of leap years between 101 and 2100: " + count);
    }
}
