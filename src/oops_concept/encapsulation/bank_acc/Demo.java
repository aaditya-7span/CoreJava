package oops_concept.encapsulation.bank_acc;

public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(100);
        System.out.println("balance: " + account.getBalance());
    }
}

