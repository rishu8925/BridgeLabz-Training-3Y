
public class Main {
    public static void main(String[] args) {
        University uni = new University("Global University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.showDepartments();
        uni.showFaculties();
        uni = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Faculty can still exist outside University:");
        System.out.println("- " + f1.getName());
        System.out.println("- " + f2.getName());
    }
}
