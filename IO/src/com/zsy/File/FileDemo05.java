package com.zsy.File;

import java.io.File;

public class FileDemo05 {
    public static void main(String[] args) {
        String path = "E:\\TQData";

        File file = new File(path);

        File[] files = file.listFiles();

        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
