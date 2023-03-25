package com.interviewTopic;

public class Topic1 {
    public static void main(String[] args) {
        // Equilateral -- 3 sides
        //Isosceles -- 2 sides
        //Scaler --no sides
         int a,b,c;
         a=14;
         b=15;
         c=16;

         if(a==b && b==c) {
             System.out.println("Equil.");
         } else if (a==b || b==c || a==c){
             System.out.println("iso");
         } else {
             System.out.println("scalen");
         }
    }
}
