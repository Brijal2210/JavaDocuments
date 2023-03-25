package variableTopics;

import java.lang.reflect.Modifier;

public class FifthClass {
  protected  int y = 11;

    public static void main(String[] args) {


        FirstClass fifthObject = new FirstClass();
        System.out.println(fifthObject.a);
        System.out.println(fifthObject.age);
        System.out.println(fifthObject.name);
    int y =12;
    FifthClass newFiveObject = new FifthClass();
    System.out.println( newFiveObject.y);

}
}