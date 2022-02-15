import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Using FlowLayout and Label Output

public class TemperatureConverter {

    public TemperatureConverter() {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setLayout(new FlowLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("F");
        frame.add(label1);

        JTextField field1 = new JTextField(15);
        frame.add(field1);

        JButton button1 = new JButton("Convert to C");
        frame.add(button1);

        JLabel label2 = new JLabel("C");
        frame.add(label2);

        JTextField field2 = new JTextField(15);
        frame.add(field2);

        JButton button2 = new JButton("Convert to F");
        frame.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                double input=Double.parseDouble(field1.getText());
                String output=""+((input-32)/1.8);
                field2.setText(output);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                double input=Double.parseDouble(field2.getText());
                String output=""+((input*(9/5))+32);
                field1.setText(output);
            }
        });

        // 4. Size the frame
        frame.setSize(280, 300);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String args[]){
        TemperatureConverter tc = new TemperatureConverter();
    }
}
