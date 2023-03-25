package com.topicOfArray;

public class ReasignAryClass {
    // 100 variable same data
    // Array is the collection of the variable- SAME DATA TYPE
    //Syntax
    // Non-primitive data type - String, Array [Not fixed in size]
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 20;
        int d = 30;
        int e = 40;

        int[] arr = {10, 20, 20, 30, 40}; // Array
        // Index    0   1  2  3  4
        //Access
        //Exception - we write default position - error show
        System.out.println(arr[4]);

        //Operation
        arr[0] = 50;  // its called reassign the value
        System.out.println(arr[0]); //50
        // exp-2
        arr[0] = 60;
        arr[3] = arr[0] + arr[4];
        System.out.println(arr[3]); //100
        //exp-3
        if (arr[0] > arr[3]) {   //if(10>100)--output-false
            System.out.println("this condition is true");
        } else {
            System.out.println("this condition is false");
        }
        // exp-4 -- Use For loop
        //How we can find length of array , so we have to find length and then use the FOR LOOP
        System.out.println(arr.length); //total length = 5

        // exp-5 (if i want to print element value one by one)
        for (int i = 0; i < arr.length; i++) {   //not declare i<=arr.length--error output
            System.out.println(arr[i]);
        }
    }
}
