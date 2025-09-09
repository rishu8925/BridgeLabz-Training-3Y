class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid object.");
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Alice", 101, 30, "Flu");
        Patient patient2 = new Patient("Bob", 102, 45, "Fracture");

        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
        System.out.println();

        Patient.getTotalPatients();
    }
}

