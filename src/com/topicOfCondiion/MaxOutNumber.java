package com.topicOfCondiion;

public class MaxOutNumber {
    //Nested include Ladder Condition
    public static void checkMaxNumber(int a, int b, int c){
        if (a!=b && b!=c && c!=a){
            if (a>b && a>c){
                System.out.println(a + "is bigger number");
            } else if (b>a && b>c){
                System.out.println(b + "is bigger number");
            } else{
                System.out.println(c + "is bigger number");
            }
        } else{
            System.out.println("number are same");
        }
    }

    public static void main(String[] args) {
        checkMaxNumber(10,15,20);
        checkMaxNumber(15,15,30);
        checkMaxNumber(25,35,35);
        checkMaxNumber(9,10,9);
    }
}
