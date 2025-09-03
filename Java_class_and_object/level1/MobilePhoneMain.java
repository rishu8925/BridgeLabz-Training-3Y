// Main.java
public class MobilePhoneMain {
    public static void main(String[] args) {
       
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 799.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 13", 999.99);
        phone1.displayDetails();
        System.out.println(); 
        phone2.displayDetails();
    }
}

