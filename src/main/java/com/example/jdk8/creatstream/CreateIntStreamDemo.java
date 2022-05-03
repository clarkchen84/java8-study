package com.example.jdk8.creatstream;

import java.util.stream.IntStream;

/**
 * IntStream的集中常见的创建方式
 *
 *
 * @Author: sizhe.chen
 * @Date: Create in 11:48 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class CreateIntStreamDemo {

    public static void main(String[] args) {
        //方式1  左闭 右开区间
        IntStream type1  = IntStream.range(1,10);
        type1.forEach(System.out::println);

        // 方式2 全闭包区间
        IntStream type2  = IntStream.rangeClosed(1,10);
        type2.forEach(System.out::println);
    }
}
