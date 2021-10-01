package com.java.java8;

public class StringConceptApplication {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        System.out.println(str1);

        String s1 = new String("nitish");
        String s5 = new String("nitish");
        s1.concat("kumar");
        s1 = s1.concat(" prajapati");
        String s3 = "nitish";
        String s4 = "nitish";

        System.out.println(s1 + " | " + s3 + " | " + s4);

        System.out.println(s3 == s4);
        System.out.println(s1 == s5);

        StringBuilder builder = new StringBuilder("Nittu");
        builder.append("niitt");
        System.out.println(builder);

        System.out.println(builder.equals("Nittuniitt"));

        StringBuffer builder1 = new StringBuffer("Nittu");
        builder1.append("niitt");
        System.out.println(builder1);

        System.out.println(builder1.toString().equals("Nittuniitt"));


//        System.out.println(null);
    }
}
