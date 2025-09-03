public class BankAccount {
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("✅ Deposited ₹%.2f. New balance: ₹%.2f%n", amount, balance);
        } else {
            System.out.println("⚠️ Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("⚠️ Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.printf("✅ Withdrew ₹%.2f. New balance: ₹%.2f%n", amount, balance);
        }
    }

    public void displayBalance() {
        System.out.printf("💰 Current balance: ₹%.2f%n", balance);
    }
}

