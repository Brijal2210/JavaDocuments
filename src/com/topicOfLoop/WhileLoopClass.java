package com.topicOfLoop;

public class WhileLoopClass {
    public static void main(String[] args){
        //Exp 1:  1 to 10 Numbers Print
        int i = 1;
         while (i<=10){
             System.out.println(i);
             i++;
         }

         //Exp 2 : Print Only even and Odd numbers between 1 to 10
        i = 2;
        while (i<=10){
            System.out.println(i);
            i+=2;   //i=i+2;
        }
        i = 1;
        while (i<=10){
            System.out.println(i);
            i+=2;   //i=i+2;
        }
        //Exp 3: Print 1 to 10 in descending order-- 10,9,8,7,----,1
        i= 10;
        while(i>0){
            System.out.println(i);
        }


    }
}
