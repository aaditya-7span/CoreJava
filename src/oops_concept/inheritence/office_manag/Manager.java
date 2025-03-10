package oops_concept.inheritence.office_manag;

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
