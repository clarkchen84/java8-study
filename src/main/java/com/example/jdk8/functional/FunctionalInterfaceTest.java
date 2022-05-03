package com.example.jdk8.functional;

/**
 *
 * 通过自定义的FunctionalInterface 完成Lambda 表达式的使用
 *
 * @Author: sizhe.chen
 * @Date: Create in 11:01 上午 2022/5/2
 * @Description:
 * @Modified:
 * @Version:
 */

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        FunctionalInterfaceTest test = new FunctionalInterfaceTest();
        test.test(() -> System.out.println( " create my FunctionalInterface"));

    }
    public void test(FunctionalInterFaceDefinition functionalInterFaceDefinition){
        System.out.println("---------");
        functionalInterFaceDefinition.test();
        System.out.println("---------");
        //看一下 lambda 表达式的类型(class com.example.jdk8.factional.FunctionalInterfaceTest$$Lambda$14/0x0000000800b4d840)
        System.out.println(functionalInterFaceDefinition.getClass());
        //class java.lang.Object
        System.out.println(functionalInterFaceDefinition.getClass().getSuperclass());
    }
}


