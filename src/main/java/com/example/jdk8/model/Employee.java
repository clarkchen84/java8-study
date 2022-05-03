package com.example.jdk8.model;

/**
 * @Author: sizhe.chen
 * @Date: Create in 7:12 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
