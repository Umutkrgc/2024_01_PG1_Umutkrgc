package Chapter04;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN (DDD-DD-DDDD): ");
        String ssn = input.nextLine();

        // Girilen SSN'nin uzunluğunu kontrol et
        if (ssn.length() != 11) {
            System.out.println(ssn + " geçersiz bir sosyal güvenlik numarasıdır.");
            return;
        }

        // Tirelerin doğru pozisyonda olup olmadığını kontrol et
        if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            System.out.println(ssn + " geçersiz bir sosyal güvenlik numarasıdır.");
            return;
        }

        // Tüm karakterlerin rakam olup olmadığını kontrol et
        for (int i = 0; i < ssn.length(); i++) {
            if (i != 3 && i != 6 && !Character.isDigit(ssn.charAt(i))) {
                System.out.println(ssn + " geçersiz bir sosyal güvenlik numarasıdır.");
                return;
            }
        }

        // Eğer yukarıdaki koşullar sağlanıyorsa, SSN geçerli kabul edilir
        System.out.println(ssn + " geçerli bir sosyal güvenlik numarasıdır.");

        input.close();
    }
}
