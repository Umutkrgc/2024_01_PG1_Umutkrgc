package Chapter05;

public class Exercise43 {
    public static void main(String[] args) {
        int totalCombination = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.println(i + "  " + j);
                totalCombination++;
            }
        }
        System.out.println("The total number of all combinations is: " + totalCombination);
    }
}
