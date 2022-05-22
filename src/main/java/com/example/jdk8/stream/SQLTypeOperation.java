package com.example.jdk8.stream;

import com.example.jdk8.model.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 把一个流当成一个sql 操作 `Select * from Student where score > 80 and address = '北京' order by age desc`
 *
 * @Author: sizhe.chen
 * @Date: Create in 10:00 上午 2022/5/22
 * @Description:
 * @Modified:
 * @Version:
 */

public class SQLTypeOperation {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("张三",90,"北京",18),

                new Student("李四",90,"北京",19),
                new Student("王武",90,"大连",19),
                new Student("赵六",85,"北京",19),
                new Student("刘七",60,"北京",19)
        );
        System.out.println(students.stream().filter(student -> student.getScore() > 80 && "北京".equals(student.getAddress()))
                .sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList()));
    }
}
