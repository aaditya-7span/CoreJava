package exception_handling;

public class ThrowKeyword {
    //throw Keyword (Manually Throwing Exceptions)
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("You can vote!");
        }
    }
    public static void main(String[] args) {
        checkAge(16);  // Throws exception
    }
}
