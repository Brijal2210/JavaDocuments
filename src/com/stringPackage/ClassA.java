package com.stringPackage;

import java.util.Locale;

public class ClassA {
    public static void myMethod(){
        String alphas = "Nirav";
        for(int i=0; i < alphas.length(); i++)
            System.out.println(alphas.charAt(i));
    }



    public static void main(String[] args) {
        String s = "Welcome";
        String s1 = " to JAVA";
        myMethod();

        System.out.println("1: "+ s.length()); // length of the string
        System.out.println("2: "+s.concat(s1)); //Joining of strings
        System.out.println("3: "+s1.trim()); // Trimming the string
        System.out.println("4: "+s.charAt(3)); // returns character based on the index, index will star from 0
        System.out.println("5: "+ s.contains("Wel"));//TRUE- whether thr String is represent to the contains or not?
        System.out.println("5: "+ s.contains("wel"));//FALSE
        System.out.println("6: "+ s.equals("welcome")); //false- equals Method
        System.out.println("6: "+ s.equals("Welcome"));// true
        System.out.println("7: "+ s.equalsIgnoreCase("welcome"));//True- equalIgnore Method
        System.out.println("8: "+ s.replace('e', 'a'));// Walcoma- replace the character
        System.out.println("9:"+ s1.replace("JAVA", "Selenium"));
        System.out.println("Lowercase Letter: "+ s.toLowerCase());
        System.out.println("Uppercase Letter: "+ s.toUpperCase());



    }



}
