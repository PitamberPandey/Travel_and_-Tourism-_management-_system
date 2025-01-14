package Travel_and_Tourism_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Security;
import java.security.cert.CertPath;

public class Signup extends JFrame implements ActionListener {
    JButton back,create;
    JTextField username2,nametf,password,answertf,answer;
    Choice security;
    //JLabel username1,name,password1,securityq;
    Signup(){
        setBounds(300,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setLocation(250,250);

        JPanel p1=new JPanel();
        p1.setBounds(0,0,500,360);
        p1.setBackground(new Color(133,193,233));
        p1.setLayout(null);
        add(p1);

        JLabel username1=new JLabel("Username");
        username1.setFont(new Font("Tahoma",Font.BOLD,14));
        username1.setBounds(50,20,125,25);
        p1.add(username1);


  username2=new JTextField();
        username2.setBounds(190,20,180,25);
        username2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(username2);
        setVisible(true);

        JLabel name=new JLabel("Name");
        name.setFont(new Font("Tahoma",Font.BOLD,14));
      name.setBounds(50,60,125,25);
      p1.add(name);


       nametf=new JTextField();
nametf.setBounds(190,60,180,25);
    nametf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(nametf);
        setVisible(true);




        JLabel password1=new JLabel("Password");
password1.setFont(new Font("Tahoma",Font.BOLD,14));
   password1.setBounds(50,100,125,25);
        p1.add(password1);


    password=new JTextField();
password.setBounds(190,100,180,25);
password.setBorder(BorderFactory.createEmptyBorder());
        p1.add(password);

        JLabel securityq=new JLabel("Security Question");
        securityq.setFont(new Font("Tahoma",Font.BOLD,14));
     securityq.setBounds(50,140,125,25);
        p1.add(securityq);
         security=new Choice();
        security.add("Fav Character from The Boys");
        security.add("Which is your  Lucky number");
        security.add("your school name");
        security.add("Most like book ");
        security.setBounds(190,140,180,25);
        p1.add(security);

        JLabel answer= new JLabel("Answer");
  answer.setFont(new Font("Tahoma",Font.BOLD,14));
      answer.setBounds(50,180,125,25);
        p1.add(answer);

         answertf=new JTextField();
       answertf.setBounds(190,180,180,25);
  answertf.setBorder(BorderFactory.createEmptyBorder());
        p1.add(answertf);


         create=new JButton("Create");
        //create.setBackground(new Color(133,193,233));
        //create.setForeground(Color.white);
        //create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);

        p1.add(create);


  back=new JButton("Back");
  //back.setBackground(new Color(133,193,233));
        //back.setForeground(Color.white);
//back.setFont(new Font("Tahoma",Font.BOLD,14));
     back.setBounds(250,250,100,30);
     back.addActionListener(this);
        p1.add(back);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i2= i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);


        setVisible(true);
        setLayout(null);
    }

    public static void main(String[] args) {
        new Signup();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== create){
            String usernameg=username2.getText();
            String nameg=nametf.getText();
            String passwordg=password.getText();
            String securityg=security.getSelectedItem();
            String answertfg=answertf.getText();



            String query = "insert into account values ('" + usernameg + "', '" + nameg + "','" + passwordg + "','" + securityg + "','" + answertfg + "')";
            try{
                Conn c= new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
                new Login();


            }catch (Exception ae){
                ae.printStackTrace();
            }
        }
        else if(e.getSource()== back){
            setVisible(false);
            new Login();

        }

    }
}
