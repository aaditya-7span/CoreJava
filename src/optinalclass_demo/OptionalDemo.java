package java8.optinalclass_demo;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> optionalName = Optional.ofNullable(getUserName());
        String name = optionalName.orElse("Guest");
        System.out.println("User: " + name);

        optionalName.ifPresent(n -> System.out.println("Welcome, " + n));
    }

    public static String getUserName() {
        return null;
    }
}
