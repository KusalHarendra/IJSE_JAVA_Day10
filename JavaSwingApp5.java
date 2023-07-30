import javax.swing.*;

class Calculator extends JFrame{

}

// Calculator IS-A JFrame
// Calculator --> Sub Class
// JFrame --> Super Class

class JavaSwingApp5 {
    public static void main(String args[]) {
       Calculator calculator = new Calculator();
       calculator.setSize(400, 400);
       calculator.setTitle("Calculator");
       calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       calculator.setLocationRelativeTo(null);
       calculator.setVisible(true);
    }
}
