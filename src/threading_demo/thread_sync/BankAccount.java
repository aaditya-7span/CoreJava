package threading_demo.thread_sync;

public class BankAccount {
    private int balance = 5000;

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
        if (balance < amount) {
            System.out.println("insufficient balance" + Thread.currentThread().getName() + " is waiting.");
            try {
                wait();  // wait until money is deposited
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrawn " + amount + ". remaining balance: " + balance);
    }

    public synchronized void deposit(int amount) {
        System.out.println("Depositing " + amount);
        balance += amount;
        System.out.println("Deposit complete! New Balance: " + balance);
        notify();  // notify waiting threads
    }
    }
