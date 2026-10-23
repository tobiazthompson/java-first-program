import javax.swing.JOptionPane;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        // Ask for the first test score
        String score1Input = JOptionPane.showInputDialog(
                "Enter the first test score:");

        double score1 = Double.parseDouble(score1Input);

        // Ask for the second test score
        String score2Input = JOptionPane.showInputDialog(
                "Enter the second test score:");

        double score2 = Double.parseDouble(score2Input);

        // Ask for the third test score
        String score3Input = JOptionPane.showInputDialog(
                "Enter the third test score:");

        double score3 = Double.parseDouble(score3Input);

        // Calculate the average
        double average = (score1 + score2 + score3) / 3;

        // Determine the letter grade
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the average and letter grade
        String result = "Student Grade Results\n"
                + "Average Score: " + average + "\n"
                + "Letter Grade: " + grade;

        JOptionPane.showMessageDialog(null, result);
    }
}