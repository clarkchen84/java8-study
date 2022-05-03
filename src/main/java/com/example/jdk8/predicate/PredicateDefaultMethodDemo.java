package com.example.jdk8.predicate;

import java.util.function.Predicate;

/**
 * {@link Predicate}的默认函数的用法
 *
 * @Author: sizhe.chen
 * @Date: Create in 11:20 上午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class PredicateDefaultMethodDemo {

    public static void main(String[] args) {

        testAnd();
        testOr();
        testNegate();


    }

    /**
     * {@link Predicate#and(Predicate) 的使用方法介绍}
     */
    public static void testAnd(){
        Predicate<Object> trueValue1 = (value) -> true;
        Predicate<Object> trueValue2 = (value) -> true;
        Predicate<Object> falseValue1 = (value) -> false;
        Predicate<Object> falseValue2= (value) -> false;
        System.out.println( trueValue1.and(trueValue2).test(null));
        System.out.println( trueValue1.and(falseValue1).test(null));
        System.out.println( falseValue1.and(falseValue2).test(null));
    }

    /**
     * {@link Predicate#or(Predicate) 的使用方法介绍}
     */
    public static void testOr(){
        Predicate<Object> trueValue1 = (value) -> true;
        Predicate<Object> trueValue2 = (value) -> true;
        Predicate<Object> falseValue1 = (value) -> false;
        Predicate<Object> falseValue2= (value) -> false;
        System.out.println( trueValue1.or(trueValue2).test(null));
        System.out.println( trueValue1.or(falseValue1).test(null));
        System.out.println( falseValue1.or(falseValue2).test(null));
    }
    /**
     * {@link Predicate#negate()} (Predicate) 的使用方法介绍}
     */
    public static void testNegate(){
        Predicate<Object> trueValue= (value) -> true;

        Predicate<Object> falseValue = (value) -> false;

        System.out.println( trueValue.negate().test(null));
        System.out.println( falseValue.negate().test(null));

    }


}
