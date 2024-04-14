package com.zsy.File;

import java.io.File;
import java.util.Arrays;

public class FileDemo04 {
    public static void main(String[] args) {
        String path = "E:\\TQData";

        File file = new File(path);

        String[] list = file.list(); // 获取当前目录下所有的一级文件名称到一个字符串数组中
        System.out.println(Arrays.toString(list));

        System.out.println("-----");

        /**
         * 当主调是文件，或者路径不存在时，返回 null
         * 当主调是一个空文件夹时，返回一个长度为 0 的数组
         */
        File[] files = file.listFiles(); // 获取当前目录下所有的一级文件对象到一个文件对象数组中
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
