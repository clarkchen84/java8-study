package com.example.jdk8.stream.map;

import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * {@link Stream#findFirst()} 的简单例子
 *
 * @Author: sizhe.chen
 * @Date: Create in 5:57 下午 2022/5/4
 * @Description:
 * @Modified:
 * @Version:
 */

public class FindFirstDemo {

    public static void main(String[] args) {
        Stream<String> stream = Stream.generate( UUID.randomUUID()::toString);

       stream.findFirst().stream().findFirst().ifPresent(System.out::println);
    }
}
