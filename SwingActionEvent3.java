import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JMenuBar menuBar;
    JMenu file, edit;
    JMenuItem i1,i2, i3,i4,i5,i6,i7;
    JTextArea textArea;

    public MyFrame () {

        setBounds(100,50,500,500);
        setTitle("ActionEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        c = this.getContentPane();
        c.setLayout(null);

        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");

        i1 = new JMenuItem("New File");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("Select All");
        textArea = new JTextArea();
        textArea.setBounds(10,10,400,400);
        c.add(textArea);

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);

        file.add(i1);
        file.add(i2);
        file.add(i3);

        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        menuBar.add(file);
        menuBar.add(edit);

        this.setJMenuBar(menuBar);

        setVisible(true);
    }

    // abstract method of ActionListener an interface
   public void actionPerformed (ActionEvent e) {
       
        if(e.getSource() == i1) {
            textArea.setText("New File Event Occure");
        }
        else if(e.getSource() == i2) {
            textArea.setText("Open Event Occure");
        }
        else if(e.getSource() == i3) {
            textArea.setText("Save Event Occure");
        }
        else if(e.getSource() == i4) {
            textArea.setText("Cut Event Occure");
        }
        else if(e.getSource() == i5) {
            textArea.setText("Copy Event Occure");
        }
        else if(e.getSource() == i6) {
            textArea.setText("Paste Event Occure");
        }
        else {
            textArea.setText("Select All Event Occure");
        }
   }
}
public class SwingActionEvent3 { 
    
    public static void main(String []args) {

        MyFrame jf = new MyFrame();
        
    }
}
