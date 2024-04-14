package com.zsy.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

        byte [] b = new byte[3];

        int readCount = 0;

        try {
            fis = new FileInputStream("tempfile.txt");

            while ((readCount = fis.read(b)) != -1) {
                // 把数组转换成 String
                System.out.print(new String(b, 0, readCount));
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
