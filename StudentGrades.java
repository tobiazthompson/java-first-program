import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Store scores for 5 students and 3 courses
        int[][] scores = new int[5][3];

        // Enter student scores
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 3; col++) {

                System.out.print("Enter score for Student "
                        + (row + 1) + ", Course " + (col + 1) + ": ");

                scores[row][col] = input.nextInt();
            }
        }

        // Display student scores
        System.out.println("\nStudent Scores:");

        for (int row = 0; row < 5; row++) {
            System.out.print("Student " + (row + 1) + "\t");

            for (int col = 0; col < 3; col++) {
                System.out.print(scores[row][col] + "\t");
            }

            System.out.println();
        }

        // Calculate student averages
        System.out.println("\nStudent Averages:");

        for (int row = 0; row < 5; row++) {

            int total = 0;

            for (int col = 0; col < 3; col++) {
                total += scores[row][col];
            }

            double average = total / 3.0;

            System.out.println("Student " + (row + 1)
                    + ": " + average);
        }

        // Calculate course averages
        System.out.println("\nCourse Averages:");

        for (int col = 0; col < 3; col++) {

            int total = 0;

            for (int row = 0; row < 5; row++) {
                total += scores[row][col];
            }

            double average = total / 5.0;

            System.out.println("Course " + (col + 1)
                    + ": " + average);
        }

        // Find highest score
        int highest = scores[0][0];

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 3; col++) {

                if (scores[row][col] > highest) {
                    highest = scores[row][col];
                }
            }
        }

        System.out.println("\nHighest Score: " + highest);
    }
}
