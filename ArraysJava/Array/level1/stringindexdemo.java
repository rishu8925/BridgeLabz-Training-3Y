package ArraysJava.Array.level1;


import java.util.Scanner;
public class stringindexdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

       
        try {
            System.out.println("Accessing invalid index...");
            System.out.println("Character at position 10: " + text.charAt(10));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Error Message: " + e.getMessage());
        }

        sc.close();
    }
}
