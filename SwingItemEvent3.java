import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFram extends JFrame implements ItemListener {

    Container c;
    JCheckBox ch1,ch2,ch3,ch4,ch5,ch6;
    JTextArea text;

      MyFram () {

         // creating JCheckBox
         JCheckBox ch1 = new JCheckBox("Ajay");
         JCheckBox ch2 = new JCheckBox("Nilesh");
         JCheckBox ch3 = new JCheckBox("Gaurav");
         JCheckBox ch4 = new JCheckBox("Sandip");
         JCheckBox ch5 = new JCheckBox("Pradip");
         JCheckBox ch6 = new JCheckBox("Bhagawan");
          
         ch1.setBounds(100,50,100,20);
         ch2.setBounds(100,100,100,20);
         ch3.setBounds(100,150,100,20);
         ch4.setBounds(100,150,100,20);
         ch5.setBounds(100,200,100,20);
         ch6.setBounds(100,250,200,20);
 
         c.add(ch1);
         c.add(ch2);
         c.add(ch3);
         c.add(ch4);
         c.add(ch5);
         c.add(ch6);

         ch1.addItemListener(this);
         ch2.addItemListener(this);
         ch3.addItemListener(this);
         ch4.addItemListener(this);
         ch5.addItemListener(this);
         ch6.addItemListener(this);
             
        setVisible(true);
    }

    // abstract method of ItemListener
    public void itemStateChanged (ItemEvent e) { 
        
        if(e.getSource() == ch1){

            text.setText("Ajay is selected");
        }
        if(e.getSource() == ch2){

            text.setText("Nilesh is selected");
        }
        if(e.getSource() == ch3){

            text.setText("Gaurava is selected");
        }
        if(e.getSource() == ch4){

            text.setText("Sandip is selected");
        }
        if(e.getSource() == ch5){

            text.setText("Pradip is selected");
        }
        if(e.getSource() == ch6){

            text.setText("Bhagwan is selected");
        }

   }
}
public class SwingItemEvent3 { 
    
    public static void main(String []args) {

        MyFram jf = new MyFram();
        
    }
}
