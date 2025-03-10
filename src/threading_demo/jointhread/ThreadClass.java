package threading_demo.jointhread;

public class ThreadClass extends Thread{

    public void run(){
        for (int j=0;j<0;j++){
            System.out.print("j:"+j+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadClass th=new ThreadClass();
       long start= System.currentTimeMillis();
        th.start();
        for (int i=0;i<10;i++){
            System.out.print("i:"+i+" ");
            Thread.sleep(1000);
        }

        long end= System.currentTimeMillis();
        System.out.println();
        System.out.println("totaltime: "+(end-start)/1000);
    }
}
