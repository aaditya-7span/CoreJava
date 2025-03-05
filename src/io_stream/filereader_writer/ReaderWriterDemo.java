package io_stream.filereader_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterDemo {
    public static void main(String[] args) {
        String sourceFile = "F:\\CoreJava\\src\\io_stream\\filereader_writer\\Hello.txt";
        String destinationFile = "F:\\CoreJava\\src\\io_stream\\filereader_writer\\FileWriter.txt";

        // Using try-with-resources to ensure files are closed properly
        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destinationFile)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            // Ensure all data is flushed to the file
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace(); // Print error message instead of throwing an exception
        }
    }
}
