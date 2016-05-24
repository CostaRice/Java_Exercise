import javax.swing.*;
import java.awt.*;

/**
 * Created by CostaHu on 2016/5/23.
 */
public class ControlCircle1 extends JFrame{
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    //Define the constructor for Class ControlCircle1
    public ControlCircle1(){
        JPanel jPanel = new JPanel();
        jPanel.add(jbtEnlarge);
        jPanel.add(jbtShrink);
        jPanel.add(canvas);

        this.add(canvas,BorderLayout.CENTER);
        this.add(jPanel,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new ControlCircle1();
        frame.setTitle("Control circle");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

}
    class CirclePanel extends JPanel{
        private int radius = 5;
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawOval(getWidth()/2-radius,getHeight()/2-radius,2*radius,2*radius);
        }
    }
