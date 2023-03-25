package com.constructrTopic;

public class SecondClass {

    public SecondClass(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        FirstClass firstclass =  new FirstClass();
        SecondClass secondclass = new SecondClass(10);
    }
}
