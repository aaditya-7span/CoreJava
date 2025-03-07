package collection.set.hashset;
import java.util.*;

public class WebsiteVisitors {
    public static void main(String[] args) {
        Set<String> visitors = new HashSet<>();

        visitors.add("user123");
        visitors.add("user456");
        visitors.add("user123");  // duplicate

        System.out.println("Visitors: " + visitors);
    }
}
