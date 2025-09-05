import java.util.Scanner;

public class StudentVote {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // invalid age
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVote checker = new StudentVote();

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            boolean eligible = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Invalid age entered. Student " + (i + 1) + " cannot vote.");
            } else if (eligible) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        scanner.close();
    }
}

