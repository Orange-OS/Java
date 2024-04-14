package com.zsy.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        int readCount = 0;
        char [] ch = new char[4];
        try {
            fr = new FileReader("tempfile.txt");

            while ((readCount = fr.read(ch)) != -1) {
                System.out.print(new String(ch, 0, readCount));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
