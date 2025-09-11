public class Main {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        school.addStudent(s1);
        school.addStudent(s2);
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);
        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
