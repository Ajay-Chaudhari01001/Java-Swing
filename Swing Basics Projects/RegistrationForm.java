import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyFrame extends JFrame  implements ActionListener {

    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox day, month, year;
    JCheckBox terms;
    JTextArea tal, screen;
    JButton submit;
    JLabel msg;

    MyFrame () {
        setTitle("Registration Form");
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        // name and mobile number fields creating
        label1 = new JLabel("Name");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1 = new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        label2 = new JLabel("Mobile");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        t2 = new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        label3 = new JLabel("Gender");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        // radio buttons creations
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);
        c.add(male);
        c.add(female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        // date of birth section
        label4 = new JLabel ("DOB");
        label4.setBounds(20,200,100,20);
        c.add(label4);

        String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" };
        String months[] = {"Jan","Feb","March","April","Mai","June","July","August","Suptember","October","November","December"};
        String years[] = {"200","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022" };

        day = new JComboBox (days);
        month = new JComboBox(months);
        year = new JComboBox(years);

        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,60,20);

        c.add(day);
        c.add(month);
        c.add(year);

        // address section
        label5 = new JLabel ("Address");
        label5.setBounds(20,250,100,20);
        c.add(label5);

        tal = new JTextArea ();
        tal.setBounds(130,240,200,50);
        c.add(tal);

        // terms and condition checkBox
        terms = new JCheckBox("Please Accept terms and Conditions");
        terms.setBounds(50,300,250,20);
        c.add(terms);

        // submit button creating
        submit = new JButton("submit");
        submit.setBounds(150,350,80,20);
        c.add(submit);
        submit.addActionListener(this);

        // show DataBox
        screen = new JTextArea ();
        screen.setBounds(350,80,300,300);
        c.add(screen);

        // massage label to check terms and conditions
        msg = new JLabel ();
        msg.setBounds(20,400,250,20);
        c.add(msg);

        setVisible(true);
    }

    // override method of ActionListener abstract class
    public void actionPerformed  (ActionEvent e) {

        if(terms.isSelected()) {

           msg.setText("Registration Successfull...");

            String name = t1.getText();
            String mobile = t2.getText();
            String gender = "male";
             if(female.isSelected())
                gender = "female";
            
            String dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
            String address = tal.getText();

            screen.setText("Name : "+name+"\n"+"Mobile : "+mobile+"\n"+"Gender : "+gender+"\n"+"DOB : "+dob+"\n"+"Address : "+address );
        }
        else {
            msg.setText("Please Accept terms and Conditions...");
        }
         
        
    }

}

public class RegistrationForm {
    
    public static void main(String []args) {
        
        MyFrame frame = new MyFrame();
    }
}
