package com.allMethodPkg;

public class ParaClass {
    // define the Class
    //Parameterized
    // Parameterized Method  - Parameterizes the value
    public static void printTheValue(int a){
        System.out.println(a);
    }
    public static void multiplyThreeNumber(int a, int b, int c){
        System.out.println(a*b*c);
    }
    public static void additionFourNumber(int a, int b, int c, int d ){
        System.out.println(a+b+c+d);
    }
    public static void enterTheName(String firstName,String  middleName, String lastName){
        System.out.println(firstName + " "+ middleName +" "+ lastName);
    }


    public static void main(String[] args) {
        // Dynamic
        printTheValue(20);
        printTheValue(40);
        printTheValue(60);
        multiplyThreeNumber(10, 20, 30);
        additionFourNumber(5, 5, 5, 5);
        additionFourNumber(10, 10, 10, 10);
        // String firstName = "brij";
        // enterTheName(firstName);
        enterTheName("Brijal", "jatinkumar", "Chothani");

    }
    }

