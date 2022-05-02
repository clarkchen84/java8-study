package com.example.jdk8.lambda;

import javax.print.attribute.IntegerSyntax;
import java.util.Arrays;
import java.util.List;

/**
 * 演示一个几个的集中遍历方式的演化，以及使用Lambda表达式的集中写法
 *
 *
 * @Author: sizhe.chen
 * @Date: Create in 10:12 上午 2022/5/2
 * @Description:
 * @Modified:
 * @Version:
 */
public class LoopTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // jdk 1.4 遍历集合的方法
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        System.out.println("--------------------");
        for (Integer i: integers) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        integers.forEach(i -> System.out.println(i));
        System.out.println("--------------------");
        integers.forEach((Integer i) -> System.out.println(i));
        System.out.println("--------------------");
        integers.forEach((Integer i) -> {
            System.out.println(i);// 使用执行体打括号的时候，必须要有分号
        });
    }
}
