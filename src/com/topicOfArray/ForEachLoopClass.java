package com.topicOfArray;

public class ForEachLoopClass {
    public static void main(String[] args) {

    String[] studentName = {"Brijal","Swati", "Shital", "Yash"};

    //Exp-1 --Using for loop
    for (int i=0; i<studentName.length; i++){    //--we can also write array length directly here
        System.out.println(studentName[i]);
    }

    //Exp-2 -- Using For-each Loop
        for (String a:studentName) {
            System.out.println(a);}

    }

}
