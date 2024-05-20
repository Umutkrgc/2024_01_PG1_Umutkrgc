package Chapter06;

public class Exercise01 {
    public static void main(String[] args) {
        final int Number_Per_Line=10;
        for (int i=1; i<=100; i++){
            System.out.printf("%7d",getPentagonalNumber(i));
            if (i%Number_Per_Line==0){
                System.out.println();
            }
        }
    }
    public static int getPentagonalNumber(int n){
        return n*(3 * n - 1) / 2;
    }
}
