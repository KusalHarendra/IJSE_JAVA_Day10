import java.awt.*;
import javax.swing.*;

class Calculator extends JFrame {

    JButton[] buttonAr;
    
    Calculator() {
        setSize(400, 400);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 4));
        buttonAr = new JButton[16];
        String[] names = {"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};

        for(int i = 0; i< buttonAr.length; i++){
            buttonAr[i] = new JButton(names[i]);
            add(buttonAr[i]);
        }
        setVisible(true);
    }
}

class GridLayout2 {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
    }
}
