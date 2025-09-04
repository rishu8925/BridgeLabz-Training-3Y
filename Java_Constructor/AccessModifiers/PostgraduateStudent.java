package AccessModifiers;


public class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        
        System.out.println("\n--- Postgraduate Student Details ---");
        System.out.println("Roll Number   : " + rollNumber);  
        System.out.println("Name          : " + name);        
        System.out.println("CGPA          : " + getCGPA());   
        System.out.println("Specialization: " + specialization);
    }
}
