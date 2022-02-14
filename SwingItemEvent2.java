import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ItemListener {

    Container c;
    JRadioButton rb, rb1;
    JTextArea text;

    public MyFrame () {

        setBounds(100,50,500,500);
        setTitle("ItemEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        c = this.getContentPane();
        c.setLayout(null);

        rb = new JRadioButton ("Male");
        rb1 = new JRadioButton ("Female");
        rb.setBounds(50,50,100,20);
        rb1.setBounds(50,100, 100, 200);
        text = new JTextArea();
        text.setBounds(200,50,100,100);
        c.add(rb);
        c.add(rb1);
        c.add(text);

        ButtonGroup bg = new ButtonGroup ();
        bg.add(rb);
        bg.add(rb1);

        rb.addItemListener(this);
        rb1.addItemListener(this);

        setVisible(true);
    }

    // abstract method of ItemListener
   public void itemStateChanged (ItemEvent e) { 
        
        if(e.getSource() == rb){

            text.setText("Male is selected");
        }
        if(e.getSource() == rb1){

            text.setText("Female is selected");
        }

   }
}
public class SwingItemEvent2 { 
    
    public static void main(String []args) {

        MyFrame jf = new MyFrame();
        
    }
}
