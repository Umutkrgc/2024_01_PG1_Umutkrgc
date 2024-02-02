public class PopulationProjection {
    public static void main(String[] args){
        int SECONDS_IN_YEAR = 365 * 24 * 60 * 60;
        int CURRENT_POPULATION = 312032486;

        int BIRTH_RATE = 7;
        int DEATH_RATE = 13;
        int IMMIGRANT_RATE = 45;

        // Calculate population projection for year 1
        int futurePopulation = CURRENT_POPULATION + (SECONDS_IN_YEAR / BIRTH_RATE) - (SECONDS_IN_YEAR / DEATH_RATE) + (SECONDS_IN_YEAR / IMMIGRANT_RATE);
        System.out.println("Year 1 population projection: " + futurePopulation);

        // Calculate population projection for year 2
        futurePopulation += (SECONDS_IN_YEAR / BIRTH_RATE) - (SECONDS_IN_YEAR / DEATH_RATE) + (SECONDS_IN_YEAR / IMMIGRANT_RATE);
        System.out.println("Year 2 population projection: " + futurePopulation);

        // Calculate population projection for year 3
        futurePopulation += (SECONDS_IN_YEAR / BIRTH_RATE) - (SECONDS_IN_YEAR / DEATH_RATE) + (SECONDS_IN_YEAR / IMMIGRANT_RATE);
        System.out.println("Year 3 population projection: " + futurePopulation);

        // Calculate population projection for year 4
        futurePopulation += (SECONDS_IN_YEAR / BIRTH_RATE) - (SECONDS_IN_YEAR / DEATH_RATE) + (SECONDS_IN_YEAR / IMMIGRANT_RATE);
        System.out.println("Year 4 population projection: " + futurePopulation);

        // Calculate population projection for year 5
        futurePopulation += (SECONDS_IN_YEAR / BIRTH_RATE) - (SECONDS_IN_YEAR / DEATH_RATE) + (SECONDS_IN_YEAR / IMMIGRANT_RATE);
        System.out.println("Year 5 population projection: " + futurePopulation);
    }
}
