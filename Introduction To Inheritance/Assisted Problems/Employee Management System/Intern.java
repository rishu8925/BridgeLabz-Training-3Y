public class Intern extends Employee {
    String mentor;

    Intern(String name, int id, double salary, String mentor) {
        super(name, id, salary);
        this.mentor = mentor;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern -> Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Mentor: " + mentor);
    }
}

