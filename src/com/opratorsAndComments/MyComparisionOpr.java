package com.opratorsAndComments;

public class MyComparisionOpr {
    // comparison operators or Relational Operators--(Always return a boolean value: true/false)
    //we can just compare this operators only between two numbers

    public static void main(String[] args) {
         int a = 5;
         int b= 10;
         boolean ans = a == b; // equal to
        System.out.println(ans);

        int p =2;
        int q =5;
        boolean ans1 = p!= q; // not-equal
        System.out.println(ans1);

        int c = 10;
        int d = 25;
        boolean ans2 = c>d; // Greater than
        System.out.println(ans2);

        int e = 15;
        int f = 17;
        boolean ans3 = e<f; // Less than
        System.out.println(ans3);

        int x = 10;
        int y = 15;
        boolean ans4 = x<=y; // Less than or Equal to -- if any statement is true
        System.out.println(ans4); // true

        int x1 = 7;
        int x2= 6;
        boolean ans5 = x1>=x2; // Greater than or Equal to
        System.out.println(ans5);



    }
}
