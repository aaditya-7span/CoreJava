package java8.lamdafunction;

import java.util.Arrays;
import java.util.List;

public class LamdaDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Programming", 45.99),
                new Book("Clean Code", 37.50),
                new Book("Effective Java", 50.00),
                new Book("Head First Java", 40.00)
        );

        // Sort books by price using a lambda expression
        books.sort((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));

        // Print sorted books
        books.forEach(book -> System.out.println(book));
    }
}

