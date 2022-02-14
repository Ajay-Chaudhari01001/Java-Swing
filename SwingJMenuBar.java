import javax.swing.*;
import java.awt.*;

public class SwingJMenuBar {
    
    public static void main (String []args) {

        JFrame jf = new JFrame();
        jf.setBounds(100,50,500,500);
        jf.setTitle("JMenuBar");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        // creating Jmenubar and their items
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem f1 = new JMenuItem("New");
        JMenuItem f2 = new JMenuItem("Open");
        JMenuItem f3 = new JMenuItem("Save");

        JMenuItem e1 = new JMenuItem("Copy");
        JMenuItem e2 = new JMenuItem("Paste");
        JMenuItem e3 = new JMenuItem("Find");

        JMenu find1 = new JMenu("Find By");
        JMenuItem replace = new JMenuItem("Replace");
        JMenuItem replaceall = new JMenuItem("Replace All");

        find1.add(replace);
        find1.add(replaceall);

        file.add(f1);
        file.add(f2);
        file.add(f3);

        edit.add(e1);
        edit.add(e2);
        edit.add(e3);
        edit.add(find1);

        menubar.add(file);
        menubar.add(edit);

        jf.setJMenuBar(menubar);

        jf.setVisible(true);
    }
}
