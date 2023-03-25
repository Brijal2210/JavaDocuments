package com.topicOfArray;

public class LargestOrSmallestNumber {
    public static void main(String[] args) {
        //compare to two number one bye one
        // large =  50 -- every time Iwill compare to large no.with the next number

        int[] arr = {2, 5, -8, 10, 50, 8, 17};
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("largest number is " + largest);
        System.out.println("smaller number is " + smallest);
    }
}

    /* psvm{
     int lar = 0; //2, then 5, then 10, 50
     int smallest = 0;

     for (int i = 0; i < arr.length; i++){
        if(lar<=arr[i]){
         // 0  < 2 -- now
         // 2  < 5 -- now
         // 5 < -8-- its false so it is not store to large variable
         // 5 < 10
         // 10 < 50
        lar=arr[i];  -- now 2 no. store into the large variable, now 50 is store
        }
      for (int i = 0; i < arr.length; i++){
         if ()smallest >= arr[i]{
              smallest == arr [i]}
        }
         sout(lar) // 50 is final output for largest value

     */





