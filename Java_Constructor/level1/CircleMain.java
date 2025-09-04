public class CircleMain {
    public static void main(String[] args) {
       
        Circle defaultCircle = new Circle();
        defaultCircle.displayDetails();

      
        Circle customCircle = new Circle(5.5);
        customCircle.displayDetails();
    }
}
