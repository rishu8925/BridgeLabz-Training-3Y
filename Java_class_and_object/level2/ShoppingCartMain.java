import java.util.ArrayList;

public class ShoppingCartMain {
    ArrayList<ShoppingCart> cart;

    public ShoppingCartMain() {
        cart = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        cart.add(new ShoppingCart(name, price, quantity));
        System.out.println("✅ Added " + quantity + " x " + name + " to cart.");
    }

    public void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItemName().equalsIgnoreCase(name)) {
                cart.remove(i);
                System.out.println("🗑️ Removed " + name + " from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("⚠️ Item not found in cart.");
        }
    }

    public void displayTotalCost() {
        double total = 0;
        System.out.println("\n🧾 Cart Summary:");
        for (ShoppingCart item : cart) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.printf("💰 Total Cost: ₹%.2f%n", total);
    }

    public static void main(String[] args) {
        ShoppingCartMain myCart = new ShoppingCartMain();
        myCart.addItem("Laptop", 55000.00, 1);
        myCart.addItem("Mouse", 799.00, 2);
        myCart.addItem("Notebook", 45.00, 5);
        myCart.displayTotalCost();
        myCart.removeItem("Mouse");
        myCart.displayTotalCost();
    }
}
