package exception_handling;

public class TryCatch {
    //    try catch
    public static void main(String[] args) {
        try {
            int num = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
