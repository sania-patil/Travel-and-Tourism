
package travel.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.ActionListener;
public class login extends JFrame implements ActionListener{
    JTextField text,text1;
    JButton login,signup,forgot;
    login(){
    setSize(800,400);
    setLocation(350,200);
    setLayout(null);  //for not using layout of swing
//    for custom layout
   getContentPane().setBackground(Color.WHITE);
    JPanel p1 = new JPanel();
    p1.setBackground(new Color(131,193,233));  //for using RGB colour use color class object otherwise do direct color.colorname
    p1.setBounds(0,0,400,400);
    add(p1);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    Image i2 = i1.getImage().getScaledInstance(200, 200,Image. SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    p1.setLayout(null);
    image.setBounds(100,120,200,200);
    p1.add(image);
//    jlabel use = frame ke upar text add krna
    JPanel p2 = new JPanel();
    p2.setLayout(null);
    p2.setBounds(400, 30, 450, 300);
//    p2.setBackground(Color.gray);
    add(p2);
    
    JLabel user = new JLabel("Username");  //inside() add text which display
    user.setBounds(60, 20, 100, 25);
   user.setFont(new Font("calibri",Font.BOLD,20));
   p2.add(user);
   
    text = new JTextField();
   text.setBounds(60, 60, 300, 30);
   text.setBorder(BorderFactory.createEmptyBorder());
   p2.add(text);
   
   //for password
       JLabel user1 = new JLabel("Password");  //inside() add text which display
    user1.setBounds(60, 110, 100, 25);
   user1.setFont(new Font("calibri",Font.BOLD,20));
   p2.add(user1);
   
    text1 = new JTextField();
   text1.setBounds(60, 150, 300, 30);
   text1.setBorder(BorderFactory.createEmptyBorder());
   p2.add(text1);
   
   login =  new JButton("Login");
   login.setBounds(60, 200, 130, 30);
   login.setBackground(new Color(131,193,233));
   login.setForeground(Color.WHITE);
   login.setBorder(new LineBorder(new Color(131,193,233)));
   login.addActionListener(this); 
//   p2.add(text);
   p2.add(login);
   
      signup =  new JButton("Sign Up");
   signup.setBounds(210, 200, 130, 30);
   signup.setBackground(new Color(131,193,233));
   signup.setForeground(Color.WHITE);
   signup.setBorder(new LineBorder(new Color(131,193,233)));
   signup.addActionListener(this); 
//   p2.add(text);
   p2.add(signup);
   
    forgot =  new JButton("Forgot Password");
   forgot.setBounds(130, 240, 130, 30);
   forgot.setBackground(new Color(131,193,233));
   forgot.setForeground(Color.WHITE);
   forgot.setBorder(new LineBorder(new Color(131,193,233)));
   forgot.addActionListener(this); 
//   p2.add(text);
   p2.add(forgot);
   
   JLabel me = new JLabel("Trouble..?");
   me.setBounds(300,240,150,30);
   me.setForeground(Color.red);
   p2.add(me);
    setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
        try{
        String username = text.getText(); 
        String pass = text1.getText();
        
          String query = "select * from account where username = '" + username + "' AND password = '" + pass + "' ";
          cone c = new cone();
          ResultSet rs = c.s.executeQuery(query);
          if(rs.next()){
              setVisible(false);
              new loading(username);
          }else {
              JOptionPane.showMessageDialog(null,"incorrect username or password");
          }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if (ae.getSource() == signup){
            setVisible(false);
            new signup();
        }else {
            setVisible(false);
            new ForgetPassword();
        }
    }
    public static void main(String[] args){
    login l = new login();
    }
}
