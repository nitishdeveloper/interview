package com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


interface A {
    void save();
}

interface B {
    void save();
}

class D {
    void save() {
        System.out.println("i m d");
    }
}

class C extends D implements A, B {

    @Override
    public void save() {
        System.out.println("value");
    }
}


class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}


public class UsageOfFilter {
    public static void main(String[] args) {

        D see = new C();
        see.save();
        see.save();

        //java7
        List<Product> ans = new ArrayList<>();
        for (Product plist : getProducts()) {
            if (plist.getPrice() > 25000) {
                ans.add(plist);
            }
        }
        System.out.println(ans);

        //in java8
        List<Product> anss = getProducts().stream().filter(val -> val.getPrice() > 30000f).collect(Collectors.toUnmodifiableList());
        System.out.println(anss);
        getProducts().stream().filter(val -> val.getPrice() > 30000f).forEach(System.out::println);
        getProducts().parallelStream().filter(val -> val.getPrice() > 30000f).forEach(System.out::println);


    }

    private static List<Product> getProducts() {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        return productsList;
    }
}


