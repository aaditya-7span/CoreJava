package java8.stream_api.filter_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
        public static void main(String[] args) {

            List<Employee> employees = Arrays.asList(
                    new Employee("vimal", 30, "HR"),
                    new Employee("miraj", 25, "engineering"),
                    new Employee("nakul", 35, "engineering"),
                    new Employee("bharat", 28, "HR"),
                    new Employee("vibhisan", 40, "finance")
            );

            // Filter employees in Engineering department and sort by age
            List<Employee> engineeringEmployees = employees.stream()
                    .filter(e -> e.getDepartment().equals("engineering"))
                    .sorted(Comparator.comparingInt(Employee::getAge))
                    .collect(Collectors.toList());

            engineeringEmployees.forEach(System.out::println);
        }

}
