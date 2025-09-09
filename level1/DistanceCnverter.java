import java.util.Scanner;

public class DistanceCnverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;     
        double distanceInMiles = distanceInYards / 1760.0; 
        System.out.println("The distance " + distanceInFeet + " feet is equal to " 
                        + distanceInYards + " yards and " 
                        + distanceInMiles + " miles.");
    }
}

