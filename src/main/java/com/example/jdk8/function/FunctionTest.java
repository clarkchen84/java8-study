package com.example.jdk8.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        System.out.println(compute1(2,
                value-> value * 3,
                value-> value * value));
        System.out.println(compute1(2,
                value-> value * 3,
                value-> value * value));

        System.out.println(compute3(3,4,(a,b)-> a+b));



    }

    public static Integer compute1(Integer integer, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(integer);
    }

    public static Integer compute2(Integer integer, Function<Integer,Integer> function1, Function<Integer,Integer> function2){
        return function1.compose(function2).apply(integer);
    }

    public static Integer compute3(Integer a, Integer b, BiFunction<Integer,Integer,Integer> add){
       return  add.apply(a,b);

    }
}
