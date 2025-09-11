import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Hospital " + name + " has doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
    }

    public void showPatients() {
        System.out.println("Hospital " + name + " has patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

