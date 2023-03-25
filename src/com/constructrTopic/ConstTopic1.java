package com.constructrTopic;

public class ConstTopic1 {
    //In Method Return the value and parameterize the value and call it
    public int topic1( int a, int b){
      int c = a+b;
      return c;

    }
    //While Constructor-- we can not return the value
    // its called parameterized constructor
    public ConstTopic1( int a){
        System.out.println(a +" constructor is called");
    }
    public ConstTopic1(){
        //default constructor
    }

    public static void main(String[] args) {

        ConstTopic1 object1 = new ConstTopic1(20);
        System.out.println(object1.topic1(10,30));
    }

}
