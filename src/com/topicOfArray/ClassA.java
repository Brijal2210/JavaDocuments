package com.topicOfArray;

public class ClassA {
    public static void main(String[] args) {
        int[] a = new int[5]; // we declare array with size 5
        // Storing /inserting values into array
        a[0]= 100;
        a[1]= 200;
        a[2]= 300;
        a[3]= 400;
        a[4]= 500;
        // Here Declare an Array without specifying size
        int[] p = {100,200,300,400,500};

        // How many values we have in this array , how o find out?
        System.out.println("Length of an Array is:" + p.length);  //Print length/size of an Array

        //Read specific index value
        System.out.println(p[0]);

        //Read all values from an Array-- use for loop
        for(int i =0; i<a.length; i++){ // we can write i<=a.length-1
            System.out.println(a[i]);
        }

        // For-each loop-- Read value using enhanced for loop
        for(int number:a){
            System.out.println(number);
        }
        }
    }

