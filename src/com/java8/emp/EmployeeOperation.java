package com.java8.emp;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//find the average of salary then print the employee above and below avg salary
public class EmployeeOperation {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Rahul", 1, 2300.0, "lucknow"),
                new Employee("Rahul", 1, 5000.0, "Mumbai"),
                new Employee("Rahul", 1, 10000.0, "Nagpur"),
                new Employee("Rahul", 1, 15000.0, "Bangalore"),
                new Employee("Rahul", 1, 43000.0, "Delhi"));

        Double avgSalary = averageSalary(list);
        System.out.println(avgSalary);
        printTheEmployee(list, avgSalary);


    }

    private static Double averageSalary(List<Employee> list) {
        return list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    }

    private static void printTheEmployee(List<Employee> list, Double avgSalary) {

        Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(
                emp -> emp.getSalary() > avgSalary ? "above" : "below"));
        List<Map.Entry<String, List<Employee>>> listAbove = map.entrySet().stream().collect(Collectors.toList());

        for (Map.Entry<String, List<Employee>> variable : listAbove) {
            System.out.println(variable.getKey());
            System.out.println("--------");
            for (Employee e : variable.getValue()) {
                System.out.println(e.getEmpName() + "::" + e.getSalary());

            }

        }


    }
}
