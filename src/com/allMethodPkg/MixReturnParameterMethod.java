package com.allMethodPkg;

public class MixReturnParameterMethod {
    public static int sumTwoNumber(int p, int q){

        int r = p + q; // logic
        return r;
    }
    public static  int countBalance ( int withdraw, int balance){
        balance = balance - withdraw; // logic
        return balance;
    }
     public static boolean checkSufficientBalance(int withDraw, int balance){
        boolean checkBalance = balance >= withDraw; // logic
         return checkBalance;
     }
    public static void main(String[] args) {
        System.out.println(sumTwoNumber(10,20));
        System.out.println(sumTwoNumber(15,15));
        System.out.println(countBalance(200,1000));
        System.out.println(countBalance(150,2000));
        System.out.println(checkSufficientBalance(200,850));
        System.out.println(checkSufficientBalance(500,500));
        System.out.println(checkSufficientBalance(201,200));
    }


}
