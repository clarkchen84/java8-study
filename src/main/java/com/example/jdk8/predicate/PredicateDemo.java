package com.example.jdk8.predicate;

import java.util.function.Predicate;

/**
 * {@link Predicate}的简单用法
 *
 * @Author: sizhe.chen
 * @Date: Create in 8:42 上午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;

        System.out.println(predicate.test("hello"));

    }
}
