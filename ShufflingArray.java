import java.util.Scanner;

/**
 * Created by CostaHu on 2016/3/8.
 */
public class ShufflingArray {
    public static void main(String[] args) {

        //Declare an array
        final int NUMBER_OF_ELEMENTS = 10;
        double[] myList = new double[NUMBER_OF_ELEMENTS];

        //Get an through input
        System.out.println("Please enter "+ NUMBER_OF_ELEMENTS + " floats :");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i <NUMBER_OF_ELEMENTS;i++)
            myList[i]=input.nextDouble();
        //Shuffle the array
        for (int i= 0;i<NUMBER_OF_ELEMENTS;i++){
            int index = (int)(Math.random()*myList.length);

            double temp = myList[i];
            myList[i] = myList[index];
             myList[index]= temp;
        }
        // Output the result
        for(double element:myList){
            System.out.printf("%-4.0f",element);
        }
    }
}
