import java.util.ArrayList;

public class Bank {
    String name;
    protected ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

  
    public void openAccount(Customer customer, double initialDeposit) {
        Account newAccount = new Account(this, initialDeposit);
        customer.addAccount(newAccount);

        if (!customers.contains(customer)) {
            customers.add(customer);
        }

        System.out.println("Account opened for " + customer.getName() + 
                           " in " + name + " with balance " + initialDeposit);
    }

    public void showCustomers() {
        System.out.println("\nCustomers of " + name + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}

