package io_stream.count_words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("F:\\CoreJava\\src\\io_stream\\count_words\\Hello.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedReader bf = new BufferedReader(fr);

        String ch;
        int count = 0;
        while ((ch = bf.readLine()) != null) {
            StringTokenizer sto = new StringTokenizer(ch);
            while (sto.hasMoreTokens()) {
                count++;
                sto.nextToken();
            }
        }
        System.out.println(count);
    }
}