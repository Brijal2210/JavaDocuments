package com.topicOfCondiion;

public class NestedClass1 {
    // if else if-- Nested Condition (Depending on first con. again we need to check the second cond.)

    public static void checkStdNewMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            // condition1
            if (marks >= 35 && marks <= 50) {                         //Condition1.1
                System.out.println("student is passed with " + marks);
            } else if (marks >= 51 && marks <= 65) {                    //Condition1.2
                System.out.println("student is passed " + marks);
            } else if (marks >= 66 && marks <= 100) {               //Condition1.3
                System.out.println("student is passed with " + marks);
            } else {                                                //Condition1.4
                System.out.println("student is fail");
            }
        }
        else {
            //Condition2
            System.out.println("marks is not correct");
        }
    }

    public static void main(String[] args) {
        checkStdNewMarks(-25);
        checkStdNewMarks(10);
        checkStdNewMarks(101);
        checkStdNewMarks(51);
        checkStdNewMarks(1);
    }
}

