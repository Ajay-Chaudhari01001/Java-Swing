import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JLabel label1, label2;
    JTextField t1;
    JPasswordField pass;
    JButton button;

    MyFrame () {
        setBounds(100,50,400,400);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("Username ");
        label2 = new JLabel("Password ");
        label1.setBounds(10,50,100,20);
        label2.setBounds(10,100,100,20);
        c.add(label1);
        c.add(label2);

        t1 = new JTextField();
        pass = new JPasswordField();
        t1.setBounds(80,50,100,20);
        pass.setBounds(80,100,100,20);
        c.add(t1);
        c.add(pass);

        button = new JButton("SUBMIT");
        button.setBounds(50,150,100,20);
        c.add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("Username = "+t1.getText());
        System.out.println("Password = "+pass.getText());
        
    }
}
public class SimpleLoginForm {

    public static void main (String args []) {
    
        MyFrame frame = new MyFrame();
    }
}
