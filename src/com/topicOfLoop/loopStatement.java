package com.topicOfLoop;

public class loopStatement {

    public static void main(String[] args) {
        int number = 1;  // you can change this value in odd or even number
        //int number = 0;   // all are the number print Even number if you start with the Even number '0'
        /* while (number <= 10){
             System.out.println(number);// output - infinite
             number++; // output -- 1,2,3,4,5,6,7,8,9,10
         }*/
          while (number <= 50 ){
              System.out.println(number); // all are the number print Odd number if you start with the odd number '1'
              number = number +2;
          }

    }
}
