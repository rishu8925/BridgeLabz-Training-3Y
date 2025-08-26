package String_practice_problem.level1;

public class NullPointer {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // initialize to null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to demonstrate handling of NullPointerException
    public static void handleException() {
        String text = null; // initialize to null
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling generateException():");
        try {
            generateException(); // This will crash if not handled
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\nCalling handleException():");
        handleException(); // Properly handled
    }
}
