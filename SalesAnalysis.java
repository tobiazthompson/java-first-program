public class SalesAnalysis {

    public static void main(String[] args) {

        // Store weekly sales for 3 representatives
        double[][] sales = {
                {1200, 1500, 1800, 1400},
                {2000, 1700, 1900, 2100},
                {1000, 1300, 1100, 1500}
        };

        double companyTotal = 0;
        double highestTotal = 0;
        int highestRep = 0;

        // Calculate each representative's total
        for (int row = 0; row < 3; row++) {

            double total = 0;

            for (int col = 0; col < 4; col++) {
                total += sales[row][col];
            }

            System.out.println("Representative " + (row + 1)
                    + " Total Sales: $" + total);

            companyTotal += total;

            if (total > highestTotal) {
                highestTotal = total;
                highestRep = row + 1;
            }
        }

        // Display company results
        System.out.println("Company Total Sales: $" + companyTotal);
        System.out.println("Highest Sales: Representative "
                + highestRep + " ($" + highestTotal + ")");
    }
}
