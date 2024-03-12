package chapter03;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 3);

        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");
        int move = input.nextInt();

        System.out.println(num);

        switch (num) {
            case 0:
                if (move == 0) {
                    System.out.println("The computer is scissor . You are scissor too. It is a draw");
                } else if (move == 1) {
                    System.out.println("The computer is scissor . You are rock. You won");
                } else {
                    System.out.println("The computer is scissor . You are paper. You lost");
                }
                break;
            case 1:
                if (move == 0) {
                    System.out.println("The computer is rock . You are scissor . You lost");
                } else if (move == 1) {
                    System.out.println("The computer is rock . You are rock too. It is a draw");
                } else {
                    System.out.println("The computer is rock . You are paper. You won");
                }
                break;
            case 2:
                if (move == 0) {
                    System.out.println("The computer is paper . You are scissor . You won");
                } else if (move == 1) {
                    System.out.println("The computer is paper . You are rock . You lost");
                } else {
                    System.out.println("The computer is paper . You are paper too. It is a draw");
                }
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
