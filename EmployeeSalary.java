public class EmployeeSalary {

    // Calculate permanent employee salary
    public double calculateSalary(double annualSalary) {
        return annualSalary;
    }

    // Calculate hourly employee salary
    public double calculateSalary(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    // Calculate consultant salary
    public double calculateSalary(int completedAssignments,
                                  double feePerAssignment) {
        return completedAssignments * feePerAssignment;
    }

    public static void main(String[] args) {

        // Create an EmployeeSalary object
        EmployeeSalary employee = new EmployeeSalary();

        // Calculate permanent employee salary
        double permanentSalary = employee.calculateSalary(65000);

        // Calculate hourly employee salary
        double hourlySalary = employee.calculateSalary(25.50, 40);

        // Calculate consultant salary
        double consultantSalary = employee.calculateSalary(5, 350);

        // Display employee earnings
        System.out.println("Permanent Employee Annual Salary: $"
                + permanentSalary);

        System.out.println("Hourly Employee Weekly Salary: $"
                + hourlySalary);

        System.out.println("Consultant Total Payment: $"
                + consultantSalary);
    }
}
