package com.example.jdk8.optional;

import com.example.jdk8.model.Company;
import com.example.jdk8.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 传统的编程方式，和函数是编程的方式 {@link java.util.Optional} 进行比较
 *
 * @Author: sizhe.chen
 * @Date: Create in 7:14 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class OptionalCompareDemo {

    public static void main(String[] args) {
        // 构造一个Company对象
        Employee employee = new Employee();
        employee.setName("张三");

        Employee employee2 = new Employee();
        employee2.setName("李四");

        Company company = new Company();
        company.setName("Bits");
        company.setEmployees(Arrays.asList(employee,employee2));


        List<Employee> employeeList = company.getEmployees();

        // 使用传统的方式
        traditional(employeeList);
        // 使用java8的函数是编程的方式做
        java8(employeeList);

    }

    /**
     * 使用传统的方式
     *
     * @param employees
     * @return
     */
    public  static List<Employee> traditional(List<Employee> employees){
        if( null != employees ){
            return employees;
        }
        return null;
    }

    /**
     * 函数是编程的方式
     *
     * @param employees
     * @return
     */
    public  static List<Employee> java8(List<Employee> employees){
        return Optional.ofNullable(employees).orElse(null);
    }
}
