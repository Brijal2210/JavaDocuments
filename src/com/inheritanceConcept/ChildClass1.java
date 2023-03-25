package com.inheritanceConcept;

public class ChildClass1 extends ParentClass1 {

    int b=10;
    public void method2(){
        System.out.println("this is the child class");
    }
    public static void main(String[] args) {
        ChildClass1 childclass= new ChildClass1();
        System.out.println(childclass.b);  // this is from child class
        System.out.println(childclass.a);    // this variable is from parent class
        childclass.method2();   // this is from child class
        childclass.myMethod();    // this method is from parent class

    }
}
