
package travel.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ForgetPassword extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);
                
                
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 500, 280);
        add(p1);
        
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20, 100, 25);
        user.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(user);
        
        t1 = new JTextField();
        t1.setBounds(220,20 , 150, 25);
        p1.add(t1);
        t1.setBorder(BorderFactory.createEmptyBorder());
        
        b1 = new JButton("Search");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(380, 20, 100, 25);
        b1.addActionListener(this);
        p1.add(b1);
        
        JLabel name = new JLabel("Name");
        name.setBounds(40, 60, 100, 25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(name);
        
        t2 = new JTextField();
        t2.setBounds(220,60 , 150, 25);
        p1.add(t2);
        t2.setBorder(BorderFactory.createEmptyBorder());
        
//        b1 = new JButton("Search");
//        b1.setBackground(Color.GRAY);
//        b1.setForeground(Color.WHITE);
//        b1.setBounds(380, 20, 100, 25);
//        b2.addActionListener(this);
//        p1.add(b1);
        
        JLabel sec = new JLabel("Security Question");
        sec.setBounds(40, 100, 150, 25);
        sec.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(sec);
        
        t3 = new JTextField();
        t3.setBounds(220,100 , 150, 25);
        p1.add(t3);
        t3.setBorder(BorderFactory.createEmptyBorder());
        
        JLabel answer = new JLabel("Answer");
        answer.setBounds(40, 140, 100, 25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(answer);
        
        t4 = new JTextField();
        t4.setBounds(220,140 , 150, 25);
        p1.add(t4);
        t4.setBorder(BorderFactory.createEmptyBorder());
        
        b2 = new JButton("Retrieve");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(380, 140, 100, 25);
        b2.addActionListener(this);
        p1.add(b2);
        
                
        JLabel pass = new JLabel("Password");
        pass.setBounds(40, 180, 100, 25);
        pass.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(pass);
        
        t5 = new JTextField();
        t5.setBounds(220,180 , 150, 25);
        p1.add(t5);
        t5.setBorder(BorderFactory.createEmptyBorder());
                
        b3 = new JButton("Back");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150, 230, 100, 25);
        b3.addActionListener(this);
        p1.add(b3);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
        try{
            String query = "select * from account where username=?" + b1.getText()+"'";
            cone c = new cone();
            ResultSet rs =c.s.executeQuery(query);
//            FOR LOOPING RESULTSET(ITS IS FROM JAVA.SQL.* PACKAGE) OBJECT USE NEXT()FUNCTIOM
        while(rs.next())
        {
            t2.setText(rs.getString("name"));
            t3.setText(rs.getString("security"));
        }
        }catch(Exception e){
        e.printStackTrace();
        }
        }else if(ae.getSource() == b2){
        
        }else if (ae.getSource() == b3){
            setVisible(false);
            new login();
        }
        

    }
    public static void main(String[] args){
        new ForgetPassword();
    }
}
