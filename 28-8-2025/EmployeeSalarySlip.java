public class EmployeeSalarySlip {
    public static void main(String[] args) {
        
        String[] names = {"rishu", "tamanna", "bhavya", "suhani"};
        int[] basicSalary = {4000, 55000, 30000, 70000};

       
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int basic = basicSalary[i];

            
            double hra = 0.20 * basic;  
            double da = 0.10 * basic;   

            
            double netSalary = basic + hra + da;

            
            if (netSalary > 50000) {
                System.out.println("tax above 50000   : " );
                double tax = 0.10 * netSalary;
                netSalary -= tax;
            }

           
           
            System.out.println("        Salary Slip             ");
            
            System.out.println("Employee Name: " + name);
            System.out.println("Basic Salary : " + basic);
            System.out.println("HRA (20%)    : " + hra);
            System.out.println("DA (10%)     : " + da);
            System.out.println("Net Salary   : " + netSalary);
           
            System.out.println("================================\n");
        }
    }
}

