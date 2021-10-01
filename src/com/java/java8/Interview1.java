package com.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview1 {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        Employee e1 = new Employee(100, "Jems1", 10001.00);
        Employee e2 = new Employee(100, "Jems1", 10001.00);
        Employee e3 = new Employee(102, "Jems2", 10003.00);
        Employee e4 = new Employee(103, "Jems3", 10004.00);
        Employee e5 = new Employee(104, "Jems4", 10005.00);
        Employee e6 = new Employee(105, "Jems5", 10006.00);
        Employee e7 = new Employee(106, "Jems4", 10007.00);
        Employee e8 = new Employee(107, "Jems8", 10005.00);

        map.put(e1, "employee1");
        map.put(e2, "employee2");
        map.put(e3, "employee3");
        map.put(e4, "employee4");
        map.put(e5, "employee5");
        map.put(e6, "employee6");
        map.put(e7, "employee7");
        map.put(e8, "employee8");

        /*map.forEach((key, value) -> {
            System.out.println("hashcode1 : "+key.hashCode());
        });*/

//        System.out.println("map : "+map);

//        e1.setName("Jack");


        /*map.forEach((key, value) -> {
            System.out.println("hashcode2 : "+key.hashCode());
        });
*/
//        System.out.println("map : "+map);
        System.out.println("--------------------");

//        System.out.println(map.get(e1));

        List<Integer> employeeIdlist = map.entrySet().stream()
                .map(m -> m.getKey().getEmpId())
                .filter(k -> k >= 100)
                .collect(Collectors.toList());
        System.out.println("list : " + employeeIdlist);

        List<String> employeeNameList = map.keySet().stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("employeeList : " + employeeNameList);

        List<Double> distinctSalaryList = map.entrySet().stream()
                .map(k -> k.getKey().getSalary())
                .distinct().collect(Collectors.toList());
        System.out.println("distinctSalaryList : " + distinctSalaryList);

        Map<Double, Long> countingSalary = map.keySet().stream().map(Employee::getSalary)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("count same salary : " + countingSalary);


        Map<String, Long> countByName = map.entrySet().stream()
                .map(key -> key.getKey().getName())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("countByName : " + countByName);

        String employeeWithComma = map.entrySet().stream().map(key -> key.getKey().getName())
                .collect(Collectors.joining(","));

        System.out.println("employeeWithComma : " + employeeWithComma);

        Optional<Double> sumOfSalary = map.entrySet().stream().map(key -> key.getKey().getSalary())
                .reduce(Double::sum);
        System.out.println("sum of salary : " + sumOfSalary);


        Map<Double, Long> sortedByValueType1 = countingSalary.entrySet().stream().sorted((obj1, obj2) -> obj1.getValue().compareTo(obj2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        Map<Double, Long> sortedByValueType2 = countingSalary.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        Map<Double, Long> sortedByValueType3 = countingSalary.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                        ));

        System.out.println("sortedByValueType1 : " + sortedByValueType1);
        System.out.println("sortedByValueType2 : " + sortedByValueType2);
        System.out.println("sortedByValueType3 reverse order : " + sortedByValueType3);


        System.out.println("--------------------------------------");

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(100, "Jems1", 10001.00);
        Employee emp2 = new Employee(100, "Jems1", 10001.00);
        Employee emp3 = new Employee(102, "Jems2", 10003.00);
        Employee emp4 = new Employee(103, "Jems3", 10004.00);
        Employee emp5 = new Employee(104, "Jems4", 10005.00);
        Employee emp6 = new Employee(105, "Jems5", 10006.00);
        Employee emp7 = new Employee(106, "Jems4", 10007.00);
        Employee emp8 = new Employee(107, "Jems8", 10005.00);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);

        Map<String, Long> findTheEmployeesCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println("findTheEmployeesCount : " + findTheEmployeesCount);

        Map<Integer, Double> groupBySalarySum = employees.stream().collect(Collectors.groupingBy(Employee::getEmpId,
                Collectors.summingDouble(Employee::getSalary)));

        System.out.println("groupBySalarySum : " + groupBySalarySum);

//        List<String> val = map.entrySet().stream().map(v->v.)

//        Map<Integer, List<Employee>> findTheEmployeesIdCount = employees.stream().collect(Collectors.groupingBy(Employee::getEmpId));
//        System.out.println("findTheEmployeesIdCount : "+findTheEmployeesIdCount);

//        Map<Boolean, List<Employee>> partitionBy = employees.stream().collect(Collectors.partitioningBy(employee ->employee.getSalary().equals(10000.00)));
//        System.out.println("partitionBy : "+partitionBy);
    }
}
