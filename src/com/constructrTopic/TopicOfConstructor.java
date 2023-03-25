package com.constructrTopic;

public class TopicOfConstructor {
    //constructor --block of the statement
    // constructor -- similar to method-- name of class--when we create object this constructor is called (Automatic call)
     //--in constructor, no  return--parameterized constructor
    // Method -- block of Method-- you can choose any NAme of method-- we have to manually call that method
     //-- we can return, parameterized method
    // we can not use access modifier
    public void myMethod(){

        System.out.println("Brijal Chothani");
    }
    public TopicOfConstructor(){    // we can not return value but it has parameterized

        System.out.println( "Jatin Chothani");
    }

    public static void main(String[] args) {
        //object-- we can also use different object and get the output 2 times
        TopicOfConstructor consttopic1 = new TopicOfConstructor();
        consttopic1.myMethod();
        TopicOfConstructor consttopic2 = new TopicOfConstructor();


    }
}
