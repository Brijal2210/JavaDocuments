package com.topicOfCondiion;

public class IfElseCond {
   // Definition: If- Else is a condition statement in java like general statement,
    // if cond.is true, it will execute if block
    //and if condition is false, it will execute in else block
   public static void main(String[] args) {
       //Example (1)
       // 2 number -- which is bigger.... Print
       int a = 10;
       int b= 20;
       if (a>b){
           System.out.println(a);
       }
       else {
           System.out.println(b);
       }

       //Example(2)
       String flavour = "Chocolate";

       if (flavour == "vanilla"){
           System.out.println("I will cook vanila");
       }
       else{
           System.out.println("I will cook chocolate");
       }
       //Example (3) odd-even number
       //2,4,6,8-even
       //1,3,5,7-odd

       int x=5;
       if (x%2 == 0) {
           System.out.println("it is even number");
           System.out.println(a + " is even number");
       }
       else {
           System.out.println("It is Odd number");
           System.out.println(a + " is odd number");
       }

       // Example(4)
       int mark = 65;
       if (mark >=35 && mark<=50)    {
           System.out.println("pass");
       }
       else{

       }

       // using the User define method with if- else condition ,call here another class to this class
        IfElseUsingMethod.checkOddEvenNumber(25);
        IfElseUsingMethod.checkOddEvenNumber(4512);

       }

   }






