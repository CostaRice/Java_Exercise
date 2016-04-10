import javax.swing.*;
import java.awt.*;

/**
 * Created by CostaHu on 2016/4/10.
 */
public class TestPanels extends JFrame{
    public TestPanels(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,4));

        for(int i = 0;i<9;i++){
            panel.add(new JButton("" + i));
        }

        panel.add(new JButton("Start"));
        panel.add(new JButton("0"));
        panel.add(new JButton("Stop"));

        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.add(new JTextArea("Time to be displayed here"),BorderLayout.NORTH);
        jPanel.add(panel,BorderLayout.CENTER);
        add(jPanel,BorderLayout.EAST);
        add(new JButton("Food to be placed here"),BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        TestPanels frame = new TestPanels();
        frame.setTitle("The front view of a Microwave Oven");
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
