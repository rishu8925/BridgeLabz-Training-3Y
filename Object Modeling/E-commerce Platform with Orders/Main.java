public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Phone", 800);
        Product p3 = new Product("Headphones", 150);

        Order o1 = new Order(1, c1);
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = new Order(2, c1);
        o2.addProduct(p2);

        Order o3 = new Order(3, c2);
        o3.addProduct(p1);
        o3.addProduct(p2);
        o3.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);
        c2.placeOrder(o3);

        c1.showOrders();
        c2.showOrders();
    }
}

