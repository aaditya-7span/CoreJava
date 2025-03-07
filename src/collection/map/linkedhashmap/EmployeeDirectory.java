package collection.map.linkedhashmap;
import java.util.*;

public class EmployeeDirectory {
    public static void main(String[] args) {
        Map<String, String> employees = new LinkedHashMap<>();

        employees.put("233", "vishwannath");
        employees.put("322", "ram singh");
        employees.put("643", "mayur joshi");

        System.out.println("Employee Directory " + employees);

        // Fetching an employee by ID
        System.out.println(employees.get("233"));
    }
}
