import javax.swing.*;
import java.awt.*;

public class SwingJPasswordField {
    
    public static void main(String [] args) {

        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setBounds(100,50,1000,500);
        jf.setTitle("JPasswordField");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50,120,30);
        c.add(pass);

        pass.setText("1234");

        Font font = new Font("Arail",Font.BOLD,30);
        pass.setFont(font);
        pass.setBackground(Color.YELLOW);
        pass.setEchoChar('*');
        //pass.setEchoChar((char)0);

    }
}
