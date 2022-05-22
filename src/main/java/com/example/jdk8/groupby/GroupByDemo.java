package com.example.jdk8.groupby;

import com.example.jdk8.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 对 {@link com.example.jdk8.model.Student} 进行分组
 *
 *
 * @Author: sizhe.chen
 * @Date: Create in 1:06 下午 2022/5/22
 * @Description:
 * @Modified:
 * @Version:
 */

public class GroupByDemo {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("zhangsan", 100, 20),
                new Student("lisi", 90, 20),
                new Student("wangwu", 90, 30),
                new Student("zhaoliu", 80, 40 )

        );

        // Select * from student group by name
        Map<String,List<Student>> studentMap = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(studentMap);

        //Select name, count(*) Group By name
        Map<String,Long> nameCount = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
        System.out.println(studentMap);


    }
}
