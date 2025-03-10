package collection.queue.linkedlist;

import java.util.*;

public class RestaurantOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();

        orders.add("Order 1");
        orders.add("Order 2");
        orders.add("Order 3");

        System.out.println("Orders in Queue: " + orders);

        // Process the first order
        System.out.println("Processing: " + orders.poll());
        System.out.println("Remaining Orders: " + orders);
    }
}
