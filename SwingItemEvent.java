import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ItemListener {

    Container c;
    JComboBox cmb;
    JTextArea text;

    public MyFrame () {

        setBounds(100,50,500,500);
        setTitle("ItemEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        c = this.getContentPane();
        c.setLayout(null);

        String[] values = {"A","B","C","D"};
        cmb = new JComboBox(values);
        text = new JTextArea();
        text.setBounds(200,50,100,100);
        cmb.setBounds(50,50,100,30);
        c.add(cmb);
        c.add(text);

        cmb.addItemListener(this);

        setVisible(true);
    }

    // abstract method of ItemListener
   public void itemStateChanged (ItemEvent e) {
        
        String str = cmb.getSelectedItem().toString();
        text.setText(str);

   }
}
public class SwingItemEvent { 
    
    public static void main(String []args) {

        MyFrame jf = new MyFrame();
        
    }
}
