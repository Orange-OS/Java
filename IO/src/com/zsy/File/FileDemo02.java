package com.zsy.File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo02 {
    public static void main(String[] args) {
        String path = "E:\\TQData";

        File file = new File(path);

        System.out.println(file.exists());

        System.out.println(file.isFile());

        System.out.println(file.isDirectory());

        System.out.println(file.getName());

        System.out.println(file.length());

        long lastModified = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(lastModified);
        System.out.println(format);

        System.out.println(file.getPath());

        System.out.println(file.getAbsolutePath()); // 获取绝对路径
    }
}
