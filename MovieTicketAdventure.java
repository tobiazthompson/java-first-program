import java.util.Scanner;

public class MovieTicketAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the customer's age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Determine the ticket price category
        if (age < 12) {
            System.out.println("Child Discount");
        } else {
            if (age <= 18) {

                // Ask if the customer has a student ID
                System.out.print("Do you have a student ID? (1 = Yes, 2 = No): ");
                int studentID = input.nextInt();

                if (studentID == 1) {
                    System.out.println("Student Discount");
                } else {
                    System.out.println("Full Price");
                }

            } else {

                // Ask if today is Wednesday
                System.out.print("Is today Wednesday? (1 = Yes, 2 = No): ");
                int wednesday = input.nextInt();

                if (wednesday == 1) {
                    System.out.println("Mid-Week Discount");
                } else {
                    System.out.println("Full Price");
                }
            }
        }

        input.close();
    }
}