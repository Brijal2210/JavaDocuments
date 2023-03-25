package variableTopics;

public class FirstClass {
     // Public -- we can access from anywhere - within class, package, through code
     // reuseability
    public int a= 5;// public

    private float totalPrice = 102.5f; //private

    protected   int age = 22; // Private

    String name = "Brijal"; //default

    public void signIn(){
        System.out.println("click on login button");
    }

    public static void main(String[] args) {
        //create an object of this class
        FirstClass bjNewObject = new FirstClass();
        System.out.println(bjNewObject.a);
        System.out.println(bjNewObject.totalPrice);
        System.out.println(bjNewObject.name);
        System.out.println(bjNewObject.age);
        bjNewObject.signIn();

    }

}
