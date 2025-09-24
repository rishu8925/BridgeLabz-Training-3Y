import java.util.Scanner;

public class RemoveCharacter {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);

        String result = removeChar(input, ch);
        System.out.println("Modified String: " + result);

        scanner.close();
    }

    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

