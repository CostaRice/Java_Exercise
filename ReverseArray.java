import java.util.Scanner;

/**
 * Created by CostaHu on 2016/3/10.
 */
public class ReverseArray {
    public static void main(String[] args) {

        final int LENGTH_OF_ARRAY = 10;
        int[] list = new int[LENGTH_OF_ARRAY];

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an array consists of " + LENGTH_OF_ARRAY + " elements.");
        for (int i = LENGTH_OF_ARRAY-1; i >=0; i--)
            list[i] = input.nextInt();

        System.out.println("The reversed array is :");
        for (int u : list) {
            System.out.println(u);
        }
    }
}
