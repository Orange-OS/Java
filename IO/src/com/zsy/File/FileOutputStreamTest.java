package com.zsy.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("myfile");

            // 以追加的方式写入
            fos = new FileOutputStream("myfile",true);

            byte [] b = {97, 98, 99, 100};

            fos.write(b);

            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
