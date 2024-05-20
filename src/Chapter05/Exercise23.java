package Chapter05;

public class Exercise23 {
    public static void main(String[] args) {
        int n = 50000;

        // Soldan sağa doğru toplama işlemi
        double sumLeftToRight = 0.0;
        for (int i = 1; i <= n; i++) {
            sumLeftToRight += 1.0 / i;
        }

        // Sağdan sola doğru toplama işlemi
        double sumRightToLeft = 0.0;
        for (int i = n; i >= 1; i--) {
            sumRightToLeft += 1.0 / i;
        }

        // Sonuçları karşılaştırma
        System.out.println("Soldan sağa toplama sonucu: " + sumLeftToRight);
        System.out.println("Sağdan sola toplama sonucu: " + sumRightToLeft);
    }
}
