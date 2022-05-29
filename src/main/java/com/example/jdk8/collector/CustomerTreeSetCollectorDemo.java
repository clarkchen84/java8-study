package com.example.jdk8.collector;

import com.example.jdk8.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 实现一个自定义的收集器，返回一个TreeSet 代替{@link Collectors#toSet()} ()}
 *
 * @Author: sizhe.chen
 * @Date: Create in 10:46 下午 2022/5/29
 * @Description:
 * @Modified:
 * @Version:
 */

public class CustomerTreeSetCollectorDemo {


    public static void main(String[] args) {
        // 将一个Student 类型的列表，转化为一个student姓名的TreeSet的 集合
        //1. 传递参数的方式实现
        List<Student> students = Arrays.asList(new Student("张三",100,18),new Student("李四",95,20),new Student("王五",90,18));
        TreeSet<String> names = students.stream().map(Student::getName).collect(TreeSet::new, Set::add, Set::addAll);
        System.out.println(names);
        // 2. 实现一个自定义的Collector类
        names = students.stream().map(Student::getName).collect(new Collector<String, Set<String>, TreeSet<String>>() {
            @Override
            public Supplier<Set<String>> supplier() {
                return TreeSet::new;
            }

            @Override
            public BiConsumer<Set<String>, String> accumulator() {

                return Set::add;
            }

            @Override
            public BinaryOperator<Set<String>> combiner() {
                return (strings, c) -> {strings.addAll(c); return strings;};
            }

            @Override
            public Function<Set<String>, TreeSet<String>> finisher() {
                return t -> (TreeSet<String>) t;
            }


            @Override
            public Set<Characteristics> characteristics() {
                return Set.of(Characteristics.IDENTITY_FINISH);
            }
        });



        System.out.println("implements by Collecor" + names);

    }
}
