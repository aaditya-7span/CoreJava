package collection.list.linkedlist;

import java.util.*;

public class BankQueue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();

        customerQueue.add("customer 1");
        customerQueue.add("customer 2");
        customerQueue.add("customer 3");

        System.out.println("Current Queue: " + customerQueue);

        System.out.println("Serving: " + customerQueue.poll());
        System.out.println("Updated Queue: " + customerQueue);
    }
}
