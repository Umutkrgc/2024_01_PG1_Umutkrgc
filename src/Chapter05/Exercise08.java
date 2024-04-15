package Chapter05;
import java.util.Scanner;
public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int highestScore = Integer.MIN_VALUE;
        String studentWithHighestScore = "";

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter student " + i + "'s name: ");
            String studentName = input.next();

            System.out.print("Enter " + studentName + "'s score: ");
            int studentScore = input.nextInt();

            if (studentScore > highestScore) {
                highestScore = studentScore;
                studentWithHighestScore = studentName;
            }
        }

        input.close();

        System.out.println("The student with the highest score is: " + studentWithHighestScore);

    }
}
