// Abstract Class
abstract class Account {
    protected int accountNumber;
    protected String holder;
    protected double balance;

    public Account(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

   
    public abstract void withdraw(double amount);
    public abstract String getAccountType();
}


class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(int accountNumber, String holder, double balance, double interestRate) {
        super(accountNumber, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance in Savings Account!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        }
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New balance: " + balance);
    }
}


// Child Class: CurrentAccount
class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(int accountNumber, String holder, double balance, double overdraftLimit) {
        super(accountNumber, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal exceeds overdraft limit in Current Account!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        }
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
}


// Main Class to test
// public class BankingSystem {
//     public static void main(String[] args) {
//         SavingsAccount savings = new SavingsAccount(101, "Alice", 1000, 0.03);
//         System.out.println(savings.getAccountType());
//         savings.deposit(500);
//         savings.addInterest();
//         savings.withdraw(2000);

//         CurrentAccount current = new CurrentAccount(102, "Bob", 2000, 5000);
//         System.out.println(current.getAccountType());
//         current.withdraw(2500);
//         current.withdraw(8000);
//     }
// }
