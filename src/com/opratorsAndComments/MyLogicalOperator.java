package com.opratorsAndComments;

public class MyLogicalOperator {
    // Logical Operators--for multiple condition(&& || !)
    // returns true/false
    public static void main(String[] args) {

        //end && operator
        int a = 10;
        int b = 20;
        boolean ans1 = a<b && b >15;
                   // true   true
                   //true --  both statements should be true otherwise it will return -False
        System.out.println(ans1);

        // || --OR operator
        int  c = 5;
        int d = 10;
        boolean ans2 = c>d || d<20;
                     // false   true
                    // true -- one of the statement should be true
        System.out.println(ans2);

        // no equal(ans)--reverse
        boolean ans3 = !(c>d || d<20);
        System.out.println(ans3); // false
    }
}
