import java.util.Date;
import java.util.Random;

/**
 * Created by CostaHu on 2016/3/28.
 */
public class showTime {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
        System.out.println(date.toString());

        Random random1 = new Random();
        System.out.println("From random1 we get :" );
        for(int i = 0; i < 15; i++ ){
            System.out.print(random1.nextBoolean()+" ");
        }

        System.out.println();

        Random random2 = new Random();
        System.out.println("From random2 we get :" );
        for(int i = 0; i < 15; i++ ){
            System.out.print(random2.nextBoolean()+" ");
        }
    }
}