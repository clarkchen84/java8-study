package com.example.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 如果一个Stream， 只有中间操作，没有终止操作，那么所有的中间操作都不会被执行
 * 这个例子将一组字符串的首字母大写，其他不变， 当执行终止操作的时候，会执行打印语句，
 * 但是在不执行终止操作的时候，不会执行打印语句。
 *
 * @Author: sizhe.chen
 * @Date: Create in 9:15 上午 2022/5/22
 * @Description:
 * @Modified:
 * @Version:
 */

public class MiddleOperationNotExecuted {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");

        list.stream().map(str ->{
                    str = str.substring(0,1) + str.substring(1);
                    System.out.println("没有使用终止操作，中间不会执行：" + str);
                    return str;
                });
        list.stream().map(str ->{
            str = str.substring(0,1) + str.substring(1);
            System.out.println("这个中间操作会被执行：" + str);
            return str;
        }).collect(Collectors.toList());
    }

}
