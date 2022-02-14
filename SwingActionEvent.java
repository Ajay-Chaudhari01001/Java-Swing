import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame  implements ActionListener {

    Container c;
    JButton button;

    public MyFrame () {

        setBounds(100,50,500,500);
        setTitle("ActionEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        c = this.getContentPane();
        c.setLayout(null);

        button = new JButton("Click Me");
        button.setBounds(100,100,100,30);
        c.add(button);

        button.addActionListener(this);

        setVisible(true);
    }

    // abstract method
    public void actionPerformed (ActionEvent e) {

        String str = button.getText();
        button.setText(str.toUpperCase());

        //button.setText("CLICK ME");
    }
}
public class SwingActionEvent { 
    
    public static void main(String []args) {

        MyFrame jf = new MyFrame();
        
    }
}
