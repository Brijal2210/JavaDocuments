package com.topicOfArray;

public class ForEachArryIntClass {

    public static void main(String[] args) {

        int[] marks = {50, 65, 75, 80, 90, 70, 100};
        int marksLength = marks.length;

        //Exp-1  using for loop
        for(int i=0; i<marksLength;i++){
            System.out.println(marks[i]);
        }
        for (int i=marksLength-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        //Exp-2  using For Each loop
        for (int a:marks) {
            System.out.println(a);
        }
    }
}
