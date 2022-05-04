package com.example.jdk8.stream.map;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 使用{@link Stream#filter(Predicate)} 过滤掉偶数
 *
 *
 * @Author: sizhe.chen
 * @Date: Create in 6:51 下午 2022/5/4
 * @Description:
 * @Modified:
 * @Version:
 */

public class FilterDemo {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);

        stream.filter(i -> i % 2  == 1).collect(Collectors.toList()).forEach(System.out::println);
    }
}
