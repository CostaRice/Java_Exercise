import java.util.Scanner;

/**
 * Created by hyc on 2016/3/1.
 */
public class ComputeLoanRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer:");
        int hello = input.nextInt();

        System.out.print("Please enter a float:");
        double hi = input.nextDouble();

        System.out.println("hello : " + hello);
        System.out.println("hi : " + hi);
    }
}