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

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
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

}
