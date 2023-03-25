package com.overLoadingMethod;

public class OverloadingClass {
    //Overloading --  insert the things
    public  static void addition(){
        int a=10;
        int b=20;
        int c= a+b;
        System.out.println(c);
    }

    public static void addition(int a, int b){
        System.out.println(a+b);
    }
    /*public static int addition(int p, int q, int r){
        System.out.println(p+q+r);
    }

    public static int addition(int a, int b, int c){
        System.out.println(a+b+c);
    }*/
    public static void addition(String a, String b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        addition();
        addition(15,30);
        //addition(2,5,3);
        addition("Brijal", "Chothani");
    }
}
