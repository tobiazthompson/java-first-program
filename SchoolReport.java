import java.util.Scanner;

public class SchoolReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for student's average grade
        System.out.print("Enter student's average grade: ");
        double average = input.nextDouble();

        // Evaluate the grade
        if (average > 90) {
            System.out.println("Grade: Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: Good");
        } else {
            System.out.println("Grade: Needs Improvement");
        }

        // Get the subject
        System.out.print("Enter subject code (1-Math, 2-Science, 3-English): ");
        int subjectCode = input.nextInt();

        // Determine the subject
        switch (subjectCode) {
            case 1:
                System.out.println("Subject: Math");
                break;

            case 2:
                System.out.println("Subject: Science");
                break;

            case 3:
                System.out.println("Subject: English");
                break;

            default:
                System.out.println("Subject: Invalid subject code");
        }

        input.close();
    }
