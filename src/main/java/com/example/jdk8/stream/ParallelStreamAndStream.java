package com.example.jdk8.stream;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * 比较串行流和并行流
 *
 *
 * @Author: sizhe.chen
 * @Date: Create in 10:58 上午 2022/5/22
 * @Description:
 * @Modified:
 * @Version:
 */

public class ParallelStreamAndStream {
    public static void main(String[] args) {
        List<String> list=  new ArrayList<>(5000000);// 生成500w调数据
        for (int i = 0 ;i < 5000000; i ++){
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("开始排序 流");
        long startTme = System.nanoTime();

        list.parallelStream().map(String::toLowerCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        long endTime =System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime-startTme));

        System.out.println("开始排序 串行流");
         startTme = System.nanoTime();

        list.stream().map(String::toLowerCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
         endTime =System.nanoTime();
        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime-startTme));





    }
}
