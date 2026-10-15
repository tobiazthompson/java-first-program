import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Numbers less than 2 are not prime
        if (number < 2) {
            isPrime = false;
        } else {
            // Start checking divisors at 2
            int i = 2;

            // Check if any number divides evenly into number
            while (i < number) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }

                i++;
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}