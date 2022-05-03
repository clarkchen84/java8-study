package com.example.jdk8.model;

import java.util.List;

/**
 * @Author: sizhe.chen
 * @Date: Create in 7:12 下午 2022/5/3
 * @Description:
 * @Modified:
 * @Version:
 */

public class Company {
    private String name;
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
