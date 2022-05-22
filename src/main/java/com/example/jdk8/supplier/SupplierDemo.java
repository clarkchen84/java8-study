package com.example.jdk8.supplier;

import java.util.function.Supplier;

/**
 *
 * {@link java.util.function.Supplier}的一个简单例子
 *
 * @Author: sizhe.chen
 * @Date: Create in 12:04 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */
public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";

        System.out.println(supplier.get());
    }
}
