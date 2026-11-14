import java.util.Scanner;

public class ClassroomSeating {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] seats = new String[4][5];

        // Enter student names
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("Enter name for Row " + (row + 1)
                        + ", Seat " + (col + 1) + ": ");
                seats[row][col] = input.nextLine();
            }
        }

        // Display seating arrangement
        System.out.println("\nClassroom Seating Arrangement:");

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(seats[row][col] + "\t");
            }
            System.out.println();
        }

        // Search for a student's seat
        System.out.print("\nEnter row number (1-4): ");
        int rowNumber = input.nextInt();

        System.out.print("Enter column number (1-5): ");
        int colNumber = input.nextInt();

        System.out.println("Student seated there: "
                + seats[rowNumber - 1][colNumber - 1]);
    }
}
