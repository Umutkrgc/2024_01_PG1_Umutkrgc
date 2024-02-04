package Chapter02;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int numberOfYears = input.nextInt();
        int currentPopulation = 312032486;

        int futurePopulation = currentPopulation
                + (numberOfYears * (SECONDS_IN_YEAR / BIRTH_RATE))
                - (numberOfYears * (SECONDS_IN_YEAR / DEATH_RATE))
                + (numberOfYears * (SECONDS_IN_YEAR / IMMIGRANT_RATE));

        System.out.println("Population projection after " + numberOfYears + " years: " + futurePopulation);


    }

    private static final int SECONDS_IN_YEAR = 365 * 24 * 60 * 60;
    private static final int BIRTH_RATE = 7;
    private static final int DEATH_RATE = 13;
    private static final int IMMIGRANT_RATE = 45;
}
