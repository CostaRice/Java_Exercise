/**
 * Created by CostaHu on 2016/3/27.
 */
public class ShowDefaultValues {
    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Name? " + student.name);
        System.out.println("Age? " + student.age);
        System.out.println("Is science major? " + student.isScienceMajor);
        System.out.println("Gender? " + student.gender);
    }
    static class Student{
        String name;
        int age;
        boolean isScienceMajor;
        char gender;
    }
}
