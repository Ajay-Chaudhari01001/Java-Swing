import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingJComboBox {

    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setBounds(100,50,500,500);
        jf.setTitle("JRadioButton");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        String [] values = {"Jalaon","Nahshik","Muktainagar","Pune","Pune","Pune"};

        JComboBox c1 = new  JComboBox<>(values);
        c1.setBounds(100,100,100,30);
        c.add(c1);

        c1.addItem("Bhuldhana");
        c1.removeItem("Pune");
        c1.removeItem("Pune");

        c1.setEditable(true);
        c1.setSelectedIndex(2);

        c1.setFont(new Font("Arial",Font.BOLD,20));

        
        JButton button = new JButton("ok");
        button.setBounds(300,100,100,30);
        c.add(button);

        JLabel label = new JLabel();
        label.setBounds(100,300,100,30);
        c.add(label);

        button.addActionListener(new ActionListener(){
            
            public void actionPerformed (ActionEvent e) {

                String item = (String)c1.getSelectedItem();
                String index = String.valueOf(c1.getSelectedIndex());
                //label.setText(item);
                label.setText(index);
            }
        });

        jf.setVisible(true);
        
    }
}