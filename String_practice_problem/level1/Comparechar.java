package String_practice_problem.level1;

import java.util.Scanner;

public class Comparechar {

    
    public static char[] myToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);  
        }
        return result;
    }

    
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false; 
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.next();

        
        char[] myArray = myToCharArray(input);

        
        char[] builtInArray = input.toCharArray();

        
        boolean areEqual = compareArrays(myArray, builtInArray);

        
        System.out.println("\nUser-defined char array: ");
        for (char c : myArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nBuilt-in toCharArray() result: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        
        System.out.println("\n\nAre both arrays equal? " + areEqual);

        sc.close();
    }
}

