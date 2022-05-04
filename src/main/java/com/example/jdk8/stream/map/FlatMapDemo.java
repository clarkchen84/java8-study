package com.example.jdk8.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * {@link Stream#flatMap(Function)}
 * 
 * @Author: sizhe.chen
 * @Date: Create in 5:28 下午 2022/5/4
 * @Description:
 * @Modified:
 * @Version:
 */

public class FlatMapDemo {
    public static void main(String[] args) {

        // 一个FlatMap 简单例子 将所有list中的元素进行平方处理
        Stream<List<Integer>> stream =  Stream.of(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5,6));
        System.out.println(stream.flatMap(List::stream).map(item -> item * item).collect(Collectors.toList()));
    }
}
