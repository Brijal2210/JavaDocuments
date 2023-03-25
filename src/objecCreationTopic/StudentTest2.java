package objecCreationTopic;

public class StudentTest2 {
    //Just for Example of Object
    int id;
    String name;
    public static void main(String[] args) {
        StudentCls1 class1 = new StudentCls1();
        StudentTest2 class2 = new StudentTest2();
        class1.id = 22;
        class2.id = 24;
        class1.name ="Brijal";
        class2.name = "Swati";
        System.out.println(class1.id);
        System.out.println(class2.id);
        System.out.println(class1.name);
        System.out.println(class2.name);
    }
}
