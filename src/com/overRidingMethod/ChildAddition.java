package com.overRidingMethod;

public class ChildAddition extends ParentAddition{

    public static void addition(float a, float b){ // overriding through the inheritance
        float c = a+b;                             // you can change your logic in overriding
        System.out.println(c);
    }
    public static void addition(int a, int b, int c){ // overriding
        int d = a+b+c;
        System.out.println(d);
    }public static void subtraction( int p, int q){
       int r = p-q;
        System.out.println(r);
    }
    public static void subtraction( int x, int y, int z){
        int w= x-y-z;
        System.out.println(w);
    }



    public static void main(String[] args) {
        addition(10.15f,12.58f);
        addition(10,20,30);
        subtraction(20,40);
        subtraction(100,50,25);

    }

}
