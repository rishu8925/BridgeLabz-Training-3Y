public class Circle {
     private double radius;

    
    public Circle() {
        this(1.0);  
    }

   
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0; 
        }
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

  
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + getArea());
        System.out.println("Circumference : " + getCircumference());
    }
}
