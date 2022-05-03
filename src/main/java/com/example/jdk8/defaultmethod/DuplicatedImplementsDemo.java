package com.example.jdk8.defaultmethod;

/**
 * 如何处理一个类同时实现两个接口。 当这两个接口有两个相同的方法名
 *
 * @Author: sizhe.chen
 * @Date: Create in 10:31 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class DuplicatedImplementsDemo implements MyInterface1,MyInterface2{
    @Override
    public void myMethod() {
        MyInterface1.super.myMethod();
    }
}
