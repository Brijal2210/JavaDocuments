package com.lecture11.parsing;

public class StringParsingClass {
    //-- When you assign a value of primitive data type to non-primitive.
    //String--> int, double, float
    //int, double,float -->String
    public static void main(String[] args) {
        String x ="Brijal"; // convert into int
        int  a = Integer.parseInt(x);
        System.out.println(x);
        System.out.println(a);

    }
}
