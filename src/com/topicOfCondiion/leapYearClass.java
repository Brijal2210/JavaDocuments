package com.topicOfCondiion;

public class leapYearClass {
    // 2000 -leap, 2004,2008,2012,2016,2020 %4 ==0
    // 2001/4
    public static void checkLeapYear(int year) {
        if (year > 0) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

                System.out.println("It is a leap year");
            } else {
                System.out.println("it is not leap year");
            }
        } else {
            System.out.println("please enter the correct year");
        }
    }
    public static void main(String[] args) {
        checkLeapYear(2400);
        checkLeapYear(2000);
        checkLeapYear(2019);
        checkLeapYear(1994);
        checkLeapYear(2400);
        checkLeapYear(4);
    }
}


