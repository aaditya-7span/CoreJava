package threading_demo.thread_sync;

public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread user1 = new Thread(() -> account.withdraw(6000), "User1");
        Thread user2 = new Thread(() -> account.deposit(3000), "User2");

        user1.start();
        user2.start();
    }
}
