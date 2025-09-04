package InstancesVsClass;

public class Course {
    private String courseName;
    private int duration;   
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("\n--- Course Details ---");
        System.out.println("Institute   : " + instituteName);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " weeks");
        System.out.println("Fee         : $" + fee);
    }

   
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("\nInstitute name updated to: " + instituteName);
    }
}

