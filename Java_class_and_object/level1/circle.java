
public class circle {
    
    double radius;

  
    public circle(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius         : " + radius);
        System.out.println("Area           : " + calculateArea());
        System.out.println("Circumference  : " + calculateCircumference());
    }
}

