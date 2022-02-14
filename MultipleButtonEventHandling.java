import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// extends parent JFrame class and ActionListener abstract method...
class MyFrame extends JFrame implements ActionListener {

    Container c;
    JButton button1, button2, button3;

    MyFrame() {

        c = this.getContentPane();
        c.setLayout(null);

        // first button creation..
        button1 = new JButton("Button Red");
        button1.setBounds(100,100,100,50);
        c.add(button1);

        // second button creation...
        button2 = new JButton("Button Cyan");
        button2.setBounds(200,100,100,50);
        c.add(button2);

        // third button creation...
        button3 = new JButton("Button Green");
        button3.setBounds(300,100,100,50);
        c.add(button3);

        // register a button at actionPerformed method...
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button1 ) {
             c.setBackground (Color.RED);
        }

        if (e.getSource() == button2 ) {
            c.setBackground (Color.CYAN);
       }

       if (e.getSource() == button3 ) {
          c.setBackground (Color.GREEN);
       }
    }
}

public class MultipleButtonEventHandling {
    
    public static void main(String []args) {

        MyFrame mf = new MyFrame();
        mf.setTitle("Button Events");
        mf.setSize(700,500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
}
