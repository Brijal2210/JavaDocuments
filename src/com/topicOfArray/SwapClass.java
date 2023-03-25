package com.topicOfArray;

public class SwapClass {
    public static void main(String[] args) {
        //swap-- i want to add a value a to b and b to a, so I need to take a temporarily variable
       int a= 10;
       int b = 20;
       int temp; //10

      temp=a; //10
        a=b; //20
        b = temp; // 10

        System.out.println(a);
        System.out.println(b);

    }
}
