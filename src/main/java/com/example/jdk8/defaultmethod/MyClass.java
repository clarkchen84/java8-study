package com.example.jdk8.defaultmethod;

/**
 * default 方法的简单举例
 *
 * @Author: sizhe.chen
 * @Date: Create in 10:14 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

interface MyInterface {
    default void myMethod(){
        System.out.println("MyInterface");
    }
}

public  class MyClass implements MyInterface{
    public static void main(String[] args) {
        new MyClass().myMethod();
    }

}
