import javax.swing.*;
import java.awt.*;

/**
 * Created by CostaHu on 2016/3/30.
 */
public class MyGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.black);
        frame.setVisible(true);
    }
}
