import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getTitle());
        }
    }
}
