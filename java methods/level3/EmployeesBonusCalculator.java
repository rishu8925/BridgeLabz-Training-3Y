import java.util.Random;

public class EmployeesBonusCalculator {

    
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; 
        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = 1 + rand.nextInt(10); 
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        int n = data.length;
        double[][] results = new double[n][2]; 

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;
            results[i][0] = newSalary;
            results[i][1] = bonus;
        }
        return results;
    }

    public static void displayResults(int[][] data, double[][] results) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-10s %-12s %-10s %-12s%n",
                "EmpID", "Old Salary", "Years", "Bonus", "New Salary", "Bonus %");

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double newSalary = results[i][0];
            double bonus = results[i][1];
            double bonusPercent = (bonus / salary) * 100;

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-12d %-10d %-12.2f %-10.2f %-12.1f%n",
                    (i + 1), salary, years, bonus, newSalary, bonusPercent);
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-10s %-12.2f %-10.2f %-12s%n",
                "TOTAL", totalOldSalary, "-", totalBonus, totalNewSalary, "-");
    }

    public static void main(String[] args) {
        int n = 10; 

        int[][] employeeData = generateEmployeeData(n);
        double[][] results = calculateNewSalaryAndBonus(employeeData);

        displayResults(employeeData, results);
    }
}

