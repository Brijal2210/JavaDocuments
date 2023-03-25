package com.amazon.onlineShopping;

public class ObjectClass1 {

    int a = 10;  //global variable
    static int b = 5; //static variable

    public static void main(String[] args) {
        ObjectClass1 myObject = new ObjectClass1();   //create an object
        // Name of Class + Name of Object = new + Name of Class();
        System.out.println(myObject.a);     // REASON - within the help of the object we can access global variable
        System.out.println(b);              // REASON - without the object we can access static variable
    }
}
