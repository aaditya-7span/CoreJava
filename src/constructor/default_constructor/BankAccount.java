package constructor.default_constructor;

class BankAccount {
    String accountHolder;
    double balance;


    BankAccount() {    // Default constructor
        accountHolder = "Unknown";
        balance = 10.0;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}
