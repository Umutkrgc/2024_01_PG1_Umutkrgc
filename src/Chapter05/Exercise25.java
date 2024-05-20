package Chapter05;

public class Exercise25 {
    public static void main(String[] args) {
        int[] iterations = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};

        for (int i : iterations){
            double pi=0;
            for (int j=i; j<=i; j++){
                pi+=Math.pow(-1, j+1)/(2.0*j-1);
            }
            pi*=4;
            System.out.printf("i = %d için, pi ≈ %.10f\n", i, pi);
        }
    }
}
