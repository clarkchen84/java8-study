package com.example.jdk8.optional;

import java.util.Optional;

/**
 * {@link Optional} 的简单事例
 *
 * @Author: sizhe.chen
 * @Date: Create in 6:39 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */
public class OptionalDemo {

    public static void main(String[] args) {
        // 使用Optional 构造对象
        Optional<String> optional = Optional.ofNullable("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        // 使用isPreset 和 get 的例子
        if (optional.isPresent()){
            System.out.println(optional.get());
        }
        // 函数是风格的写法
        optional.ifPresent(t -> System.out.println(t));
        // 返回默认值
        System.out.println(optional.orElse("default value"));
        // 使用一个Supplier 当作参数，返回Supplier 提供的值
        optional.orElseGet(() -> "default value");
    }
}
