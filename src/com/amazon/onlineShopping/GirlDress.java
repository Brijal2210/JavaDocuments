package com.amazon.onlineShopping;

import com.allMethodPkg.SimpleMethdClass;

public class GirlDress {
    int price = 1000;
    double discountPrice = 875.58;
    static String type = "frock";     //with static keyword ---


    //Behaviour ---
    public static void designing() {  //with static keyword
        System.out.println("This dress designed in the mirror work.");
    }

    public void fitting() {      // without static keyword
        System.out.println("i have not fit with this dress");
    }


    public static void main(String[] args) {

        SimpleMethdClass.additionTwoNumber();

        //for global variable or non-static method
        //GirlDress myNewDress = new GirlDress(); //Create an Object
        // System.out.println(myNewDress.color);
        //System.out.println(myNewDress.size);        // with the help of an object we can print global variable
        //System.out.println(myNewDress.discountPrice);
        // myNewDress.fitting();  //with the help of an object we can print method

        // for static variable and static method
        System.out.println(type);
        //without help of new object we can access the static variable and static method
        // print the static variable
        designing(); // calling the method
    }

}
