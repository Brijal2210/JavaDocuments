package com.topicOfCondiion;

public class IfElseLadderClass1 {
    // if you have to two number and you have to check more than two ans., so you need to use IfElseLadder
    //is else if else if -- ladder condition

    //Exp(1)-- mark -student result  -- pass or fail

    public static void checkStudentPassFail(int marks){
        if (marks >=35 && marks<=50){                         //Condiion1
            System.out.println("studen is passed with " + marks);
        } else if (marks>=51 && marks<=65){                    //Condiion2
            System.out.println("student is passed "+ marks );
        } else if (marks>=66 && marks<= 100) {               //Condiion3
            System.out.println("student is passed with distantion" + marks);
        } else if (marks>100){                                //Condiion4
            System.out.println("marks is incorrect");
        }
        else {                                                //Condiion5
            System.out.println("student is fail");
        }
    }

    public static void main(String[] args) {
        checkStudentPassFail(30);
        checkStudentPassFail(81);
        checkStudentPassFail(101);
        checkStudentPassFail(100);
    }

}
