import java.util.Scanner;

public class MostFrequentChar {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Most Frequent Character: '" + findMostFrequentChar(input) + "'");
        scanner.close();
    }

    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; 
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int maxCount = -1;
        char mostFreq = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                mostFreq = c;
            }
        }
        return mostFreq;
    }
}
