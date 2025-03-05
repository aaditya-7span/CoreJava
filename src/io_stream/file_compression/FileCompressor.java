package io_stream.file_compression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class FileCompressor {
    public static void compressFile(String inputFile, String outputFile) {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile);
             GZIPOutputStream gzip = new GZIPOutputStream(fos)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                gzip.write(buffer, 0, bytesRead);
            }
            System.out.println("File compressed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
