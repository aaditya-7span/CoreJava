package java8.stream_api.grouping_counting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", "electronics", 1000.00),
                new Product("Phone", "electronics", 700.00),
                new Product("Shirt", "fashion", 40.00),
                new Product("Shoes", "fashion", 60.00),
                new Product("Tablet", "Fasion", 500.00)
        );

        Map<String, Long> productCountByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));

        System.out.println(productCountByCategory);
    }
}
