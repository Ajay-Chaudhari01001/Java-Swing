import java.awt.*;
import javax.swing.*;


public class SwingJTextArea {

    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setBounds(100,50,1000,500);
        jf.setTitle("JTextArea");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

         JTextArea textArea = new JTextArea();
         textArea.setBounds(100,100,400,200);
         c.add(textArea);

         textArea.setText("Hello My name is ajay");
         textArea.setFont(new Font("Arial", Font.BOLD, 40));
         //textArea.setEditable(false);
         textArea.setLineWrap(true);

        jf.setVisible(true);
        
    }
    
}