import javax.swing.JOptionPane;

public class RestaurantBillCalculator {
    public static void main(String[] args) {

        // Ask for the meal cost
        String mealInput = JOptionPane.showInputDialog(
                "Enter the meal cost:");

        double mealCost = Double.parseDouble(mealInput);

        // Ask for the tip percentage
        String tipInput = JOptionPane.showInputDialog(
                "Enter the tip percentage:");

        double tipPercent = Double.parseDouble(tipInput);

        // Calculate sales tax, tip, and total bill
        double salesTax = mealCost * 0.06;
        double tip = mealCost * tipPercent / 100;
        double totalBill = mealCost + salesTax + tip;

        // Create the bill summary
        String result = "Restaurant Bill Summary\n"
                + "Meal Cost: $"
                + String.format("%.2f", mealCost)
                + "\nSales Tax (6%): $"
                + String.format("%.2f", salesTax)
                + "\nTip (" + tipPercent + "%): $"
                + String.format("%.2f", tip)
                + "\nTotal Bill: $"
                + String.format("%.2f", totalBill);

        // Display the completed bill
        JOptionPane.showMessageDialog(null, result);
    }
}


