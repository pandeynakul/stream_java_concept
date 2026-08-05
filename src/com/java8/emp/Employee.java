package com.java8.emp;

/* author :  Ankul Deshpande */

public class Employee {

    private String empName;


    private Integer empId;
    private Double salary;
    private String cityName;
    private Integer age;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(String empName, Integer empId, Double salary, String cityName, Integer age) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
        this.cityName = cityName;
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", cityName='" + cityName + '\'' +
                ", age=" + age +
                '}';
    }

}
