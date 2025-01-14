package Travel_and_Tourism_management_system;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame  implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;

    Loading(String username){
        this.username=username;
        t=new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text=new JLabel("Travel and Tourism Application");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);

       bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);

        JLabel Loading=new JLabel("Loading please wait....");
        Loading.setBounds(230,130,150,40);
        Loading.setForeground(Color.red);
        Loading.setFont(new Font("Raleway",Font.BOLD,16));
        add(Loading);

        JLabel username1=new JLabel("Welcome " +username);
       username1.setBounds(20,310,400,40);
  username1.setForeground(Color.RED);
       username1.setFont(new Font("Raleway",Font.BOLD,16));
        add(username1);
        t.start();

        setVisible(true);

    }

    public static void main(String[] args) {
        new Loading("");
    }

    @Override
    public void run() {
        try{
            for( int i=1; i<=101;i++){
                int max=bar.getMaximum();
                int value=bar.getValue();
                if (value<max){
                    bar.setValue(bar.getValue()+1);
                }
                else{
                    setVisible(false);
                    new DashBoard();
                }
                Thread.sleep(50);

            }

        }catch ( Exception e){
            e.printStackTrace();

        }

    }
}
