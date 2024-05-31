package Chapter05;

public class Exercise39 {
    public static void main(String[] args) {
        double tabanMaas = 5000;
        double hedefKazanc = 30000;
        double hedefKomisyon = hedefKazanc - tabanMaas;
        double satisMiktari = 0;
        double komisyon;

        while (true) {
            if (satisMiktari <= 5000) komisyon = satisMiktari * 0.08;
            else if (satisMiktari <= 10000) komisyon = satisMiktari * 0.10;
            else komisyon = 5000 * 0.08 + 5000 * 0.10 + (satisMiktari - 10000) * 0.12;
            if (komisyon >= hedefKomisyon) {
                break;
            }
            satisMiktari += 0.01;
        }
        satisMiktari = Math.round(satisMiktari * 100.0) / 100.0;
        System.out.println("Yılda 30,000 $ kazanmak için gereken minimum satış miktarı: $" + satisMiktari);
    }
}
