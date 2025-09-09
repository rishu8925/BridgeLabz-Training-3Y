class Student {
    static String universityName = "Global University";
    private static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid object.");
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll Number: " + rollNumber);
        } else {
            System.out.println("Invalid object.");
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();

        student1.updateGrade("A+");
        System.out.println();

        student1.displayStudentDetails();
        System.out.println();

        Student.displayTotalStudents();
    }
}
