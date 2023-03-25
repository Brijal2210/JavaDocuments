package com.allMethodPkg;

public class SimpleMethdClass {
    //Main method, Pre-define method, User-Define method
    // Pre-define method- method define by java
    // User-define Method
    //Defining
    //Simple Method - Void Method - no return / no parameter

    public static void selling(){
        //logic
        System.out.println("Product1");
    }
    public static void totalProductPrice(){
        int product1Price= 899; //local
        int product2price= 599;  // local
        System.out.println(product1Price+product2price);
    }
     public static void additionTwoNumber(){
         int x = 5;
         int y = 10;
         System.out.println(x+y);
     }


    public static void main(String[] args) {
        // Println() is Pre-define method
        System.out.println("Brijal Jatin");
        selling(); //call
        totalProductPrice();
       additionTwoNumber();
    }







}
