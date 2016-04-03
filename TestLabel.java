/**
 * Created by CostaHu on 2016/4/4.
 */
public class TestLabel {
    public static void main(String[] args) {
        int s = 0,i = 1;

        label:while (true){
            while (true){
                if (i%2 == 0)
                  break ;
                if (s>50)
                  break label;
                s += i++;
            }
            i++;
        }
        System.out.println("s = "+s);
    }
}
