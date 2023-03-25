package com.opratorsAndComments;

public class MyArithmaticOpr {

    public static void main(String[] args) {
        // Arithmetic Operators--
        int a = 10;
        int b = 20;
        System.out.println("Sum of a and b is: "+ (a+b)); //Addition
        int c = 12;
        int d = 10;
        System.out.println("Diff of c and d is: "+ (c-d)); //Subtraction
        int e = 2;
        int f = 4;
        System.out.println("Multiplication of e and f is:" + (e*f));//Multiplication
        int o = 2;
        int i = 4;
        System.out.println("Division of o and r is:" + (o/i));//Division(quotient)
        int p = 10;
        int q = 3;
        System.out.println(p%q);//Modulus(reminder)

        //Increment  -- Prefix and Postfix
        //Prefix -- ++a
        //Postfix -- a++

        int r = 5;
        int s = 8;
        /*System.out.println(r++); -5
        System.out.println(++r);  - 7*/
        r++; //6   //postfix-- first it will assign the value then it will increment

        r++; // increment-7
        ++r; //prefix--8  -- first it will increment value then assign the value to the result
        System.out.println(++r);//9

        s--; //decrement-7
        System.out.println(s--);

    }



}
