package Travel_and_Tourism_management_system;

import javax.swing.*;
import java.awt.*;

public   class Splash extends JFrame  implements Runnable{
    Thread thread;
    Splash(){
       // setSize(1200,600);

        //setLocation(200,100);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/test.png"));
        Image i2= i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        setVisible(true);
        thread =new Thread(this);
        thread.start();

    }




    public static void main(String[] args) {

        Splash frame=new Splash();
        int x=1;
        for(int i=0;i<=600;x+=7, i+=6){
            frame.setLocation(750-(x+i)/2,400-(i/2));
            frame.setSize(i*2,i);
            try{
                Thread.sleep(50);

            }catch (Exception e) {
                System.out.println(e);

            }
        }

    }



    @Override
    public void run() {
        try{
            Thread.sleep(9000);
            setVisible(false);
            new Login();

        }catch (Exception e){
            System.out.println(e);

        }


    }
}
