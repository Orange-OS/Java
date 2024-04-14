package com.zsy.File;

import java.io.File;

public class FileDemo06 {
    public static void main(String[] args) {

    }

    public static void searchFile(File dir, String name) {
        if (dir == null || !dir.exists() || dir.isFile()) {
            return;
        }

        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().contains(name)) {
                        System.out.println("找到了:" + f.getAbsolutePath());
                    } else {
                        searchFile(f, name);
                    }
                }
            }
        }







    }
}
