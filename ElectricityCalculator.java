import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ElectricityBillCalculator {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Enter information manually");
        System.out.println("2. Read information from file");
        System.out.print("Choose an option: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        Scanner input;

        if (choice == 1) {
            input = keyboard;
        } else if (choice == 2) {
            input = new Scanner(new File("customerData.txt"));
        } else {
            System.out.println("Invalid option.");
            return;
        }

        System.out.print("Customer name: ");
        String name = input.nextLine();
        System.out.print("Account number: ");
        String account = input.nextLine();
        System.out.print("Electricity usage (kWh): ");
        int kWh = input.nextInt();
        input.nextLine();
        System.out.print("Payment overdue? (yes/no): ");
        String overdue = input.nextLine();

        double charge;

        if (kWh <= 100) {
            charge = kWh * 0.12;
        } else if (kWh <= 300) {
            charge = 12 + (kWh - 100) * 0.15;
        } else {
            charge = 12 + 30 + (kWh - 300) * 0.18;
        }

        double lateFee = 0;
        if (overdue.equals("yes")) {
            lateFee = 25;
        }

        double total = charge + lateFee;

        System.out.println("\n--- ELECTRICITY BILL ---");
        System.out.println("Customer: " + name);
        System.out.println("Account: " + account);
        System.out.println("Usage: " + kWh + " kWh");
        System.out.printf("Electricity charge: $%.2f%n", charge);
        System.out.printf("Late fee: $%.2f%n", lateFee);
        System.out.printf("Total due: $%.2f%n", total);

        PrintWriter output = new PrintWriter("electricityBill.txt");
        output.println("--- ELECTRICITY BILL ---");
        output.println("Customer: " + name);
        output.println("Account: " + account);
        output.println("Usage: " + kWh + " kWh");
        output.printf("Electricity charge: $%.2f%n", charge);
        output.printf("Late fee: $%.2f%n", lateFee);
        output.printf("Total due: $%.2f%n", total);
        output.close();

        System.out.println("Bill saved to electricityBill.txt");

        if (choice == 2) {
            input.close();
        }
    }
}