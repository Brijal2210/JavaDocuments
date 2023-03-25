package com.ModifierPkg1;

public class Amazon1 {

    // Public Modifier with Static and Non-static
    //With Static
    public static String websiteName= "fashiondream.amazon.in";

    public static void loggingThisSite(){
        System.out.println("login Successful.");
    } //Without Static

    public int totalOrder = 42;
    public void  ProcessTheOrder(){
        int OrderNumber =  320517;
        int OrderNumber2 = 320412;
        System.out.println("Two Orders are Pending: "+ OrderNumber + " & " + OrderNumber2);
    }
    public static void main(String[] args) {
        System.out.println(websiteName);       //With Static Call the Variable and Method
        loggingThisSite();

        Amazon1 amazonObject1 = new Amazon1();   //Without Static, We have to access the Object
        System.out.println(amazonObject1.totalOrder);
        amazonObject1.ProcessTheOrder();
    }


}
