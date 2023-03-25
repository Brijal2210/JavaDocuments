package objecCreationTopic;


import variableTopics.FirstClass;

public class SecondClass {


  private float totalPrice = 102.5f; //  Private--we can access with in class
  protected int b = 6; //Public -- we can access with the package and subclass (inheritance)
    int x = 15;  // Default - we can access with the package

    public static void main(String[] args) {
       FirstClass newObject2= new FirstClass();   //object creation within other class
        System.out.println(newObject2.a);
        newObject2.signIn();

       SecondClass newObj2 = new SecondClass();  // object creation with this class
        System.out.println(newObj2.b);
        System.out.println(newObj2.totalPrice);
        System.out.println(newObj2.x);

    }
}
