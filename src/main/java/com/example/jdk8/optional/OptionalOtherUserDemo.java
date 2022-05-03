package com.example.jdk8.optional;

import com.example.jdk8.model.Company;
import com.example.jdk8.model.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * {@link java.util.Optional } 的一些其他使用方法
 *
 * @Author: sizhe.chen
 * @Date: Create in 7:30 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class OptionalOtherUserDemo {

    public static void main(String[] args) {
        // 构造一个Company对象
        Employee employee = new Employee();
        employee.setName("张三");

        Employee employee2 = new Employee();
        employee2.setName("李四");

        Company company = new Company();
        company.setName("Bits");
        company.setEmployees(Arrays.asList(employee,employee2));


        // 使用Optional的函数式编程方法，得到一个员工列表
        System.out.println(getEmployee(company));

    }

    /**
     * 使用Optional的函数式编程方法，得到一个员工列表,利用了map和orElse方法
     *
     * @return
     */
    public static List<Employee> getEmployee(Company company){
        Optional<Company> optional = Optional.ofNullable(company);
        return optional.map(Company::getEmployees).orElse(Collections.emptyList());
    }
}
