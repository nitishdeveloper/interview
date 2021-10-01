package com.java.other;

import java.util.Date;
import java.util.HashMap;

public final class MyImmutable {
    private final String name;
    private final int age;
    private final Date date;
    private final HashMap<String, String> metadata;

    public MyImmutable(String name, int age, Date date1, HashMap<String, String> metadata) {
        this.name = name;
        this.age = age;
        this.date = new Date(date1.getTime());
        HashMap<String, String> temp = new HashMap<>();
//        metadata.entrySet().stream().forEach(entry -> {
//                    temp.put(entry.getKey() ,entry.getValue());
//                }
//        );
        metadata.forEach(temp::put);
        this.metadata = temp;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public HashMap<String, String> getMetadata() {
        return (HashMap<String, String>) metadata.clone();
    }

}

class RunMyImmutable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("firstname", "other");
        map.put("lastname", "prajapati");

        String name = "other";
        int age = 26;
        Date dob = new Date();


        MyImmutable immutable = new MyImmutable(name, age, dob, map);

        System.out.println("Before change");
        System.out.println("name : " + immutable.getName()
                + " | age : " + immutable.getAge()
                + " | date : " + immutable.getDate()
                + " | metadata : " + immutable.getMetadata()
        );


        name = "nittu";
        age = 27;
        dob.setDate(10);
        map.put("firstname", "nittu");
        System.out.println();
        System.out.println("After change");
        System.out.println("name : " + immutable.getName()
                + " | age : " + immutable.getAge()
                + " | date : " + immutable.getDate()
                + " | metadata : " + immutable.getMetadata()
        );
    }
}
