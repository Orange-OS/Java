package com.zsy.File;

import java.io.File;

public class FileDemo07 {
    public static void main(String[] args) {
        File file = new File("E:\\测试");
        deleteDir(file);
    }

    public static void deleteDir(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }

        if (dir.isFile()) {
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                file.delete();
            } else {
                deleteDir(file);
            }
        }

        dir.delete();
    }
}
