package accessmodifier.employee_manage_sys;

public class Demo {
    public static void main(String[] args) {
        Employee employee=new Employee("Hiren",30000);
        employee.displayEmployeeInfo();
//        employee.name;//cannot access private field

        Manager manager=new Manager("rahul",30000,10000);
        manager.showTotalEarning();//access protected salary
    }
}
