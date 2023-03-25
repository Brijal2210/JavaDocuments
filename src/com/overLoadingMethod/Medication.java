package com.overLoadingMethod;

import jdk.internal.dynalink.beans.StaticClass;

public class Medication {
    public static void medication(String pillName){
        System.out.println("you should take in the  morning: " +pillName);
    }
    public static void medication(String pill1, String pill2){
        System.out.println("one of the pill in the morning: " + pill1);
        System.out.println("Second of the pill in the night: " + pill2);
    }

    public static void main(String[] args) {
        medication("paracetamol");
        medication("f","jf");

    }

}
