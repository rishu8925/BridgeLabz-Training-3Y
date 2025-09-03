public class BankAccountMain {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("Amit Sharma", "1234567890", 5000.0);

        account.displayBalance();
        account.deposit(1500);
        account.withdraw(7000);
        account.withdraw(2000);
        account.displayBalance();
    }
}

