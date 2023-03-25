package com.topicOfLoop;

public class Leapyear {

    // 2000- leap, 2004, 2008,2012 -4 =0

    public static void checkleapyear(int year) {
        if (year > 0) {

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("it is a leap year");
            } else {
                System.out.println("it is not leap year");
            }
        } else {
            System.out.println("please enter the correct year");
        }

    }

    public static void main(String[] args) {
        {
            //4 -  2000 2004 2008

            checkleapyear(2000);
            checkleapyear(2001);
            checkleapyear(4);
            checkleapyear(-2000);
            checkleapyear(2400);

        }
    }

}
