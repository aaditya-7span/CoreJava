package accessmodifier.employee_manage_sys;

public class Manager extends Employee{
    private int bonus;
    public Manager(String employeeName, int salary,int bonus) {
        super(employeeName, salary);
        this.bonus=bonus;
    }

    public void showTotalEarning(){
        System.out.println("Manager salary: "+salary);//accessing protected salary
        System.out.println("Bonus: "+bonus);
        System.out.println("Total earnings: "+(salary+bonus));
    }
}
