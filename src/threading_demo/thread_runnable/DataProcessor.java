package threading_demo.thread_runnable;

class DataProcessor implements Runnable {
    private String taskName;

    public DataProcessor(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " processing " + taskName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " completed " + taskName);
    }
}
