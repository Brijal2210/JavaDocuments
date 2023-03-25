package com.topicOfArray;

public class TopicOfCasting {
    /* Definition-- When we assign a value of one data type to another daa type its called casting
     Widening Casting -- converting a small data type to large data type
     byte->short->char->int->long->float->double*/
    public static void main(String[] args) {
        byte a = 5;
        short b = a;
        System.out.println(b);

    /*Narrow Casting --  converting a large value of data type to small vale of data type*/
        float p = 10005;
        long q = (long) p;
        System.out.println(q);

        int x=20;
        int y=30;
        float z= (float) x/y;
        System.out.println(z);

        short e = 11;
        short f = 22;
        byte g = (byte) (e+f);
        System.out.println(g);

        double s = 1235;
        double t = 75459;
        float u =  (float) (s/t);
        System.out.println(u);

    }
}
