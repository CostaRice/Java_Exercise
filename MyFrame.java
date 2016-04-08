import javax.swing.*;

/**
 * Created by CostaHu on 2016/4/8.
 */
public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("myFrameWithComponents");
        JButton jbtOK = new JButton("OK");

        frame.add(jbtOK);

        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
