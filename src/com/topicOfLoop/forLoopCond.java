package com.topicOfLoop;

// for loop --
public class forLoopCond {
    public static void main(String[] args) {

        // flow - starting/intializing--> checking --> execute the code  -- > increment/decrement
        //1-10
        //10-1

        for (int number = 1; number <= 10; number++) {
            // 1 true
            System.out.println(number);//1
            System.out.println("brijal");
        }
        // even - odd  1 - 50
        for (int number = 1; number <= 50; number++) {
            if (number % 2 == 0) {
                System.out.println(number + "is true");
            }
        }
        for (int number = 1; number <= 50; number += 2) {
            //if (number % 2 == 0) {
            System.out.println(number + "is even");
        }


        for (int a = 1; a <= 100; a++) {
            System.out.println(a);
        }
        for (int i = 100; i >= 1; i--) {
            System.out.println("*"); // 100 time print hoga, if we put i>1 then print 99 time
        }
        for (int a = 10; a <= 30; a++) {
            System.out.println("*"); // 21 time print
        }
        for (int a = 1; a <= 100; a++) {
            a += 1;
            System.out.println(a);
        }
        timeTable(9);
        timeTable(8);
    }

    // If i want to create the method which can calculate the time table
    //9 time table
    //9 * 1 = 9
    //9 * 2 = 18
    public static void timeTable(int tableNumber) {

        System.out.println("THis is my timetable of" + tableNumber);
        System.out.println("=======================================");

        for (int a = 1; a <= 10; a++) {
            System.out.println(tableNumber + "X" + a + "= " + tableNumber * a);
        }
        System.out.println("=======================================");
    }


}