package com.interviewTopic;

public class Practice1 {
    //Method-- Fibonacci Series
    // 0 1  1 2 3 5 8 13 21
    // 1  2 3 4 5 6 7 8 9 10

    public static void fibonacci(){
        int sum = 0;
        int first=0;
        int second=1;
        for (int i=0; i<=10; i++);{
            System.out.println(sum);
            sum = first+second;
            first=second;
            second=sum;


        }
    }

    public static void main(String[] args) {
        //operators--if else--for loop
        for (int i= 0 ; i<=5; i++){
            System.out.println("*");// if we want to print in one line --remove the ln-print
            if(i%3 ==0){
                System.out.println("&");
            }
        }
        //
        for (int i=0; i<=10; i+=2){
            if (i%2 == 0){
                System.out.println("1");
            } else {
                System.out.println("");
            }
           fibonacci();

        }



    }
}
