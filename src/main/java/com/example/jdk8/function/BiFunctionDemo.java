package com.example.jdk8.function;

import java.util.function.BiFunction;

/**
 * {@link java.util.function.BiFunction} 演示 加减乘除
 * @Author: sizhe.chen
 * @Date: Create in 10:20 下午 2022/5/2
 * @Description:
 * @Modified:
 * @Version:
 */

public class BiFunctionDemo {

    public static void main(String[] args) {
        // 加法
        System.out.println(compute(1, 2, (i, j) -> i + j));
        // 减法
        System.out.println(compute(2, 1, (i, j) -> i - j));
        // 乘法
        System.out.println(compute(2, 3, (i, j) -> i * j));
        // 除法
        System.out.println(compute(6, 3, (i, j) -> i / j));

    }

    public static int compute(int a, int b, BiFunction<Integer,Integer,Integer> function){
        return function.apply(a,b);
    }
}
