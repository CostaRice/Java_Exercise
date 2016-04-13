import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016/4/13.
 */
public  class TemperatureCalculator extends JFrame {
    private JTextField temperatureOfFahrenheit = new JTextField();
    private JButton compute = new JButton("Compute");
    private JTextField temperatureOfCelsius = new JTextField();

    public TemperatureCalculator() {
        JPanel p1 = new JPanel(new GridLayout(2, 2));
        p1.add(new Label("Temperature of Fahrenheit"));
        p1.add(temperatureOfFahrenheit);
        p1.add(new Label("The result of temperature of Celsius"));
        p1.add(temperatureOfCelsius);
        p1.setBorder(new TitledBorder("Enter temperature of Fahrenheit"));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(compute);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        compute.addActionListener(new ButtonListener());
    }


    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double temperature_F = Double.parseDouble(temperatureOfFahrenheit.getText());
            double temperature_C = 5.0 / 9 * (temperature_F - 32);
            temperatureOfCelsius.setText(String.format("%.2f",temperature_C));
        }
    }
    public static void main(String[] args) {
        TemperatureCalculator frame = new TemperatureCalculator();
        frame.pack();
        frame.setTitle("Temperature Calculator");
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


