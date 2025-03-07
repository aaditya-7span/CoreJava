package java8.functional_inter;

@FunctionalInterface
public interface MyInterface {
    void print();  // Only one abstract method (valid functional interface)

    // Static method
    static void getData() {
        System.out.println("Fetching employee data...");
    }

    // Default method
    default void remove() {
        System.out.println("Removing employee record...");
    }
}
