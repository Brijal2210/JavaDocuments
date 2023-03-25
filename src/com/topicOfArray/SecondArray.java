package com.topicOfArray;

public class SecondArray {

    public static void main(String[] args) {
        String car1 = "Volvo";
        String car2 = "Mer";
        String car3 = "BMW";
        String car4 = "Range ro";

        String[] arrCars = {"Volvo","Mer","BMW","Range ro"};
                //Index       0       1     2     3
                //Length      1       2     3      4
        int myArrayLength = arrCars.length;  // First find Array Length
        System.out.println(myArrayLength);


        // Exp.1 --To Print all car name
        for ( int i=0; i<myArrayLength; i++){
            System.out.println(arrCars[i]);
        }
         // Exp-2 if you want to print reverse order
        for ( int i = myArrayLength-1; i>=0; i--){
            System.out.println(arrCars[i]);
        }


    }





}
