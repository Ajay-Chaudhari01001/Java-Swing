import java.awt.*;
import javax.swing.*;


public class SwingJTextField {

    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setBounds(100,50,1000,500);
        jf.setTitle("JLable");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(100,50,120,30);
        c.add(t1);

        t1.setText("Enter name");

        Font font = new Font("Arial",Font.BOLD,25);
        t1.setFont(font);

        t1.setForeground(Color.GREEN);
        t1.setBackground(Color.YELLOW);

        t1.setEditable(true);

        jf.setVisible(true);
        
    }
    
}