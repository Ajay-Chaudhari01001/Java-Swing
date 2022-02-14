//import java.security.KeyStore.TrustedCertificateEntry;
import java.awt.*;
import javax.swing.*;

public class SwingJLabel{
     public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setBounds(100,100,500,500);
        jf.setTitle("JLable");
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // creating label and some fetures label...
        Container c = jf.getContentPane();
        c.setLayout(null);

        // creating jlabel...
        JLabel label = new JLabel("Username");
        label.setBounds(100,50,200,30);

        label.setText("Password");

        // set size and font Family of Text
        Font font = new Font("Arial",Font.ITALIC,30);
        label.setFont(font);

        ImageIcon icon = new ImageIcon("Sample Image Icon.png");
        JLabel label2 = new JLabel(icon);
        label2.setBounds(10,10,icon.getIconWidth(), icon.getIconHeight());

        c.add(label2);

        JLabel label3 = new JLabel("Text",icon,JLabel.LEFT);
        label3.setBounds(0,100,500,100);
        c.add(label3);
    }
}
