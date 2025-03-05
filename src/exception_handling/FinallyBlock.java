package exception_handling;

public class FinallyBlock {
    //finally Block
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
