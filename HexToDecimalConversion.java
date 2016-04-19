import java.util.Scanner;

/**
 * Created by CostaHu on 2016/4/19.
 */
public class HexToDecimalConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an hex number: " );
        String hex = input.nextLine();
        System.out.println("The decimal value of the hex number "+hex+" is "+hexToDecimalConversion(hex));
    }
    public static int hexCharToDecimal(char ch){
        if(ch>'A'&&ch<='F'){
            return 'F'-ch +15;
        }
        else
            return ch-'0';
    }
    public static int hexToDecimalConversion(String hex){
        int decimalValue = 0;
        for(int i =0;i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue*16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
}
