import java.util.Scanner;

/**
 * Created by CostaHu on 2016/4/18.
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.print("Please enter an string:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (isPalindrome(str)){
            System.out.println("The string "+ str + " is a palindrome.");
        }
        else {
            System.out.println("The string "+ str +" is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String s){
        int low = 0;
        int high = s.length()-1;
        while (low<high){
            if (s.charAt(low)!=s.charAt(high))
                return false;
            low ++;
            high--;
        }
        return true;
    }
}
