package com.java8.emp;

/* author :  Ankul Deshpande */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//find the average of salary then print the employee above and below avg salary
public class EmployeeOperation {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("ankit bendarkar", 1, 2300.0, "lucknow", 30),
                new Employee("rahul wanway", 2, 5000.0, "Mumbai", 37),
                new Employee("ajay ranodkar", 3, 10000.0, "Nagpur", 28),
                new Employee("santosh panchlinkg", 4, 15000.0, "Bangalore", 45),
                new Employee("ragav chadda", 5, 43000.0, "Delhi", 46),
                new Employee("rinkki bondhankar", 6, 2300.0, "lucknow", 35),
                new Employee("brajmohan jha", 7, 23000.0, "patna", 28));

        EmployeeOperation employeeOperation = new EmployeeOperation();
        Double avgSalary = employeeOperation.averageSalary(list);
        System.out.println(avgSalary);
        employeeOperation.printTheEmployee(list, avgSalary);
        //filter Employee by name and city
        System.out.println("=======**=======");
        employeeOperation.firlEmpByNameAndCity(list);
        System.out.println("=======**=======");
        //whose earning salary >10000
        employeeOperation.findEmpSalaryGrtThan10Thond(list);
        System.out.println("=======**=======");
        //map empName to upper case
        employeeOperation.mappedUpperCaseName(list);
        System.out.println("=======**=======");

        //key : ankul deshpande value: AD(initial of the name)
        employeeOperation.initialAsValueFullNameAsKey(list);
        System.out.println("=======**=======");
        employeeOperation.sortByName(list);
        System.out.println("=======*:sort by age and salary:*=======");
        employeeOperation.sortByAgeAndSalary(list);
        System.out.println("=======*:grp by city:*=======");
        employeeOperation.grpByCIty(list);


    }

    private void grpByCIty(List<Employee> list) {
        Map<String, List<Employee>> cityMap = list.stream().
                collect(Collectors.groupingBy(Employee::getCityName));

        cityMap.forEach((key, values) -> {
            System.out.println(key + ":-");
            values.forEach(x -> System.out.println(x.getEmpName()));
            System.out.println();
        });
    }

    private void sortByAgeAndSalary(List<Employee> list) {
        List<Employee> sortByAgeAndSalary = list.stream().sorted(Comparator.comparing(Employee::getAge).
                thenComparing(Comparator.comparing(Employee::getSalary).reversed())).toList();
        System.out.println(sortByAgeAndSalary);
        sortByAgeAndSalary.forEach(x -> System.out.println(x.getAge() + " " + x.getSalary()));

        System.out.println("-----sort by -city and name------>>");
        List<Employee> sortByCityAndName = list.stream().sorted(Comparator.comparing(Employee::getCityName).
                thenComparing(Comparator.comparing(Employee::getEmpName).reversed())).toList();
        System.out.println(sortByAgeAndSalary);
        sortByCityAndName.forEach(x -> System.out.println(x.getCityName() + " " + x.getEmpName()));
    }

    private void sortByName(List<Employee> list) {
        List<Employee> sortedAccName = list.stream().
                sorted(Comparator.comparing(Employee::getEmpName)).toList();

        sortedAccName.forEach(x -> System.out.println(x.getEmpName()));
        System.out.println("-------------------");
        //you can reversed it by using reverse method
        List<Employee> sortedAccNameRev = list.stream().
                sorted(Comparator.comparing(Employee::getEmpName).reversed()).toList();
        sortedAccNameRev.forEach(x -> System.out.println(x.getEmpName()));
    }

    private void initialAsValueFullNameAsKey(List<Employee> list) {
        Map<String, Object> intialKY = list.stream().collect(Collectors.toMap(Employee::getEmpName, e -> initial(e)));
        System.out.println(intialKY);

    }

    private Object initial(Employee e) {
      /*  String[] arr = e.getEmpName().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i].charAt(0));
        }
        return sb;*/
        return Arrays.stream(e.getEmpName().split(" ")).map(s -> String.valueOf(s.charAt(0)))
                .collect(Collectors.joining());
    }


    //length and uppercase for emp Name:
    private void mappedUpperCaseName(List<Employee> list) {
        List<String> upList = list.stream().map(x -> x.getEmpName().toUpperCase()).toList();
        System.out.println(upList);
        upList.forEach(x -> System.out.println(x));
        List<Integer> nameLength = list.stream().map(x -> x.getEmpName().length()).toList();
        System.out.println(nameLength);
    }

    private void findEmpSalaryGrtThan10Thond(List<Employee> list) {

        List<Employee> slist = list.stream().filter(x -> x.getSalary() > 10000).toList();
        System.out.println(slist);
        slist.forEach((x) -> System.out.println(x.getEmpId() + " " + x.getEmpName()));
    }

    private void firlEmpByNameAndCity(List<Employee> list) {
        System.out.println("firlEmpByNameAndCity");
        List<Employee> filtered = list.stream().filter(e -> e.getCityName() == "lucknow")
                .toList();
        System.out.println(filtered);
        filtered.forEach(x -> System.out.println(x.getEmpName()));
    }

    private Double averageSalary(List<Employee> list) {
        return list.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    }

    private void printTheEmployee(List<Employee> list, Double avgSalary) {

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
        System.out.println("--------------");
        map.forEach((salary, employees) -> {
            System.out.println("salary " + salary);
            employees.forEach(e -> System.out.println("Employees : " + e.getEmpName()));

        });


    }
}
