package com.topicOfCondiion;

public class OysterCard {
    // Balance, tap, minimum balance
    public static final int MINIMUM_BALANCE = 10;

    public static void checkOysterCard(int myBalance){
        if (myBalance>=MINIMUM_BALANCE){
            System.out.println("gate will be open");
            } else{
            System.out.println("you don't have enough balance please top up");
        }
    }

    public static void main(String[] args) {
        OysterCard.checkOysterCard(5);
        OysterCard.checkOysterCard(300);

       /* int myBalance =300;
       int tap = 2;
        only one condition 1 -- If Else Condition
        if (myBalance>=MINIMUM_BALANCE){
            System.out.println("gate will be open");
        } else{
          System.out.println("you don't have enough balance please top up");
    }*/
    }
}
