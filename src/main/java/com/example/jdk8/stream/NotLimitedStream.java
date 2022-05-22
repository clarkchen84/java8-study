package com.example.jdk8.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 创建一个无限流，如果无限流的第一个操作不是一个取得确定数量元素的操作，那么这个无限流将不会停止。
 *
 * @Author: sizhe.chen
 * @Date: Create in 9:34 上午 2022/5/22
 * @Description:
 * @Modified:
 * @Version:
 */

public class NotLimitedStream {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> (i + 2) % 2).distinct().limit(6).forEach(System.out::println);

       // IntStream.iterate(0, i -> (i + 2) % 2).limit(6).distinct().forEach(System.out::println);

    }
}
