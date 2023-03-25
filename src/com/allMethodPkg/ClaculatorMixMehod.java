package com.allMethodPkg;

public class ClaculatorMixMehod {
    //Non-Static -mix parameter and return type method

    public int addition(int a,int b){
        int c = a + b;
        return c;
    }
     public int subtraction(int a ,int b, int c){
        int d = a + b + c ;
        return c;
     }

     public int multiplication(int a, int b){
        int c = a*b;
        return c;
     }

    public static void main(String[] args) {
        ClaculatorMixMehod calculatorObj = new ClaculatorMixMehod();
        System.out.println("Addition of Two Numbers:");
        System.out.println(calculatorObj.addition(10,10));
        System.out.println("Subtraction of Three Numbers:");
        System.out.println(calculatorObj.subtraction(15,10,5));
        System.out.println("Multiplication of Two Numbers:");
        System.out.println(calculatorObj.multiplication(5,5));
    }

}
