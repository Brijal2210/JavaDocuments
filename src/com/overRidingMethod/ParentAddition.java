package com.overRidingMethod;

public class ParentAddition {
    public static void addition(float a, float b){ // overloading
        System.out.println(a+b);
    }

    public static void addition(int a, int b, int c){ // overloading
        System.out.println(a+b+c);
    }
    public static void subtraction( int p, int q){
        System.out.println(p-q);
    }
    public static void subtraction( int x, int y, int z){
        System.out.println(x-y-z);
    }

    public static void main(String[] args) {



    }
}
