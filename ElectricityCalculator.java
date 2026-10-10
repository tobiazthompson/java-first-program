import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ElectricityBillCalculator {
    public static void main(String[] args) throws FileNotFoundException {

        // Open the input file
        File inputFile = new File("customerData.txt");
        Scanner input = new Scanner(inputFile);

        // Read customer information
        String customerName = input.nextLine();
        String accountNumber = input.nextLine();
        int kWh = input.nextInt();
        String overdueAnswer = input.next();

        input.close();

        // Declare variables
        double electricityCharge;
        double lateFee;
        double totalAmount;

        // Calculate electricity charge
        if (kWh <= 100) {
            electricityCharge = kWh * 0.12;
        } else if (kWh <= 300) {
            electricityCharge = (100 * 0.12)
                    + ((kWh - 100) * 0.15);
        } else {
            electricityCharge = (100 * 0.12)
                    + (200 * 0.15)
                    + ((kWh - 300) * 0.18);
        }

        // Calculate late-payment fee
        if (overdueAnswer.equals("yes")) {
            lateFee = 25.00;
        } else {
            lateFee = 0.00;
        }

        // Calculate total amount
        totalAmount = electricityCharge + lateFee;

        // Open output file
        PrintWriter output = new PrintWriter("electricityBill.txt");

        // Display bill on screen
        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Electricity Usage: " + kWh + " kWh");

        System.out.printf("Electricity Charge: $%.2f%n",
                electricityCharge);
        System.out.printf("Late-Payment Fee: $%.2f%n", lateFee);
        System.out.printf("Total Amount Due: $%.2f%n", totalAmount);

        // Save bill to output file
        output.println("===== ELECTRICITY BILL =====");
        output.println("Customer Name: " + customerName);
        output.println("Account Number: " + accountNumber);
        output.println("Electricity Usage: " + kWh + " kWh");

        output.printf("Electricity Charge: $%.2f%n",
                electricityCharge);
        output.printf("Late-Payment Fee: $%.2f%n", lateFee);
        output.printf("Total Amount Due: $%.2f%n", totalAmount);

        // Close output file
        output.close();

        System.out.println("Bill saved to electricityBill.txt");
    }
}