package java17.record;

public class Demo {
    public static void main(String[] args) {
        // Create product instances using the record
        Product product1 = new Product("Laptop", 799.99, "Electronics");
        Product product2 = new Product("Phone", 499.99, "Electronics");

        System.out.println(product1);
        System.out.println(product2);

        // Access fields directly
        System.out.println("Product 1 Name: " + product1.name());
        System.out.println("Product 2 Price: " + product2.price());
    }
}
