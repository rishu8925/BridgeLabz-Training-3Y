public class UnitConverter {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Example usage
        double km = 5;
        double miles = convertKmToMiles(km);
        System.out.println(km + " km = " + miles + " miles");

        double mileValue = 3;
        double kmValue = convertMilesToKm(mileValue);
        System.out.println(mileValue + " miles = " + kmValue + " km");

        double meterValue = 10;
        double feetValue = convertMetersToFeet(meterValue);
        System.out.println(meterValue + " meters = " + feetValue + " feet");

        double feetInput = 20;
        double meterResult = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet = " + meterResult + " meters");
    }
}
