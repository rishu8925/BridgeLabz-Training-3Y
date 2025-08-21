package ArraysJava.Array.level2;

import java.util.Scanner;

// Program Name: BMICalculator
public class BMIcalci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ---------------------- Step 1: Input number of persons ----------------------
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // ---------------------- Step 2: Declare arrays ----------------------
        double[] weightArray = new double[n];
        double[] heightArray = new double[n];
        double[] bmiArray = new double[n];
        String[] statusArray = new String[n];

        // ---------------------- Step 3: Input weight and height ----------------------
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            weightArray[i] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            heightArray[i] = sc.nextDouble();

            // ---------------------- Step 4: Calculate BMI ----------------------
            bmiArray[i] = weightArray[i] / (heightArray[i] * heightArray[i]);

            // ---------------------- Step 5: Determine status ----------------------
            if (bmiArray[i] < 18.5) {
                statusArray[i] = "Underweight";
            } else if (bmiArray[i] < 25) {
                statusArray[i] = "Normal weight";
            } else if (bmiArray[i] < 30) {
                statusArray[i] = "Overweight";
            } else {
                statusArray[i] = "Obese";
            }
        }

        // ---------------------- Step 6: Display results ----------------------
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    heightArray[i], weightArray[i], bmiArray[i], statusArray[i]);
        }

        sc.close(); // Close scanner
    }
}

