package threading_demo.jointhread;

import java.util.Scanner;

public class JoinThreadDemo extends ThreadClass {

    static int n,sum=0;

    public void run(){
        for (int i=1;i<=n;i++){
            sum+=i;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the N number:");
        Scanner sc=new Scanner(System.in);
       JoinThreadDemo.n= sc.nextInt();
        JoinThreadDemo th=new JoinThreadDemo();
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("sum is: "+sum);
    }
}
