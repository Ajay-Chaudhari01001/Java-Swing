// create button using Anonymous inner class...
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButtoninnerClass  {
    
   public static void main (String [] args) {

    JFrame jf = new JFrame ("Anonymous Button");
    jf.setBounds(100,100,700,500);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container c = jf.getContentPane();
    c.setLayout(null);

    JButton button = new JButton("Clic me");
    button.setBounds(100,100,100,50);
    c.add(button);

    button.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e) {
            
            c.setBackground(Color.RED);
        }
    });

   }
}
