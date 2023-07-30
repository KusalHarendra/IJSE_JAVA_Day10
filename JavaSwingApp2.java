import javax.swing.JFrame;

public class JavaSwingApp2 {
    public static void main(String args[]) {
       JFrame f1 = new JFrame();
       f1.setSize(400, 400);
       f1.setTitle("Demo");
       f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);   //
       f1.setLocationRelativeTo(null);
       f1.setVisible(true);
    }
}

// JFrame.EXIT_ON_CLOSE = 3
// JFrame.DISPOSE_ON_CLOSE = 2
// JFrame.HIDE_ON_CLOSE = 1
// JFrame.DO_NOTHING_ON_CLOSE = 0


