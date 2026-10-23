import javax.swing.JOptionPane;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Ask the user to enter a number
        String input = JOptionPane.showInputDialog(
                "Enter an integer between 1 and 12:");

        // Convert the input to an integer
        int number = Integer.parseInt(input);

        // Create a string to hold the multiplication table
        String table = "";

        // Generate the multiplication table
        for (int i = 1; i <= 12; i++) {
            table = table + number + " x " + i + " = "
                    + (number * i) + "\n";
        }

        // Display the complete table
        JOptionPane.showMessageDialog(null, table);
    }
}