package Chapter05;

public class Exercise18 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }//A
        System.out.println();

        int rows0 = 6;
        for (int i = rows0; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }//B
        System.out.println();
        int rows1 = 6;
        for (int i = 1; i <= rows1; i++) {
            for (int j = 1; j <= rows1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }//C
        System.out.println();
        int rows2 = 6;
        for (int i = rows2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }//D
    }
}
