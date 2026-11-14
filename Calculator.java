public class Calculator {

    // Method 1
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method 2
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method 3
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);

        int sum2 = calc.add(10, 20, 30);

        double sum3 = calc.add(10.5, 20.5);

        // Display the results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two decimal numbers: " + sum3);
    }
}
