import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame  implements MouseListener {

     Container c;
     JLabel l;
     JTextArea text;

    public MyFrame () {

        setBounds(100,50,500,500);
        setTitle("Mouse Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        c = this.getContentPane();
        c.setLayout(null);

        l = new JLabel("My Label");
        l.setFont(new Font("Arial",Font.BOLD,18));
        l.setBounds(50,100,100,30);
        c.add(l);

        text = new JTextArea ();
        text.setBounds(200,50,300,300);
        c.add(text);

        text.addMouseListener(this);

        

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        text.setText(text.getText()+"\n"+"Mouse click listener");
    }
    public void mouseEntered (MouseEvent e) {
        text.setText(text.getText()+"\n"+"call Mouse Entered");
    }
    public void mouseExited (MouseEvent e) {
        text.setText(text.getText()+"\n"+"call Mouse Exited");
    }
    public void mousePressed (MouseEvent e) {
        text.setText(text.getText()+"\n"+"call Mouse Pressed");
    }
    public void mouseReleased (MouseEvent e) {
        text.setText(text.getText()+"\n"+"call Mouse Released");
    }

}

public class SwingMouseListener { 
    
    public static void main(String []args) {

        MyFrame jf = new MyFrame();
        
    }
}
