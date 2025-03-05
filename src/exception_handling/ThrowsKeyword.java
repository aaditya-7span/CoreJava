package exception_handling;

import java.io.IOException;

public class ThrowsKeyword {
    //    throws Keyword (Declaring Exceptions)
    static void readFile() throws IOException {
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
    }
}
