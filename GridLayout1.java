import java.awt.*;
import javax.swing.*;

class Calculator extends JFrame {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
   

    Calculator() {
        setSize(400, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 2));

        button1 = new JButton();
        button1.setText("1");
        add( button1);

        button2 = new JButton();
        button2.setText("2");
        add(button2);

        button3 = new JButton();
        button3.setText("3");
        add( button3);

        button4 = new JButton();
        button4.setText("4");
        add( button4);
        setVisible(true);
    }
}

class GridLayout1 {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
    }
}

