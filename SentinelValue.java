import java.util.Scanner;

/**
 * Created by CostaHu on 2016/3/2.
 */
public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter several integers: ");
        int data = input.nextInt();
        int sum = 0;

        while (data != 0){
            sum += data;
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
