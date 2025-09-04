package InstancesVsClass;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Smartphone", 799.99);
        Product p3 = new Product("Headphones", 199.99);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        
        Product.displayTotalProducts();
    }
}
