package accessmodifier.bank_acc_sys;

public class BankAccount {
    private double balance;

    BankAccount(double initialBalance){
        this.balance=initialBalance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Depositer:"+amount);
        }
        else System.out.println("Invalid amount");
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-= amount;
            System.out.println("Withdrawn"+amount);
        }
        else System.out.println("insufficent balance");
    }

    protected void showBalance(){
        System.out.println("current balance"+balance);
    }
}
