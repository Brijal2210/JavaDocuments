package com.allMethodPkg;

public class ReturnTypMethd {

    //Return Type Method  - Returning Some Value
    public static String printProductTitle(){
        String productTitle = "Fashion Dream Baby Girl Floral Printed Dress"; // local
        return productTitle;
    }
    public static int subTwoNumber(){
        int p = 10; //local variable
        int q = 5;                              // with static
        int r = p - q;
        return r;
    }
     public double divisionTwoNumber(){
        double a = 10.00d;
        double b = 2.00d;                        // Non-Static
        double c = a/b;
        return c;
        }


    public static void main(String[] args) {
        String title = printProductTitle();
        System.out.println(title);
        System.out.println(subTwoNumber());
        ReturnTypMethd objOne = new ReturnTypMethd();
        System.out.println(objOne.divisionTwoNumber());
    }
}
