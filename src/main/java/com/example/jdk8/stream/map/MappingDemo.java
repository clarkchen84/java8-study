package com.example.jdk8.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * {@link Stream#map(Function)} 的简单事例
 *
 * @Author: sizhe.chen
 * @Date: Create in 4:48 下午 2022/5/4
 * @Description:
 * @Modified:
 * @Version:
 */

public class MappingDemo {
    public static void main(String[] args) {

        // 将一组String类型的词组的首字母转换为大写
        List<String> words = Arrays.asList("hello","world", "hello world");

        words.stream()
                .map(word -> word.substring(0,1).toUpperCase(Locale.ROOT) + word.substring(1))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 求出每一个数字的平方
        List<Integer> values = Arrays.asList(1,2,3,4,5);
        values.stream()
                .map(i -> i*i)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
