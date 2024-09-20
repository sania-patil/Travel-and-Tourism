
package travel.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField text, text1, text2, text3;
    Choice c;
    signup()
    {
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 500, 400);
        p1.setBackground(new Color(133,193,233));
        add(p1);
//        setLocation(400,200);
        
        JPanel p2 = new JPanel();
        p2.setBounds(500,0,400,400);
        add(p2);
        
        JLabel user = new JLabel("Username:");
        user.setFont(new Font("calibri",Font.BOLD,14));
        user.setBounds(50, 20, 125, 25);
        p1.add(user);
        
        text = new JTextField();
        text.setBounds(190, 20, 180, 25);
        text.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("calibri",Font.BOLD,14));
        name.setBounds(50, 60, 125, 25);
        p1.add(name);
        
        text1 = new JTextField();
        text1.setBounds(190, 60, 180, 25);
        text1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text1);
        
        JLabel pass = new JLabel("Password:");
        pass.setFont(new Font("calibri",Font.BOLD,14));
        pass.setBounds(50, 100, 125, 25);
        p1.add(pass);
        
         text2 = new JTextField();
        text2.setBounds(190, 100, 180, 25);
        text2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text2);
        
        JLabel sec = new JLabel("Security Question");
        sec.setFont(new Font("calibri",Font.BOLD,14));
        sec.setBounds(50, 140, 125, 25);
        p1.add(sec);
        
        c = new Choice();
        c.add("favourate character:");
        c.add("favourate subject");
        c.add("your lucky number");
        c.add("favourate game");
        c.setBounds(190,140,100,230);
        
        JLabel ans = new JLabel("Answer:");
        ans.setFont(new Font("calibri",Font.BOLD,14));
        ans.setBounds(50, 180, 125, 25);
        p1.add(ans);
        p1.add(c);
        
        text3 = new JTextField();
        text3.setBounds(190, 180, 180, 25);
        text3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(text3);
        
         b1 = new JButton("Create");
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("calibri",Font.BOLD,14));
        b1.setBounds(80, 250, 100, 30);
        b1.addActionListener(this);
       p1.add(b1);
       
       b2 = new JButton("Back");
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("calibri",Font.BOLD,14));
        b2.setBounds(200, 250, 100, 30);
        b2.addActionListener(this);
       p1.add(b2);
       
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
    Image i2 = i1.getImage().getScaledInstance(250, 250,Image. SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
//    p1.setLayout(null);
    image.setBounds(100,40,200,250);
    p2.add(image);
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
             String username = text.getText();
             String name  = text1.getText();
             String password = text2.getText();
             String question= c.getSelectedItem();
             String answer = text3.getText();
             
             String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
             try{
                 cone c = new cone();
                 c.s.executeUpdate(query);
                 
//                 after successfully data store pop msg display
               JOptionPane.showMessageDialog(null,"Account Created Successfully");
//               when click on ok current frame should close
                setVisible(false);
                new login();
               
             } catch (Exception e){
                 e.printStackTrace();
             }
             
        }else if(ae.getSource() == b2)
        {
            setVisible(false);
            new login();
        }
    }
    
    
    public static void main(String[] args){
        new signup();
    }
}
