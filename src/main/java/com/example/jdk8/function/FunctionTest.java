package com.example.jdk8.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Fuction 接口的default 函数的两个简单的使用
 */
public class FunctionTest {
    public static void main(String[] args) {

        System.out.println(compute(2, value -> value * value));

        System.out.println(compute1(2,
                value-> value * 3,
                value-> value * value));

        System.out.println(compute2(2,
                value-> value * 3,
                value-> value * value));
    }

    public static int compute(int a ,Function<Integer,Integer> function ){
        return  function.apply(a);
    }

    /**
     *  使用 andThen
     * @param integer
     * @param function1
     * @param function2
     * @return
     */
    public static Integer compute1(Integer integer, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(integer);
    }

    /**
     *
     * @param integer
     * @param function1
     * @param function2
     * @return
     */
    public static Integer compute2(Integer integer, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.compose(function2).apply(integer);
    }
}
