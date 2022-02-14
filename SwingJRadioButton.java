import java.awt.*;
import javax.swing.*;

public class SwingJRadioButton {

    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setBounds(100,50,500,500);
        jf.setTitle("JRadioButton");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        // creation gender buttons
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(100,50,120,30);
        c.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(200,50,120,30);
        c.add(female);

        Font font = new Font("Arial",Font.BOLD, 20);
        male.setFont(font);
        female.setFont(font);
        
        // selecting anyone one radio Button
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        //male.setSelected(true);

        // cast radiobutton
        JRadioButton gen = new JRadioButton("General");
        JRadioButton obc = new JRadioButton("OBC");
        JRadioButton sc = new JRadioButton("SC");
        JRadioButton st = new JRadioButton("ST");

        gen.setBounds(100,100,100,20);
        obc.setBounds(200,100,100,20);
        sc.setBounds(300,100,100,20);
        st.setBounds(400,100,100,20);

        c.add(gen);
        c.add(obc);
        c.add(sc);
        c.add(st);

        // creationg buttongroup
        ButtonGroup cast = new ButtonGroup();
        cast.add(gen);
        cast.add(obc);
        cast.add(sc);
        cast.add(st);
        //gen.setSelected(true);
        //obc.setEnabled(false);
         

        jf.setVisible(true);
        
    }
    
}