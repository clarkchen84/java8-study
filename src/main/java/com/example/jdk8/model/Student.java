package com.example.jdk8.model;

/**
 * @Author: sizhe.chen
 * @Date: Create in 8:30 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class Student {
    private String name;
    private int score;
    private String address;
    private int age;



    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        this.address = "北京";
        this.age = 18;
    }


    public Student(String name, int score,int age) {
        this.name = name;
        this.score = score;
        this.address = "";
        this.age = 18;
    }

    public Student(String name, int score,String address,int age) {
        this.name = name;
        this.score = score;
        this.age = age;
        this.address = address;
    }


    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
