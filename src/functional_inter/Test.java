package java8.functional_inter;

public class Test {
    public static void main(String[] args) {
        // Lambda expressions implementing Employee interface
        Employee emp1 = () -> "Employee: Ramlal Joshi, Salary: 20000";
        Employee emp2 = () -> "Employee: Vishwanath Kutre, Salary: 95000";

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());

        // Calling default method
        emp1.showRole();

        // Calling static method
        Employee.companyInfo();

        // Calling static method from MyInterface
        MyInterface.getData();

        // Using anonymous class for MyInterface
        MyInterface myInterface = () -> System.out.println("Printing employee details...");
        myInterface.print();
        myInterface.remove();
    }
}
