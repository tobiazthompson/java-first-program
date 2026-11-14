public class VariableScope {

    public static void main(String[] args) {

        int number = 10;
        int result = 0;

        if (number > 5) {
            result = number * 2;
        }

        System.out.println("Number: " + number);
        System.out.println("Result: " + result);
    }
}
