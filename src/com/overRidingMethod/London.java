package com.overRidingMethod;

public class London extends Uk {
    public void taxes(){
        System.out.println("this is london taxes 25%");
    }

    public static void main(String[] args) {
        London obj = new London();
        obj.taxes();

    }
}


