package io_stream.steam_read_write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis= null;
        FileOutputStream fos=null;
        try {
            fis = new FileInputStream("F:\\CoreJava\\src\\io_stream\\steam_read_write\\Hello.txt");
            fos=new FileOutputStream("F:\\CoreJava\\src\\io_stream\\steam_read_write\\Hellofixed.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int i;
        while(true){
            try {
                if (!((i=fis.read())!=-1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print((char) i);
            try {
                fos.write((char)i);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
