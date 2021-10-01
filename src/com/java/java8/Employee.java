package com.java.java8;

import java.util.Objects;

public class Employee {

    private int empId;
    private String name;
    private Double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee : {" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*@Override
    @Override
    public int compareTo(Employee o) {
        return this.getEmpId() - o.getEmpId();
    }*/

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, salary);
    }

}
