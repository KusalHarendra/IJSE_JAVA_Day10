import java.awt.*;
import javax.swing.*;

class NotePad extends JFrame{

    TextArea textArea;
    JMenuBar menuBar;
    JMenu fileMenu, eidtMenu, viewMenu;
    JMenuItem item1, item2, item3, item4, item5, item6, item7;

    NotePad(){
        setSize(600, 500);
        setTitle("untitled");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        textArea = new TextArea();
        textArea.setFont(new Font("", 1, 16));
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");

        item1 = new JMenuItem("Item 1");
        item2 = new JMenuItem("Item 2");

        fileMenu.add(item1);
        fileMenu.add(item2);

        eidtMenu = new JMenu("Edit");

        item3 = new JMenuItem("Item 3");
        item4 = new JMenuItem("Item 4");

        eidtMenu.add(item3);
        eidtMenu.add(item4);

        menuBar.add(fileMenu);
        menuBar.add(eidtMenu);

        setJMenuBar(menuBar);
        setVisible(true);
    }
}

