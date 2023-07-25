import java.awt.*;
import javax.swing.*;

class NotePad extends JFrame{

    TextArea textArea;

    NotePad(){
        setSize(600, 500);
        setTitle("untitled");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new TextArea();
        textArea.setFont(new Font("", 1, 16));
        add(textArea);

        setVisible(true);
    }
}

class Example {
    public static void main(String args[]) {
        new NotePad();
    }
}

