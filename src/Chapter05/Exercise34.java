package Chapter05;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;

        while (Math.abs(userWins - computerWins) <= 2) {
            int computer = (int)(Math.random() * 3);

            System.out.print("Enter a number (0: scissor, 1: rock, 2: paper): ");
            int user = input.nextInt();

            System.out.println("The computer is " + choiceName(computer) + ". You are " + choiceName(user) + ".");

            if (user == computer) {
                System.out.println("It's a draw!");
            } else if ((user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1)) {
                System.out.println("You win!");
                userWins++;
            } else {
                System.out.println("You lose!");
                computerWins++;
            }

            System.out.println("Score: You - " + userWins + " | Computer - " + computerWins);
        }

        input.close();

        if (userWins > computerWins) {
            System.out.println("Congratulations! You are the overall winner.");
        } else {
            System.out.println("Sorry! The computer is the overall winner.");
        }
    }

    public static String choiceName(int choice) {
        switch (choice) {
            case 0: return "scissor";
            case 1: return "rock";
            case 2: return "paper";
            default: return "invalid";
        }
    }
}

