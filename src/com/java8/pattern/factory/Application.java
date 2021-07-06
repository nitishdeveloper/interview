package com.java8.pattern.factory;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("--------- Menu ---------");
        System.out.println("1. Maruti");
        System.out.println("2. Tata");
        System.out.println("3. Ford");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n > 0 && n < 4){
            System.out.println(new CarFactory().getBrand(CarType.values()[n-1]).buy());
        }
        else {
            System.out.println("not a valid input");
        }
    }
}
