package Chapter05;

public class Exercise19 {
    public static void main(String[] args) {
        int rows1 = 6;
        for (int i = 1; i <= rows1; i++) {
            for (int j = 1; j <= rows1 - i; j++) {
                System.out.print("  ");//bosluklar
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");//sol ucgen
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");//sag ucgen
            }
            System.out.println();
        }


    }
}
