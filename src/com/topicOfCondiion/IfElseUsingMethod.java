package com.topicOfCondiion;

public class IfElseUsingMethod {
    //use User-define Method__ if you want to check an odd even any number, you need to give a no.
    // if i want print this method another class, i need to only call this method with this class
    public static void checkOddEvenNumber(int number) {
    if (number%2== 0){
            System.out.println(number + "is even number");
        }
    else {
        System.out.println(number + "is odd number");
       }
    }

    public static void main(String[] args) {
        checkOddEvenNumber(10);
        checkOddEvenNumber(15);
    }
}
