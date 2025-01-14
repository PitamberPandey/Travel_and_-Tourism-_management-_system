package Travel_and_Tourism_management_system;

import javax.swing.*;
import java.awt.*;

public class DashBoard  extends JFrame {
    DashBoard(){
        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/dashboard.png"));
        Image i2= i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon= new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        JLabel heading= new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);

        JButton addpersonalDeatails=new JButton("Add Personal Details");
        addpersonalDeatails.setBounds(0,0,300,50);
        addpersonalDeatails.setMargin(new Insets(0,0,0,60));
        addpersonalDeatails.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(addpersonalDeatails);

        JButton updatepersonalDeatails=new JButton("Update Personal Details");
        updatepersonalDeatails.setBounds(0,50,300,50);
     updatepersonalDeatails.setMargin(new Insets(0,0,0,60));
  updatepersonalDeatails.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(updatepersonalDeatails);


        JButton ViewpersonalDeatails=new JButton("View Details");
     ViewpersonalDeatails.setBounds(0,100,300,50);
 ViewpersonalDeatails.setMargin(new Insets(0,0,0,60));
 ViewpersonalDeatails.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(ViewpersonalDeatails);


        JButton deletepersonalDeatails=new JButton("Delete Personal Details");
        deletepersonalDeatails.setBounds(0,150,300,50);
       deletepersonalDeatails.setMargin(new Insets(0,0,0,60));
      deletepersonalDeatails.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(deletepersonalDeatails);

        JButton checkPackage=new JButton("Check Package");
       checkPackage.setBounds(0,200,300,50);
      checkPackage.setMargin(new Insets(0,0,0,60));
     checkPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(checkPackage);

        JButton bookPackage=new JButton("Book Package");
       bookPackage.setBounds(0,250,300,50);
   bookPackage.setMargin(new Insets(0,0,0,60));
       bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(bookPackage);

        JButton viewPackage=new JButton("View Package");
       viewPackage.setBounds(0,300,300,50);
    viewPackage.setMargin(new Insets(0,0,0,60));
       viewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(viewPackage);

        JButton viewhotel=new JButton("View Hotels");
        viewhotel.setBounds(0,350,300,50);
       viewhotel.setMargin(new Insets(0,0,0,60));
        viewhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(viewhotel);

        JButton bookhotel=new JButton("Book Hotels");
        bookhotel.setBounds(0,400,300,50);
bookhotel.setMargin(new Insets(0,0,0,60));
      bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(bookhotel);

        JButton viewbookhotel=new JButton(" View Book Hotels");
    viewbookhotel.setBounds(0,450,300,50);
       viewbookhotel.setMargin(new Insets(0,0,0,60));
        viewbookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(viewbookhotel);

        JButton destinations=new JButton(" Destinations");
       destinations.setBounds(0,500,300,50);
      destinations.setMargin(new Insets(0,0,0,60));
       destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(destinations);

        JButton payment=new JButton(" Payment");
        payment.setBounds(0,550,300,50);
        payment.setMargin(new Insets(0,0,0,60));
       payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(payment);

        JButton calculator=new JButton(" Calculator");
       calculator.setBounds(0,600,300,50);
     calculator.setMargin(new Insets(0,0,0,60));
       calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(calculator);

        JButton notepad=new JButton(" Notepad");
notepad.setBounds(0,650,300,50);
       notepad.setMargin(new Insets(0,0,0,60));
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(notepad);


        JButton about=new JButton(" About");
        about.setBounds(0,700,300,50);
        about.setMargin(new Insets(0,0,0,60));
       about.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(about);


        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
        Image i5= i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(5,0,1650,1000);
       add(image);








        setVisible(true);
    }
    public static void main(String[] args) {
        new DashBoard();
    }
}
