/**
 * Created by CostaHu on 2016/4/4.
 */
public class TestLabelOfContinue {
    public static void main(String[] args) {
        int i,j,count=0;
        label:for(i = 3;i<201;i++){
            for(j=2;j<Math.sqrt(i)+1;j++){
                if(i%j==0)
                    continue label;
            }
            count++;
            System.out.println("i = "+i);
        }
        System.out.println("Total numbers: "+count);
    }
}
