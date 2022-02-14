import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JLabel label1, label2, label3;
    JTextField t1, t2;
    JButton Sum, Substract, Mul, Div;

    MyFrame () {
        setBounds(100,50,400,400);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);
        // label sete
        label1 = new JLabel("First Number ");
        label1.setBounds(10,40,100,30);
        c.add(label1);

        label2 = new JLabel("First Number ");
        label2.setBounds(10,80,100,30);
        c.add(label2);

        label3 = new JLabel();
        label3.setBounds(100,150,200,30);
        c.add(label3);

        // textfield sete
        t1 = new JTextField();
        t1.setBounds(100,45,100,20);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(100,90,100,20);
        c.add(t2);

        // buttons sete
        Sum = new JButton("sum");
        Sum.setBounds(20,120,80,20);
        c.add(Sum);

        Substract = new JButton("subs");
        Substract.setBounds(110,120,80,20);
        c.add(Substract);

        Mul = new JButton("mul");
        Mul.setBounds(210,120,80,20);
        c.add(Mul);

        Div = new JButton("div");
        Div.setBounds(310,120,70,20);
        c.add(Div);

        Sum.addActionListener(this);
        Substract.addActionListener(this);
        Mul.addActionListener(this);
        Div.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == Sum) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a+b;
            label3.setText("Sum is = "+c);
        }
        if(e.getSource() == Substract) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a-b;
            label3.setText("Substraction is = "+c);
        }
        if(e.getSource() == Mul) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a*b;
            label3.setText("Multiplication is = "+c);
        }
        if(e.getSource() == Div) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a/b;
            label3.setText("Division is = "+c);
        }
    }
}
public class SimpleCal {

    public static void main (String args []) {
    
        MyFrame frame = new MyFrame();
    }
}
