/**
 * Created by CostaHu on 2016/4/3.
 */
public class EnhancedForLoop {
    public static void main(String[] args) {
        int[]score = {1,2,3,4,5};
        for(int element:score){
            System.out.println(element);
        }

        int[] number = new int[5];
        for (int i = 0; i< number.length; i++){
            number[i]=i+10;
        }
        for (int element: number){
            System.out.println(element);
        }
    }
}
