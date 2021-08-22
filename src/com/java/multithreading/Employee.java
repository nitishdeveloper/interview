package com.java.multithreading;

public class Employee{

    private void printSalary(int salary)
    {
        System.out.println("Salary without bonus : "+salary);

    }
    void printSalary(int s1, int s2)
    {
        System.out.println("S1 : "+s1 +" S2 :"+s2);
    }

    public void printSalary(String str1,String str2)
    {
        System.out.println("str1: "+str1+" str2 : "+str2);
    }

    protected int printSalary(int salary, int bonus , int compoff)
    {
        return (salary+bonus+compoff);
    }
    protected String printSalary(int salary, int bonus , double compoffs)
    {
        return "(salary+bonus+compoffs)";
    }

    public static void main(String args[])
    {

        Employee e1=new Employee();

        e1.printSalary(20000);
        System.out.println("**********************");
        e1.printSalary(20000, 10000);
        System.out.println("**********************");
        e1.printSalary("20000", "10000");
        System.out.println("**********************");
        e1.printSalary(20000, 10000);
        System.out.println("**********************");
        System.out.println("total : "+e1.printSalary(100, 200 ,300));
    }
}
