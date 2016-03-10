import  java.util.Scanner;

/**
 * Created by hyc on 2016/2/29.
 */
public class DisplayTime {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for seconds :");
        //Prompt user to input
        int seconds = input.nextInt();
        int minutes = seconds/60;
        int second = seconds%60;

        System.out.println(seconds+" is "+minutes+" minute(s)"+" and "+second +
                " second(s)");
        }
    }
