import java.awt.*;
import javax.swing.*;

class Calculator extends JFrame {

    JLabel headerLabel, footerLabel, sideNav1JLabel, sideNav2Label;
    JButton button1, button2, button3,button4;
    
    Calculator() {
        setSize(400, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        headerLabel = new JLabel("Header");
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        add("North", headerLabel);
        footerLabel = new JLabel("Footer");
        footerLabel.setHorizontalAlignment(JLabel.CENTER);
        add("South", footerLabel);
        sideNav1JLabel = new JLabel("Side Nav");
        add("East", sideNav1JLabel);
        sideNav2Label = new JLabel("Side Nav");
        add("West", sideNav2Label);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));

        button1 = new JButton("1");
        centerPanel.add(button1);
        button2 = new JButton("2");
        centerPanel.add(button2);
        button3 = new JButton("3");
        centerPanel.add(button3);
        button4 = new JButton("4");
        centerPanel.add(button4);

        add("Center", centerPanel);



        setVisible(true);
    }
}

class Jpanel {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
    }
}
