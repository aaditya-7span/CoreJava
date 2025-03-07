package collection.list.arraylist;

import java.util.*;

public class TaskManage {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();

        tasks.add("Complete Assignment");
        tasks.add("Buy Groceries");
        tasks.add("Attend Meeting");

        System.out.println("Tasks: " + tasks);

        // Marking a task as completed (remove task)
        tasks.remove("Buy Groceries");
        System.out.println("Updated Tasks: " + tasks);
    }
}

