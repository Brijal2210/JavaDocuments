package com.topicOfLoop;

public class doWhileLoopCond {
    // While (condition){.....} check cond. and then execute (Entry Control)- it will be execute infinite time as long as
    //do {....} while(condition) -- first execute and then check condition (Exit Control)--code will be execute at least once
    public static void main(String[] args) {
        // print 1-10
        int number = 1;
        do {
            System.out.println(number); //1
            number++;  //2
        }
        while (number <= 10); // you can change this condition value 0

        // Only print first statement = 20
        int i = 20;
        do{
            System.out.println(i); // 20
            i++;
        } while(i<=10);

        // 10,9,8,7,,---,1
        int a = 10;
        do {
            System.out.println(a); //10
            a--;  //9
        }
        while (a > 0);
    }

}
