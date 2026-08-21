import java.util.Scanner;

/**
 * Week 1: reads a student's mark and displays the corresponding grade.
 */
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter mark (0-100): ");
        double mark = scanner.nextDouble();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark. Please enter a value from 0 to 100.");
        } else {
            System.out.println("Student: " + studentName);
            System.out.println("Mark: " + mark);
            System.out.println("Grade: " + calculateGrade(mark));
        }

        scanner.close();
    }

    private static String calculateGrade(double mark) {
        if (mark >= 80) {
            return "A";
        }
        if (mark >= 70) {
            return "B";
        }
        if (mark >= 60) {
            return "C";
        }
        if (mark >= 50) {
            return "D";
        }
        return "F";
    }
}
