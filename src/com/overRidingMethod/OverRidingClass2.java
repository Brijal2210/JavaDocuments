package com.overRidingMethod;

public class OverRidingClass2 extends OverRidingClass1 {

    public void  myMethod(){
        System.out.println("this is the class2");
    }

    public static void main(String[] args) {
        OverRidingClass2 object = new OverRidingClass2();
        object.getClass();
    }
}
