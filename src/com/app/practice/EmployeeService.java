package com.app.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;



public class EmployeeService {

    //get highest paid employee for Each department
    public void getHighPaidEmpForEachDept(List<Employee> employeesList) {

        System.out.println("//get highest paid employee for Each department :");
        Map<String, Optional<Employee>> collect = employeesList.stream().collect(groupingBy(Employee::getDepartment,
                maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(collect);

    }
}
