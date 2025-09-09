import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm_to_in = 2.54;

        System.out.print("Enter the base of the triangle in cm: ");
        double base_cm = sc.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height_cm = sc.nextDouble();

        double area_cm2 = 0.5 * base_cm * height_cm;
        double base_in = base_cm / cm_to_in;
        double height_in = height_cm / cm_to_in;
        double area_in2 = 0.5 * base_in * height_in;

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", area_in2, area_cm2);
        sc.close();
    }
}

