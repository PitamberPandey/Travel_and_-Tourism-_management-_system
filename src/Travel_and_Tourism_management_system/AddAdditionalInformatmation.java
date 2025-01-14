package Travel_and_Tourism_management_system;

import javax.swing.*;
import java.awt.*;

public class AddAdditionalInformatmation extends JFrame {
JLabel b2username,labelname;
    JComboBox comboid;
    JTextField tfnumebr,tfcountry,tfaddress,tfemail,tfphone;
    JRadioButton rmale,rfemale;
    AddAdditionalInformatmation(){
        setBounds(450,200,850,550);
        setLocation(500,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);



        JLabel b1username=new JLabel("Username");
        b1username.setBounds(30,50,150,25);
        add(b1username);


         b2username=new JLabel();
        b2username.setBounds(220,50,150,25);
        add(b2username);

        JLabel b1id=new JLabel("Id");
        b1id.setBounds(30,90,150,25);
        add(b1id);

        comboid=new JComboBox(new String []{"password","Citizen id","Pan Card","Idetity"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.white);
        add(comboid);

        JLabel b1numeber=new JLabel("Number");
        b1numeber.setBounds(30,130,150,25);
        add(b1numeber);


        tfnumebr=new JTextField();
        tfnumebr.setBounds(220,130,150,30);
        add(tfnumebr);

        JLabel b1name=new JLabel("Name");
    b1name.setBounds(30,170,150,25);
        add(b1name);


        labelname=new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);

        JLabel b1gender=new JLabel("Gender");
        b1gender.setBounds(30,210,150,25);
        add(b1gender);

        rmale=new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.white);
        add(rmale);

        rfemale=new JRadioButton("Female");
    rfemale.setBounds(300,210,150,25);
        rfemale.setBackground(Color.white);
        add(rfemale);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rfemale);
        bg.add(rmale);

        JLabel b1country=new JLabel("Country");
      b1country.setBounds(30,250,150,25);
        add(b1country);


        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,30);
        add(tfcountry);


        JLabel b1address=new JLabel("Address");
        b1address.setBounds(30,290,150,25);
        add(b1address);

        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,30);
        add(tfaddress);

        JLabel b1phone=new JLabel("Phone Num");
        b1phone.setBounds(30,330,150,25);
        add(b1phone);


        tfphone=new JTextField();
        tfphone.setBounds(220,330,150,30);
        add(tfphone);


        JLabel b1email=new JLabel("Email");
        b1email.setBounds(30,370,150,25);
        add(b1email);

        tfemail=new JTextField();
        tfemail.setBounds(220,370,150,30);
        add(tfemail);




        setVisible(true);


    }
    public static void main(String[] args) {
        new AddAdditionalInformatmation();

    }
}
