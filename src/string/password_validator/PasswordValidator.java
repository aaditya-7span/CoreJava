package string.password_validator;

import java.util.Scanner;

public class PasswordValidator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (isValidPassword(password)) {
                System.out.println("strong password");
            } else {
                System.out.println("weak password");
            }
        }

        public static boolean isValidPassword(String password) {
            return password.length() >= 8 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*[a-z].*") &&
                    password.matches(".*\\d.*") &&
                    password.matches(".*[!@#$%^&*()].*");
        }
    }
