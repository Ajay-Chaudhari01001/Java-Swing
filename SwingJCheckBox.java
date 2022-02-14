import java.awt.*;
import javax.swing.*;

public class SwingJCheckBox {

    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setBounds(100,50,500,500);
        jf.setTitle("JRadioButton");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        // creating JCheckBox
        JCheckBox ch1 = new JCheckBox("Ajay");
        JCheckBox ch2 = new JCheckBox("Nilesh");
        JCheckBox ch3 = new JCheckBox("Gaurav");
        JCheckBox ch4 = new JCheckBox("Sandip");
        JCheckBox ch5 = new JCheckBox("Pradip");
        JCheckBox ch6 = new JCheckBox("Bhagawan");
         
        ch1.setBounds(100,50,100,20);
        ch2.setBounds(100,100,100,20);
        ch3.setBounds(100,150,100,20);
        ch4.setBounds(100,150,100,20);
        ch5.setBounds(100,200,100,20);
        ch6.setBounds(100,250,200,20);

        c.add(ch1);
        c.add(ch2);
        c.add(ch3);
        c.add(ch4);
        c.add(ch5);
        c.add(ch6);


        ch1.setSelected(true);

        Font font = new Font("Arial",Font.BOLD,20);
        ch1.setFont(font);
        ch2.setFont(font);
        ch3.setFont(font);
        ch4.setFont(font);
        ch5.setFont(font);
        ch6.setFont(font);


        jf.setVisible(true);
        
    }
    
}