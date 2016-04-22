import java.awt.*;
import java.awt.event.ActionListener;

import static java.lang.Integer.MAX_VALUE;

/**
 * Created by CostaHu on 2016/4/6.
 */
public class Test {
     static class Variable{
        int x,y,z=0;
        void init(int x,int y){
            this.x = x;
            this.y = y;
            int z = 5;
            System.out.println("*****IN INIT*****");
            System.out.println("x = "+x+ " y = "+y+" z = "+z);
        }
    }
    public static void main(String[] args){
        Variable variable = new Variable();
        System.out.println("*****BEFORE INIT*****");
        System.out.println(variable.x+variable.y+variable.z);
        variable.init(10,30);
        System.out.println("*****AFTER INIT*****");
        System.out.println(variable.x+variable.y+variable.z);
        //Show overflow of max value of type int
        System.out.println(MAX_VALUE+1);
    }
}