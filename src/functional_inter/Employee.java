package java8.functional_inter;

// Functional Interface with a single abstract method
@FunctionalInterface
public interface Employee {
    String getDetails();

    // Default method
    default void showRole() {
        System.out.println("Software Engineer");
    }

    // Static method
    static void companyInfo() {
        System.out.println("Reliance");
    }
}
