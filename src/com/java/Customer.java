package com.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {

        Customer c1 = new Customer("John", 20);
        Customer c2 = new Customer("John", 20);

        System.out.println("hash1 : " + c1.hashCode());
        System.out.println("hash2 : " + c2.hashCode());

        HashSet<Customer> customerSet = new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);
        System.out.println(customerSet.size());


        Employee emp1 = new Employee("Martin", 27);
        System.out.println("emp1 : " + emp1.getName());

        Map<Employee, String> hm = new HashMap<>();
        hm.put(emp1, "Verified");
        emp1.setName("John");

        System.out.println("emp1 : " + emp1.getName());

        System.out.println(hm.get(emp1));
    }
}
