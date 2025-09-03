public class PalindromeCheckerMain {
    public static void main(String[] args) {
        
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();

        PalindromeChecker checker3 = new PalindromeChecker("A man, a plan, a canal: Panama");
        checker3.displayResult();
    }
}

