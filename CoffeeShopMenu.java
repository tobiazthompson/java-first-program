import java.util.Scanner;

public class CoffeeShopMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the coffee shop menu
        System.out.println("Coffee Shop Menu");
        System.out.println("1 - Espresso");
        System.out.println("2 - Latte");
        System.out.println("3 - Cappuccino");
        System.out.println("4 - Mocha");

        // Get the customer's choice
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // Determine the selected drink
        switch (choice) {
            case 1:
                System.out.println("Espresso");
                break;

            case 2:
                System.out.println("Latte");
                break;

            case 3:
                System.out.println("Cappuccino");
                break;

            case 4:
                System.out.println("Mocha");
                break;

            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }
}