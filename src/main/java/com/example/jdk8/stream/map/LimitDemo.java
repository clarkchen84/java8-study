package com.example.jdk8.stream.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 利用{@link java.util.stream.Stream#limit(long)}从无限流中截取指定数量的元素
 * @Author: sizhe.chen
 * @Date: Create in 6:45 下午 2022/5/4
 * @Description:
 * @Modified:
 * @Version:
 */

public class LimitDemo {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.iterate(1, i -> i *2);

        System.out.println(integerStream.limit(6).collect(Collectors.toList()));

    }
}
