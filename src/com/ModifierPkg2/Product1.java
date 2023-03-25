package com.ModifierPkg2;

import com.ModifierPkg1.Amazon1;

public class Product1 {
    // Here, Use of the Public Modifier, we can access the other class file data in other Package
    public static String websiteName = "fashiondream.amazon.in";
    public  final String SELLER_NAME = "Fashion Dream";

    public static void loggingThisSite() {
        System.out.println("login Successful.");
    }

    public int totalOrder = 42;

    public void ProcessTheOrder() {
        int OrderNumber = 320517;
        int OrderNumber2 = 320412;
        System.out.println("Two Orders are Pending: " + OrderNumber + " & " + OrderNumber2);
    }
        public static void main (String[]args){
            System.out.println(websiteName);
            loggingThisSite();

            Amazon1 amazonObject2 = new Amazon1();
            System.out.println(amazonObject2.totalOrder);
            amazonObject2.ProcessTheOrder();

            Product1 productObj2 = new Product1();
            System.out.println(productObj2.SELLER_NAME);

        }


    }
