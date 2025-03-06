package oops_concept.inheritence.office_manag;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Employee: " + name + " id: " + id);
    }
}