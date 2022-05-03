package com.example.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/**
 * 方法引用的例子
 *
 * @Author: sizhe.chen
 * @Date: Create in 11:33 上午 2022/5/2
 * @Description:
 * @Modified:
 * @Version:
 */
public class MethodReferenceDemo {


    public static void main(String[] args) {
        List<String> strs = Arrays.asList("hello","world", "hello world");
        // lambda 表达是的方式
        strs.forEach( item -> System.out.println(item));
        // 方法引用的方式
        strs.forEach(System.out::println);

        // 方法引用一共有四类
        // 1. 类名静态方法名的方式
        // 构造Student
        Student student1 = new Student("zhangsan",90);
        Student student2 = new Student("lisi",85);
        Student student3 = new Student("wangwu",60);
        Student student4 = new Student("zhaoliu", 75 );

        List<Student> students = Arrays.asList(student1,student2,student3,student4);
        //lambda 的形式
        Collections.sort(students, (s1, s2) ->  Student.compareStudentByName(s1,s2));
        // 方法引用的形式
        Collections.sort(students, Student::compareStudentByName);

        // 2. 对象::方法名
        StudentComparator studentComparator = new StudentComparator();
        //lambda 的形式
        Collections.sort(students, (s1, s2) ->  studentComparator.compareStudentByName(s1,s2));
        // 方法引用的形式
        Collections.sort(students, studentComparator::compareStudentByName);

        // 3. 类名::实例方法名
        //lambda 的形式
        Collections.sort(students, (s1, s2) ->  s1.compareByName(s2));
        // 方法引用的形式
        Collections.sort(students, Student::compareByName);

        // 4. 类名::new
        Supplier<Student> supplier = Student::new;
    }

    static class StudentComparator{
        /**
         * 学生按照分数排序
         * @return
         */
        public   int compareStudentByScore(Student student1, Student student2){
            return  student1.getScore() - student2.getScore();
        }

        /**
         * 学生按照名字的自然顺序进行排序
         * @return
         */
        public   int compareStudentByName(Student student1, Student student2){
            return  student1.getName().compareTo(student2.getName());
        }
    }

    static  class Student {
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

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }

        /**
         * 学生按照分数排序
         * @return
         */
        public static  int compareStudentByScore(Student student1, Student student2){
             return  student1.getScore() - student2.getScore();
        }

        /**
         * 学生按照名字的自然顺序进行排序
         * @return
         */
        public static  int compareStudentByName(Student student1, Student student2){
            return  student1.getName().compareTo(student2.getName());
        }

        /**
         * 学生按照分数排序
         * @return
         */
        public   int compareByScore(Student student){
            return  this.getScore() - student.getScore();
        }

        /**
         * 学生按照名字的自然顺序进行排序
         * @return
         */
        public   int compareByName(Student student){
            return  this.getName().compareTo(student.getName());
        }


    }



}
