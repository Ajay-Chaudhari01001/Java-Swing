import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame  implements ActionListener {

    Container c;
    JTextField text;

    public MyFrame () {

        setBounds(100,50,500,500);
        setTitle("ActionEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        c = this.getContentPane();
        c.setLayout(null);

        text = new JTextField();
        text.setBounds(100,100,100,30);
        c.add(text);

        text.setFont(new Font("Arial",Font.BOLD,15));

        text.addActionListener(this);

        setVisible(true);
    }

    // abstract method
    public void actionPerformed (ActionEvent e) {

        // in text field press enter and generat action
        String str = text.getText();
        text.setText(str.toUpperCase());

        //button.setText("CLICK ME");
    }
}
public class SwingActionEvent2 { 
    
    public static void main(String []args) {

        MyFrame jf = new MyFrame();
        
    }
}
