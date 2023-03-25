package com.topicOfLoop;

public class whileLoopCond {
    // if - else -- if you want to check the condition 4
    //switch -- if 4-- 20...
    //loop -- repitation, cycle
    // if you want write my name 1000 time, you can use by the loop
    //while  -- jab tak
    // do while
    //for
    //foreach - array
    // red dot called debug point
    public static void main(String[] args) {

        // if I want to print the no. 1 -10
        // while loop -- start, stop, increment/ decrement (while this con. is true, repeat this statement)
        // print 1-10, your starting point should be small number 1
        // If you want to print 10-1(reverse) number, your starting point should be large number 10
        int number = 10; // starting
        //Exp - 1
        while (number >= 1) {  //stop
            System.out.println(number); // output=10,9,8,7,6,5,4,3,2,1
            number--;
        }

        // Exp - 2
        while (number >= 1) {
            if (number % 2 == 0) {

                // try this condition number>==10
                System.out.println("print");
            }

            number--; // output-- five time "Print"
            // infinat outout (you can use number++;)
        }

    }
}

