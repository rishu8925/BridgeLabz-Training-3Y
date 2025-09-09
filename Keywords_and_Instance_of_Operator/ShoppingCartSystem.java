class Product {
    static double discount = 10.0; 
    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "% for all products.");
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid object.");
        }
    }

    double calculatePriceAfterDiscount() {
        return price * quantity * (1 - discount / 100);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 101, 1200.0, 1);
        Product prod2 = new Product("Headphones", 102, 150.0, 2);

        prod1.displayProductDetails();
        System.out.println("Total Price After Discount: $" + prod1.calculatePriceAfterDiscount());
        System.out.println();

        prod2.displayProductDetails();
        System.out.println("Total Price After Discount: $" + prod2.calculatePriceAfterDiscount());
        System.out.println();

        Product.updateDiscount(15.0); // Update discount for all products
        System.out.println();

        prod1.displayProductDetails();
        System.out.println("Total Price After Discount: $" + prod1.calculatePriceAfterDiscount());
    }
}

