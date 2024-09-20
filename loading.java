
package travel.managment.system;
import javax.swing.*;
import java.awt.*;
public class loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    public void run()
    {
        try{
        for(int i=1;i<=101;i++)
        {
             int max = bar.getMaximum(); //max value kya hain
             int value = bar.getValue();  //current value kya hain
             
             if(value < max){
             bar.setValue(bar.getValue() + 1);
             }else{
                 setVisible(false);
                 new dashboard(username);
             }
             Thread.sleep(50);
        }
        }catch (Exception e){
        e.printStackTrace();
        }
    }
    loading(String username)
    {
        this.username = username;
        t= new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50,20, 600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);
//        for adding progress bar
        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel text1 = new JLabel("Loading,Please Wait...");
        text1.setBounds(230,130, 150,30);
        text1.setForeground(Color.red);
        text1.setFont(new Font("Raleway",Font.BOLD,16));
        add(text1);
        
        JLabel text3 = new JLabel("Welcome " + username);
        text3.setBounds(20,310, 400,40);
        text3.setForeground(Color.red);
        text3.setFont(new Font("Raleway",Font.BOLD,16));
        add(text3);
        
        t.start();
        setVisible(true);
    }
    
    public static void main(String[] args){
        new loading("username");
    }
}
