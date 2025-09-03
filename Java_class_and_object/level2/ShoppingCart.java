public class ShoppingCart {
    String itemName;
    double price;
    int quantity;

    public ShoppingCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayItem() {
        System.out.printf("🛒 %s - ₹%.2f x %d = ₹%.2f%n", itemName, price, quantity, getTotalPrice());
    }
}

