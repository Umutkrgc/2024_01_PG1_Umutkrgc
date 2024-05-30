package Chapter04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String[] cities = {city1, city2, city3};
        Arrays.sort(cities);

        System.out.print("The three cities in alphabetical order are ");
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i]);
            if (i < cities.length - 1){
                System.out.print(" ");
            }
        }

    }
}
