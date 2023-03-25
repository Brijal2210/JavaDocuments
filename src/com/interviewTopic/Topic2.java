package com.interviewTopic;

public class Topic2 {

    public static void main(String[] args) {
        //String == " brijalChothani"
        // I want to count vowels- a,e,i,o,u

        String name = "Brijal Chothani";
        String newName = name.toLowerCase();  //Covert to lowercase letter
        int vowels = 0;

        for (int i = 0; i < newName.length(); i++) {
            if (newName.charAt(i) == 'a' || newName.charAt(i) == 'e' || newName.charAt(i) == 'i' || newName.charAt(i) == 'o' || newName.charAt(i) == 'u') {
                vowels++;
                System.out.println("Total  vowels in the Name : " + newName.charAt(i));
           


            }
        }


    }


}
