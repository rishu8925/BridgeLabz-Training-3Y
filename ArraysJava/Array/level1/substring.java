package ArraysJava.Array.level1;

public class substring {
    public static void main(String[] args) {
        String str = "hello world";
        String sub = str.substring(6, 11);

        String upperSub = sub.toUpperCase();
        System.out.println("Original String: " + str);
        System.out.println("Substring: " + sub);
        System.out.println("Uppercase Substring: " + upperSub);
    }
}
