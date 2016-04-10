import javax.swing.*;
import java.awt.*;

/**
 * Created by CostaHu on 2016/4/10.
 */
public class ShowBorderLayout extends JFrame{
    public ShowBorderLayout(){
        setLayout(new BorderLayout(5,10));

        add(new JButton("East"),BorderLayout.EAST);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("Center"),BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}