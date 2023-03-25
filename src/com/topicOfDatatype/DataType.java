package com.topicOfDatatype;

public class DataType {
     public static void main(String[] args) {
            //PRIMITIVE DATA TYPES
          boolean b1 = true;               // data type1: boolean
          char colorName;                  // data type2: character
          colorName = 'P';
          byte ageOfChild = 10;            // data type3: byte
          short sellingPrice = 9992;           // data type4:short
          int price1,price2;                  // data type5: integer
          price1 = 249;
          price2= 549;
          long  productCode = 1234567891L;      //data type6: long
          float f1 = 13.12f;                     //data type7: float

          double currency = 124567555d;     //data type8: double
          String feedBack = "\"This dress is very nice & comfortable.\"" ; // NON-PRIMITIVE DATA TYPE: STRING

          System.out.println();// it's a comment which will print an output in console window
          System.out.println(b1);
          System.out.println(colorName);
          System.out.println(ageOfChild);
          System.out.println(sellingPrice);
          System.out.println("Price of Baby Dress:" + price1);
          System.out.println("Price of Girl Dress:" + price2);
          System.out.println(productCode);
          System.out.println(f1);
          System.out.println(currency);
          System.out.println("Customer Review ="+ feedBack);
     }
}
