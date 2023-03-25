package objecCreationTopic;

public class ForthClass {

    public static void main(String[] args) {
        SecondClass forthObject= new SecondClass();  // object creation with protected class
        System.out.println(forthObject.b);
        System.out.println(forthObject.x); // default modifier
    }
}
