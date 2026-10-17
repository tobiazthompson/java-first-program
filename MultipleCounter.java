import java.util.Scanner;

public class MultipleCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int num1;
        int num2;
        int count2 = 0;
        int count4 = 0;

        // Ask the user to enter two integers
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();

        // Make sure the first number is smaller
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Check every number between the two integers
        for (int i = num1; i <= num2; i++) {

            // Count multiples of 2
            if (i % 2 == 0) {
                count2++;
            }

            // Count multiples of 4
            if (i % 4 == 0) {
                count4++;
            }
        }

        // Display the results
        System.out.println("Multiples of 2: " + count2);
        System.out.println("Multiples of 4: " + count4);

        input.close();
    }
}