package InstancesVsClass;

public class Product {
    String productName;
    double price;

   
    private static int totalProducts = 0;


    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    
    public void displayProductDetails() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : $" + price);
    }

    
    public static void displayTotalProducts() {
        System.out.println("\nTotal Products Created: " + totalProducts);
    }
}

