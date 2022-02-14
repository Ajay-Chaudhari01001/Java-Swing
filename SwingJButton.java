import javax.swing.*;
import java.awt.*;

public class SwingJButton {
    
    public static void main(String [] args) {

        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setBounds(100,50,1000,500);
        jf.setTitle("JButton");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);
        
         JButton btn = new JButton("JButton");
         btn.setSize(200,30);
         btn.setLocation(100,100);
         c.add(btn);
        
         Font font = new Font("Arial",Font.BOLD,20);
         btn.setFont(font);
         btn.setBackground(Color.GREEN);
         btn.setForeground(Color.WHITE);
         btn.setText("Clic On Me");

         btn.setEnabled(true);

         //Cursor cs = new Cursor(Cursor.HAND_CURSOR);
         //Cursor cs = new Cursor(Cursor.CROSSHAIR_CURSOR);
         //Cursor cs = new Cursor(Cursor.WAIT_CURSOR);
         //btn.setCursor(cs);

    }
}
