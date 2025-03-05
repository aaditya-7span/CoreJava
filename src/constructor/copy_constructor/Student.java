package constructor.copy_constructor;

class Student {
    String name;
    int age;

    Student(String name, int age) {    // Parameterized constructor
        this.name = name;
        this.age = age;
    }

    Student(Student s) {    // Copy constructor
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

