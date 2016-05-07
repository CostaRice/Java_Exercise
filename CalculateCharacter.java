import java.util.Scanner;

/**
 * Created by CostaHu on 2016/5/7.
 */
public class CalculateCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an string in a line :");
        String string1 = input.nextLine();
        string1.toLowerCase();

        int[] counts = countLetters(string1);
        for(int i =0;i<counts.length;i++){
            if (counts[i]!=0){
                System.out.println("the letter "+(char)('a'+i)+": "+counts[i]);
            }
        }
    }
    public static int[] countLetters(String string){
        int[] counts = new int[26];
        for (int i = 0;i<string.length();i++){
            if(Character.isLetter(string.charAt(i))){
                counts[string.charAt(i)-'a']++;
            }
        }
        return counts;
    }
}
