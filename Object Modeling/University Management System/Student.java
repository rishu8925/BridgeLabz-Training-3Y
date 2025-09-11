import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.getTitle());
        }
    }

    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getTitle());
        }
    }
}

