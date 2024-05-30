package Chapter06;

public class Exercise06 {
    public static void main(String[] args) {
        displayPattern(9);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces before numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in descending order
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println(); // Move to the next line
        }
    }

}
//9 a kadar hatasiz calisiyor :D