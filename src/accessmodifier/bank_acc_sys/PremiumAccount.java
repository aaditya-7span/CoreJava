package accessmodifier.bank_acc_sys;

public class PremiumAccount extends BankAccount{
    PremiumAccount(double initialBalance) {
        super(initialBalance);
    }

    public void displayBalance(){
        showBalance(); // Protected method is accessible in the subclass
    }
}
