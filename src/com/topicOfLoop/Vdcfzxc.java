package com.topicOfLoop;

public class Vdcfzxc {
    public static void vheckMaxiNum (int a, int b, int c, int d){

     if (a != b || b != c || c != d || d != a || a != c || b != d) {
         if (a > b && b > c && a > d) {
             System.out.println(a + "is a bigger number");
         } else if (b > c && b > a && b > d) {
             System.out.println(b + "is a bigger number");
         } else if (c > a && c > b && c > d) {
             System.out.println(c + "is a bigger number");
         } else {
             System.out.println(d + "is a bigger number");
         }
     }else
     {
             System.out.println("Two or more numbers are same");

         }


     }

    public static void main(String[] args) {
        vheckMaxiNum(10,24,10,30);
    }}