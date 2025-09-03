// Main.java
import java.util.Scanner;

public class ItemsMain{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Item Code: ");
        int code = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        
        Items item =new Items(code,name, price);

      
        item.displayItemDetails();

        
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: $" + totalCost);

        scanner.close();
    }
}

