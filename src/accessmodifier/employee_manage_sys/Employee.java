package accessmodifier.employee_manage_sys;

public class Employee {
    private String employeeName;
    protected int salary;

    public Employee(String employeeName, int salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployeeInfo(){
        System.out.println("Employee name: "+employeeName);
        System.out.println("Salary"+salary);
    }
}
