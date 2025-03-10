package collection.map.hashmap;

import java.util.*;

public class OnlineStore {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();

        productPrices.put("Laptop", 3223.1);
        productPrices.put("Smartphone", 729.9);
        productPrices.put("Tablet", 289.2);

        System.out.println("Product Prices: " + productPrices);

        System.out.println("Price of Laptop:" + productPrices.get("Laptop"));
    }
}

