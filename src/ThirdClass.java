import variableTopics.FirstClass;

public class ThirdClass {
     public static void running(){
         System.out.println("abc");

    }

    public static void main(String[] args) {
        FirstClass newObject = new FirstClass();
        System.out.println(newObject.a);
        newObject.signIn();
         running();
    }
}
