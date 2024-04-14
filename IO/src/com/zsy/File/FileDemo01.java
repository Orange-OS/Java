package com.zsy.File;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileDemo01 {
    public static void main(String[] args) {
        File f1 = new File("E:\\TQData");
        String[] folderNameArray = f1.list();
        for(String folderName : folderNameArray) {
            System.out.println(folderName);
        }

        System.out.println("-----");

        /**
         * listFiles 方法注意事项
         * 当主调是文件，或者路径不存在时，返回 null
         * 当主调是空文件夹时，返回一个长度为 0 的数组
         */
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            File[] files1 = file.listFiles();
        }

        System.out.println("-----");


        List<File> list = Arrays.asList(files);
        System.out.println(list);

        // 反转
        Collections.reverse(list);
        System.out.println(list);

        // 随机
        Collections.shuffle(list);
        System.out.println(list);

        // 根据元素的自然顺序对 list 集合元素按升序排序
        Collections.sort(list);
        System.out.println(list);

    }

}
