package java8.comparater_inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    String name;
    Integer e_id;
    String email;

    public Employee(String name, Integer e_id, String email) {
        this.name = name;
        this.e_id = e_id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Test2{" +
                "name='" + name + '\'' +
                ", e_id=" + e_id +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees =new ArrayList<>();

        employees.add(new Employee("aadi",123,"hell@gmail.com"));
        employees.add(new Employee("rajat",342,"omg@gmail.com"));
        employees.add(new Employee("vipul",12,"makework@gmail.com"));
        employees.add(new Employee("narayan",665,"getout@gmail.com"));
        employees.add(new Employee("pankaj",854,"chair@gmail.com"));
        employees.add(new Employee("vansh",926,"window@gmail.com"));
        System.out.println(employees);
        Collections.sort(employees,(ob1, ob2) -> ob1.e_id<ob2.e_id ? -1 : ob1.e_id>ob2.e_id ? 1:0);
        System.out.println(employees);
        Collections.sort(employees,(ob1, ob2) -> ob1.name.compareTo(ob2.name));
        System.out.println(employees);

    }
}
