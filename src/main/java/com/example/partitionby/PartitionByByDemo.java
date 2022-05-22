package com.example.partitionby;

import com.example.jdk8.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 对 {@link Student} 进行分区
 *
 *
 * @Author: sizhe.chen
 * @Date: Create in 1:06 下午 2022/5/22
 * @Description:
 * @Modified:
 * @Version:
 */

public class PartitionByByDemo {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("zhangsan", 100, 20),
                new Student("lisi", 90, 20),
                new Student("wangwu", 90, 30),
                new Student("zhaoliu", 80, 40 )

        );

        // 对学生的分数大于90分的进行分区
        Map<Boolean,List<Student>> studentMap = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 90 ));
        System.out.println(studentMap);


    }
}
