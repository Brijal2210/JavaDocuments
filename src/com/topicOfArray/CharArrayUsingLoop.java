package com.topicOfArray;

public class CharArrayUsingLoop {
    public static void main(String[] args) {
        String[] sentence = {"Using For Loop"};
        for (String s:sentence) {
            System.out.println(s);
        }

        char[]  charArray = {'A','B','C','@','&','%'};
        // using for loop
        for(int i=0; i<charArray.length;i++){

            System.out.println(charArray[i]);
        }

        System.out.println("===============================");
        System.out.println("Using For-each loop");

        //Using For-each Loop
        for (char a:charArray) {
            System.out.println(a);
        }
    }

}
