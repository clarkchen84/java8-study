package com.example.jdk8.model;

/**
 * @Author: sizhe.chen
 * @Date: Create in 10:34 下午 2022/5/2
 * @Description:
 * @Modified:
 * @Version:
 */

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
