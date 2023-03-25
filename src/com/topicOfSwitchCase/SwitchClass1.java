package com.topicOfSwitchCase;

public class SwitchClass1 {
    //Switch -- you can select one of the many blocks to be executed
    public static void main(String[] args) {
        //Example -- 1
        char ch =  'Y';
        switch (ch){
            case 'Y':
                System.out.println("This is matched");
                break;
            case 'N':
                System.out.println("this N is matched");
        }
        // Example -- 2
        String ans ="yes";
        switch (ans){
            case "yes":
                System.out.println("I need the bag");
                break;
            case "No":
                System.out.println("I don't need bag");
        }
       //Example 3 -- Default:
        String ans1 ="xyz";
        switch (ans1){
            case "yes":
                System.out.println("I need the bag");
                break;
            case "No":
                System.out.println("I don't need bag");
                break;
            default:
                System.out.println("the input is incorrect");
        }
        //Example 4
        // 1-7 Print the weekday
        int a =3;
        switch (a){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("input is incorrect");

        }
        //Example -5
        // Browser - chrome, safari, firefox, edge
        //String is case sensitive "chrome!=Chrome"
        String browser ="Chrome";

        switch (browser){
            case "chrome":
                System.out.println("chrome will be open" );
                break;
            case "Safari":
                System.out.println("safari will be open" );
                break;
            case "firefox":
                System.out.println("firefox will be open" );
                break;
            default:
                System.out.println("input is incorrect");

        }

        // Example 6-- Month Name (1-12)
        // Example 7 --ATM
        //Press 1 - Check balance, 2- withdraw, 3- Change PIN no., 4- Exit

        int choice = 3;
        switch (choice){
            case 1:
                checkBalance();
            case 2:
                withdrawTheMoney(100);
            case 3:
                changePin();
                break;
            default:
                System.out.println("Error");

        }

    }
    public static void checkBalance(){

    }
    public static void withdrawTheMoney( int amount){

    }
    public static void changePin(){

    }
}
