import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Company " + name + " deleted along with all its departments.");
    //     departments.clear();
    //     super.finalize();
    // }
}
