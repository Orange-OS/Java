package com.zsy.File;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) {
        String path = "E:\\TQData\\20240406";

        File file = new File(path);

//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println(file.mkdir()); // 创建一级文件夹

//        System.out.println(file.mkdirs()); // 创建多级文件夹

        System.out.println(file.delete()); // 删除文件，或者空文件夹，不能删除非空文件夹，删除后的文件不会进入到回收站


    }
}
