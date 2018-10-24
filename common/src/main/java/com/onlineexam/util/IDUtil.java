package com.onlineexam.util;

import java.io.RandomAccessFile;
import java.util.Random;

/**
 * ID 生成工具类
 */
public class IDUtil {

    /**
     * 题库题目名称 id 生成
     * @return
     */
    public static long genQuestionId() {
        // 取当前时间的长整形值包含毫秒
        long millis = System.currentTimeMillis();
        // 加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        // 如果不足二位就补 0
        String str = millis + String.format("%02d",end2);
        Long id = new Long(str);
        return id;
    }

    public static String genPaperId(){
        long millis = System.currentTimeMillis();
        Random random = new Random();
        int end2 = random.nextInt(99);
        String str = millis + String.format("%02d",end2);
        return str;
    }

}
