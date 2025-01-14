package Travel_and_Tourism_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener  {
    JButton login1,signup,forgot;
    JTextField tfusername,tfpassword;
    Login(){
        setSize(900, 400);
        setLocation(350,200);
        setLayout(null);

        getContentPane().setBackground(Color.white);



        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);



        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);


        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);

        JLabel username=new JLabel("Username");
        username.setBounds(60,20,100,25);
        username.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(username);

         tfusername=new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        p2.add(username);

        JLabel password=new JLabel("Password");
        password.setBounds(60,110,100,25);
        password.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        p2.add(password);

       tfpassword=new JTextField();
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);


         login1=new JButton("Login");
        login1.setBounds(60,200,130,30);
        login1.addActionListener(this);
        p2.add(login1);

        signup=new JButton("SignUp");
        signup.setBounds(230,200,130,30);
        signup.addActionListener(this);
        p2.add(signup);

         forgot=new JButton("Forget Password");
        forgot.setBounds(130,250,130,30);
        forgot.addActionListener(this);
        p2.add(forgot);

        JLabel text=new JLabel("Trouble in login");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.RED);
        p2.add(text);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login1){
            try{
                String username=tfusername.getText();
                String password1=tfpassword.getText();

                String query="select * from account where username ='"+username+"' AND password='"+password1+"'";
            Conn c= new Conn();
            ResultSet rs=c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Loading(username);
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect username and password");
            }

            }catch (Exception ae){
                ae.printStackTrace();
            }

        } else if (e.getSource()==signup) {
            setVisible(false);
            new Signup();

        }
        else{
            setVisible(false);
            new Forget_password();

        }


    }
}
