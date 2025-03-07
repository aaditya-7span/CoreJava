package java17.random_generator;

import java.util.*;
import java.util.random.*;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        RandomGenerator randomGenerator = new Random();

        // Generate a random password of length 12
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            password.append(characters.charAt(randomGenerator.nextInt(characters.length())));
        }

        System.out.println("Random Password: " + password.toString());
    }
}
