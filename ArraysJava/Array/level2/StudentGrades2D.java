package ArraysJava.Array.level2;

import java.util.Scanner;

// Program Name: StudentGrades2D
public class StudentGrades2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Input number of students ----------------------
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // ---------------------- Step 2: Declare arrays ----------------------
        int[][] marks = new int[number][3];   // 2D array [students][3 subjects]
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // ---------------------- Step 3: Input marks with validation ----------------------
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                  System.out.print(subject + " marks: ");
                int mark = sc.nextInt();

                // Validate marks (must be non-negative)
                if (mark < 0) {
                    System.out.println("Error: Marks must be positive. Enter again.");
                    j--; // decrement subject index so user re-enters this subject
                    continue;
                }

                marks[i][j] = mark; // store in 2D array
            }

            // ---------------------- Step 4: Calculate Percentage ----------------------
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // ---------------------- Step 5: Determine Grade ----------------------
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // ---------------------- Step 6: Display Results ----------------------
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-10s\n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Student");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10c %-10d\n",
                    marks[i][0], marks[i][1], marks[i][2],
                    percentage[i], grade[i], (i + 1));
        }

        sc.close();
    }
}

