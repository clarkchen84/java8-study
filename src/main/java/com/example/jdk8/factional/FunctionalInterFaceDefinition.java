package com.example.jdk8.factional;

/**
 * 举例说明什么样的接口才是一个FunctionalInterface
 *
 *
 * @Author: sizhe.chen
 * @Date: Create in 10:35 上午 2022/5/2
 * @Description:
 * @Modified:
 * @Version:
 */
@FunctionalInterface
public interface FunctionalInterFaceDefinition {

    void test();

    /*
        打开注释之后， 多个 函数的时候会报错
     */
    //void test2();

    /**
     * default 关键字修饰的函数不计入抽象函数累加
     */
    default void notAdd(){

    }

    /**
     * 重写了 Object 类的 {@link Object#equals(Object)} 方法， 不计入抽象函数累加
     * @param o
     * @return
     */
    @Override
    boolean equals(Object o);

}
