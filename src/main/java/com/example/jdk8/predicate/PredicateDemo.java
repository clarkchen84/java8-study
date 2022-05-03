package com.example.jdk8.predicate;

import java.util.Arrays;
import java.util.List;
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
        //简单使用
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("hello"));

        List<Integer> arrays = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //找到所有奇数
        findByCondition(arrays, i -> i % 2 == 1);
        findAllOdds(arrays);
        //找到所有偶数
        findByCondition(arrays, i -> i % 2 == 0);
        findAllEvents(arrays);
    }


    /**
     * 通过传递行为，查询
     * @param arrays
     */
    public static  void  findByCondition(List<Integer> arrays,Predicate<Integer> integerPredicate){
        System.out.println(" findByCondition ");
        for (int i: arrays) {
            if(integerPredicate.test(i)){
                System.out.print(i +" ") ;
            }
        }
        System.out.println();
    }

    /**
     * 查询奇数
     * @param arrays
     */
    public static void findAllOdds(List<Integer> arrays){
        System.out.println(" findAllOdds by method");
        for (int i: arrays) {
            if(i % 2 == 1){
                System.out.print(i +" ") ;
            }
        }
        System.out.println();
    }

    /**
     * 查询偶数
     * @param arrays
     */
    public static void findAllEvents(List<Integer> arrays){
        System.out.println(" findAllEvents by method");
        for (int i: arrays) {
            if(i % 2 == 0){
                System.out.print(i +" ") ;
            }
        }
        System.out.println();
    }

}
