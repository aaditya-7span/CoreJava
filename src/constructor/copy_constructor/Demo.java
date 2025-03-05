package constructor.copy_constructor;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Aaditya", 22);
        Student s2 = new Student(s1); // Copying object s1 to s2

        s1.display();
        s2.display();
    }
}
