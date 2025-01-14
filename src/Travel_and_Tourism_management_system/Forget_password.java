package Travel_and_Tourism_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Forget_password extends JFrame  implements ActionListener {
    JTextField b2username,  b2name,  tsquestion, ts1answer,ts1password;
    JButton search,find,back;

    Forget_password (){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);



        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/forgotpassword.jpg"));
Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
ImageIcon i3= new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(580,70,200,200);
add(image);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);

        JLabel b1username= new JLabel("Username");
        b1username.setBounds(40,20,100,25);
        b1username.setFont(new Font("Tohoma",Font.BOLD,14));
        p1.add(b1username);
        setVisible(true);

 b2username=new JTextField();
        b2username.setBounds(230,20,150,25);
        b2username.setBorder(BorderFactory.createEmptyBorder());
        p1.add(b2username);

        search=new JButton("Search");
        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);

        JLabel b1name= new JLabel("Name");
        b1name.setBounds(40,60,100,25);
        b1name.setFont(new Font("Tohoma",Font.BOLD,14));
        p1.add(b1name);


        b2name=new JTextField();
        b2name.setBounds(230,60,150,25);
        b2name.setBorder(BorderFactory.createEmptyBorder());
        p1.add(b2name);


        JLabel squestion= new JLabel("Your Security Question");
        squestion.setBounds(40,100,200,25);
        squestion.setFont(new Font("Tohoma",Font.BOLD,14));
        p1.add(squestion);


        tsquestion=new JTextField();
    tsquestion.setBounds(230,100,150,25);
        tsquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tsquestion);

        JLabel sanswer=  new JLabel("Answer");
        sanswer.setBounds(40,140,200,25);
   sanswer.setFont(new Font("Tohoma",Font.BOLD,14));
        p1.add(sanswer);


        ts1answer=new JTextField();
       ts1answer.setBounds(230,140,150,25);
       ts1answer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(ts1answer);

        find=new JButton("Retrieve");
        find.setBounds(380,140,100,25);
        find.addActionListener(this);
        p1.add(find);

        JLabel passowrd=  new JLabel("Password");
   passowrd.setBounds(40,180,200,25);
passowrd.setFont(new Font("Tohoma",Font.BOLD,14));
        p1.add(passowrd);

        ts1password=new JTextField();
   ts1password.setBounds(230,180,150,25);
       ts1password.setBorder(BorderFactory.createEmptyBorder());
       p1.add(ts1password);



        back=new JButton("Back");
        back.setBounds(150,230,100,25);
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);




    }

    public static void main(String[] args) {
        new Forget_password();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==search){
            try {
                String query="select * from account where username ='"+b2username.getText()+"'";
                Conn c=new Conn();
                 ResultSet rs=c.s.executeQuery(query);
                 while(rs.next()){
                     b2name.setText(rs.getString("name"));
                     tsquestion.setText(rs.getString("security"));
                 }

            }catch (Exception e) {
                e.printStackTrace();

            }

        }
        else if(ae.getSource()==find) {
            try {
                String query="select * from account where answer ='"+ts1answer.getText()+"' AND username='"+b2username.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    ts1password.setText(rs.getString("password"));
                }

            }catch (Exception e) {
                e.printStackTrace();

            }
        }
        else {
            setVisible(false);
            new Login();
        }

    }
}
