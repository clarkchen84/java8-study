package com.example.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * 方法引用的demo
 *
 * @Author: sizhe.chen
 * @Date: Create in 11:33 上午 2022/5/2
 * @Description:
 * @Modified:
 * @Version:
 */
public class MethodReferenceDemo {


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integers.forEach(System.out::println);

    }
}
