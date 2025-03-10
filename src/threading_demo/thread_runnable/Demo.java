package threading_demo.thread_runnable;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DataProcessor("task 1"));
        Thread t2 = new Thread(new DataProcessor("task 2"));
        Thread t3 = new Thread(new DataProcessor("task 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
