package java8.stream_api.avg_sal_of_empy;


import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("mihit", 60000, "engineering"),
                new Employee("manan", 75000, "engineering"),
                new Employee("vipul", 80000, "HR"),
                new Employee("ramesh", 90000, "engineering"),
                new Employee("shan", 95000, "HR")
        );

        // Calculate the average salary of Engineering employees
        double averageSalary = employees.stream()
                .filter(e -> e.getDepartment().equals("engineering"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Average Salary in Engineering: " + averageSalary);
    }
}
