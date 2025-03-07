package collection.queue.priorityqueue;

import java.util.*;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Minor Injury");
        queue.add("Severe Injury");
        queue.add("Critical Condition");

        System.out.println("Queue (Processing by Priority): " + queue);

        System.out.println("Serving: " + queue.poll());
        System.out.println("Remaining Triage Queue: " + queue);
    }
}
