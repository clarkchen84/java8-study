package com.example.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * 打出列表中长度为5的单词，对5个单词进行Map 转换，过滤（filter）。由于过findFirst的存在，在Map中的操作中的打印操作只值进行了2次，这就是stream 的短路操作,
 * 终止操作会对中间操作进行短路。
 * @Author: sizhe.chen
 * @Date: Create in 11:26 上午 2022/5/22
 * @Description:
 * @Modified:
 * @Version:
 */

public class PrintLength5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("helloworld","hello", "world", "zhansan","lisi","wangwu");

        list.stream().mapToInt(str-> {
            System.out.println(str);
            return str.length();
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);


    }
}
