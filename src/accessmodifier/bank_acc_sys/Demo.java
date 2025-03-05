package accessmodifier.bank_acc_sys;

public class Demo {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(1000);
        account.deposit(500);
        account.withdraw(20);
        account.showBalance();

        PremiumAccount premiumAccount=new PremiumAccount(2000);
        premiumAccount.displayBalance();// works beacuse showBalance is protected
    }
}
