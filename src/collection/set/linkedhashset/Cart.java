package collection.set.linkedhashset;

import java.util.*;

public class Cart {
    public static void main(String[] args) {
        Set<String> cart = new LinkedHashSet<>();

        cart.add("Laptop");
        cart.add("Smartphone");
        cart.add("Laptop");  // Duplicate

        System.out.println("Cart: " + cart);
    }
}
