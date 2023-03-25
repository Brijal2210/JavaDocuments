package com.topicOfArray;

public class OddEvenNumber {
    public static void findEvnNumber() {
        int[] days = {1, 2, 3, 4, 5, 6};

        for (int day : days) {
            if (day % 2 == 0) {
                System.out.println("The Even Numbers of day is " + day);
            }
        }
    }

    public static void findOddNumber() {
        int[] days = {1, 2, 3, 4, 5, 6};

        for (int day1 : days) {
            if (day1 % 2 != 0) {
                System.out.println("The Odd Numbers of day is " + day1);
            }
        }
    }

    public static void main(String[] args) {
        findEvnNumber();
        findOddNumber();
    }


}
// Exp of Parameter

    /*public static void findEvnNumber(int[] days) {


        for (int x : days) {
            if (x % 2 == 0) {
                System.out.println("It is th Even Number " + x);
            }
        }
    }

    public static void main(String[] args) {
        int[] days = {1, 2, 3, 4, 5, 6};
        findEvnNumber(days);
    }
}
*/