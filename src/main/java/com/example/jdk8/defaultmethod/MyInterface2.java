package com.example.jdk8.defaultmethod;

/**
 * @Author: sizhe.chen
 * @Date: Create in 10:28 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public interface MyInterface2 {
    default  void myMethod(){
        System.out.println("MyInterface2");
    }
}
