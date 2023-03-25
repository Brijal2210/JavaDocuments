package com.amazon.onlineShopping;

public class TypeOfVariables {

    //INSTANCE AND GLOBAL VARIABLE -- without static keyword
    //STATIC VARIABLE -- with static keyword
    int a = 10; //global
    static String myName = "Brijal" ; //static
    public static void main(String[] args) {

        // LOCAL VARIABLE -- without static keyword
        int a = 2;
        double b = 5.5;  //local
        System.out.println(a);
        System.out.println(b);

    }
    public static void myMethod() {   //User-define Method
         int a = 5;
         int b = 2;
         int c = 5;
         String myName = "jatin"; //local
        System.out.println(a+b+c);
    }

}
