// Item.java
public class Items {
 
    int itemCode;
    String itemName;
    double price;

    
    public Items(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Details:");
        System.out.println("Code  : " + itemCode);
        System.out.println("Name  : " + itemName);
        System.out.println("Price : $" + price);
    }

    
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

