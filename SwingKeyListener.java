import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements KeyListener {

     Container c;
     JTextArea text;

    public MyFrame () {

        setBounds(100,50,500,500);
        setTitle("ItemEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        c = this.getContentPane();
        c.setLayout(null);

        text = new JTextArea ();
        text.setBounds(10,10,370,330);
        c.add(text);

        text.addKeyListener(this);

        

        setVisible(true);
    }

    public void keyPressed (KeyEvent e) {

        text.setText("Key is Pressed");
    }

    public void keyReleased (KeyEvent e) {

        text.setText("Key is Released");
    }

    public void keyTyped (KeyEvent e) {

        text.setText("Key is Typed");
    }

}
public class SwingKeyListener { 
    
    public static void main(String []args) {

        MyFrame jf = new MyFrame();
        
    }
}
