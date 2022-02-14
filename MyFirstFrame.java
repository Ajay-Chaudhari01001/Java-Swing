import javax.swing.*;


public class MyFirstFrame {
    public static void main(String[] args) {
         
        JFrame jf = new JFrame();
        jf. setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setSize(500,500);
        //jf.setLocation(300,50);

        jf.setBounds(100,100,500,500);
        
        jf.setTitle("My Frame");

        // setIcone .. .
        ImageIcon icon = new ImageIcon ("Sample Image Icon.png");
        jf.setIconImage(icon.getImage());

        // change background of JFrame...
       // Container c = jf.getContentPane();
        // Color col = new Color(255,0,0)
       // c.setForeground(Color.RED);


       // can't resizable window
       jf.setResizable(false);
    }
}
