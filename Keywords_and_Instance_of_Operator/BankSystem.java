class BankAccount {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to account " + accountNumber);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 101, 5000.0);
        BankAccount acc2 = new BankAccount("Bob", 102, 3000.0);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        System.out.println();

        acc1.deposit(1500);
        acc2.withdraw(500);
        System.out.println();

        BankAccount.getTotalAccounts();
    }
}

    

