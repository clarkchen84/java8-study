package com.example.jdk8.creatstream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 常见的几种创建流的方式
 *
 * @Author: sizhe.chen
 * @Date: Create in 11:36 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class CreateStreamDemo {
    public static void main(String[] args) {
        // 方式1
        Stream<String> type1 = Stream.of("hello", "world", "hello world");

        // 方式2 -> 本质与方法1 一致 都是通过Arrays.stream()方式创建的。
        String[] array = new String[]{"hello", "world", "hello world"}  ;
        Stream<String> type2 = Stream.of(array);


        // 方式3
        List<String> list = Arrays.asList("hello", "world", "hello world");
        Stream<String> type3 = list.stream();

        // 方式4 (用于生成无限流)
        Stream<String> stream = Stream.generate(() -> "hello" + new Random().nextInt());

    }
}
