package Chapter04;

public class Exercise16 {
    public static void main(String[] args) {
        int randomInt = (int) (Math.random() * 26);

        char randomChar = (char) ('A' + randomInt);

        System.out.println("Random uppercase letter: " + randomChar);
    }
}
