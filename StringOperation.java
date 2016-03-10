/**
 * Created by CostaHu on 2016/3/1.
 */
public class StringOperation {
    public static void main(String[] args) {
        System.out.println(1 + 2);
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));

        String a_integer = "123";
        int integer_after = Integer.parseInt(a_integer);
        System.out.print("The integer is " + integer_after * 2);
    }
}
