import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaSwingApp4 {
     public static void main(String args[]) {
       JFrame f1 = new JFrame();
       f1.setSize(400, 400);
       f1.setTitle("Demo F1");
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLocationRelativeTo(null);

       JButton button = new JButton();
       button.setText("Button");
       button.setFont(new Font("", 1, 16));
       f1.add(button);
       f1.setVisible(true);
    }

}
