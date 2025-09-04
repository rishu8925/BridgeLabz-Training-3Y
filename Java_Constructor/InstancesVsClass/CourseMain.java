package InstancesVsClass;

public class CourseMain {
    public static void main(String[] args) {
      
        Course c1 = new Course("Java Programming", 12, 500.0);
        Course c2 = new Course("Data Structures", 10, 450.0);

        
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
