//
package travel.managment.system;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//public class addcustomer extends JFrame implements ActionListener {
//    JLabel labeluser,labelname;
////    Choice c;
//    JTextField t1,t2,t3,t4,t5;
//    JComboBox id;
//    JRadioButton male,female;
//    JButton add,back;
//    addcustomer(){
//        setBounds(450,200,850,550);
//        setLayout(null);
//        getContentPane().setBackground(Color.white);
//        
//        JLabel user = new JLabel("Username");
//        user.setBounds(30,50,150,25);
//        add(user);
//        labeluser = new JLabel();
//        labeluser.setBounds(220,50,150,25);
//        add(labeluser);
//        
//        JLabel lblid = new JLabel("id");
//        lblid.setBounds(30,90,150,25);
//        add(lblid);
//
//        id = new JComboBox(new String[] {"Passport","Adhar card","pancard","rationcard"});
//        id.setBounds(220,90,150,25); 
//        id.setBackground(Color.white);
//        add(id);
//        
//        JLabel lblnum = new JLabel("Number");
//        lblnum.setBounds(30,130,150,25);
//        add(lblnum);
//        
//        t1 = new JTextField();
//        t1.setBounds(220, 130, 150, 25);
//        add(t1);
//        
//        JLabel lblname = new JLabel("Name");
//        lblname.setBounds(30,170,150,25);
//        add(lblname);
//        
//        labelname = new JLabel();
//        labelname.setBounds(220,170,150,25);
//        add(labelname);
//        
//       JLabel lblgen = new JLabel("Gender");
//        lblgen.setBounds(30,210,150,25);
//        add(lblgen);
//        
//        male = new JRadioButton("Male");
//        male.setBounds(220, 210, 150, 25);
//        male.setBackground(Color.white);
//        add(male);
//        female = new JRadioButton("Female");
//        female.setBounds(300, 210, 150, 25);
//       female.setBackground(Color.white);
//        add(female);
//        
//        ButtonGroup bg = new ButtonGroup();
//        bg.add(male);
//        bg.add(female);
//        
//       JLabel country = new JLabel("Country");
//        country.setBounds(30,250,150,25);
//        add(country);
////        
//        t2 = new JTextField();
//        t2.setBounds(220, 130, 150, 25);
//        add(t2);
//        
//        JLabel addr = new JLabel("Address");
//        addr.setBounds(30,290,150,25);
//        add(addr);
//        
//        t3 = new JTextField();
//        t3.setBounds(220, 290, 150, 25);
//        add(t3);
//        
//        JLabel email = new JLabel("E-Mail");
//        email.setBounds(30,330,150,25);
//        add(email);
//        
//        t4 = new JTextField();
//        t4.setBounds(220, 330, 150, 25);
//        add(t4);
//        
//        JLabel phone = new JLabel("Mobile No.");
//        phone.setBounds(30,370,150,25);
//        add(phone);
//        
//        t5 = new JTextField();
//        t5.setBounds(220, 370, 150, 25);
//        add(t5);
//        
//        add = new JButton("Add");
//        add.setBackground(Color.black);
//        add.setForeground(Color.white);
//        add.setBounds(70,430,100,25);
//        add.addActionListener(this);
//        add(add);
//       
//        back = new JButton("Back");
//        back.setBackground(Color.black);
//        back.setForeground(Color.white);
//        back.setBounds(220,430,100,25);
//       back.addActionListener(this);
//
//        add(back);
//        
//        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel Image = new JLabel(i3);
//        Image.setBounds(400,40,450,420);
//        add(Image);
//        
//        try {
//            cone c = new cone();
//           ResultSet rs =  c.s.executeQuery("select * from account where username = 'saniya'");
//           while(rs.next())
//           {
//               labeluser.setText(rs.getString("username"));
//               labelname.setText(rs.getString("name"));
//           }
//           
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//        setVisible(true);
//    }
//    
//    public void actionPerformed(ActionEvent ae)
//    {
//        if (ae.getSource() == add)
//        {
//            String username = labeluser.getText();
//            String id = (String) id.getSelectedItem();
//            String number = t1.getText();
//            String name = labelname.getText();
//            String gender = null;
//                if(male.isSelected() )
//                {
//                    gender = "Male";
//                }else{
//                    gender = "Female";
//                }
//                
//                String country = t2.getText();
//                String address = t3.getText();
//                String Mobile = t5.getText();
//                String email = t4.getText();
//                
//                try{
//                    cone c = new cone();
//                    ResultSet rs = c.s.executeQuery("SELECT * FROM account WHERE LOWER(username) = 'saniya'");
//
//                        while (rs.next()) {
//                labeluser.setText(rs.getString("username"));
//                labelname.setText(rs.getString("name"));
//                    String query = "Insert into customer values('"+username+"' ,'"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+Mobile+"',,'"+email+"') ";
//                    c.s.executeUpdate(query);
//                    
//                    JOptionPane.showMessageDialog(null,"customer details added successfully");
//                    setVisible(false);
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//        }else{
//            setVisible(false);
//        }
//    }
//    public static void main(String[] args){
//        new addcustomer();
//    }
//}
//package travel.managment.system;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.*;
//
//public class addcustomer extends JFrame implements ActionListener {
//    JLabel labeluser, labelname;
//    JTextField t1, t2, t3, t4, t5;
//    JComboBox<String> id;
//    JRadioButton male, female;
//    JButton add, back;
//
//    addcustomer() {
//        // Window settings
//        setBounds(450, 200, 850, 550);
//        setLayout(null);
//        getContentPane().setBackground(Color.white);
//
//        // Username label
//        JLabel user = new JLabel("Username");
//        user.setBounds(30, 50, 150, 25);
//        add(user);
//        labeluser = new JLabel();
//        labeluser.setBounds(220, 50, 150, 25);
//        add(labeluser);
//
//        // ID Type
//        JLabel lblid = new JLabel("ID");
//        lblid.setBounds(30, 90, 150, 25);
//        add(lblid);
//
//        id = new JComboBox<>(new String[]{"Passport", "Aadhar Card", "PAN Card", "Ration Card"});
//        id.setBounds(220, 90, 150, 25);
//        id.setBackground(Color.white);
//        add(id);
//
//        // ID Number
//        JLabel lblnum = new JLabel("Number");
//        lblnum.setBounds(30, 130, 150, 25);
//        add(lblnum);
//
//        t1 = new JTextField();
//        t1.setBounds(220, 130, 150, 25);
//        add(t1);
//
//        // Name
//        JLabel lblname = new JLabel("Name");
//        lblname.setBounds(30, 170, 150, 25);
//        add(lblname);
//
//        labelname = new JLabel();
//        labelname.setBounds(220, 170, 150, 25);
//        add(labelname);
//
//        // Gender
//        JLabel lblgen = new JLabel("Gender");
//        lblgen.setBounds(30, 210, 150, 25);
//        add(lblgen);
//
//        male = new JRadioButton("Male");
//        male.setBounds(220, 210, 70, 25);
//        male.setBackground(Color.white);
//        add(male);
//
//        female = new JRadioButton("Female");
//        female.setBounds(300, 210, 80, 25);
//        female.setBackground(Color.white);
//        add(female);
//
//        // Button group for gender
//        ButtonGroup bg = new ButtonGroup();
//        bg.add(male);
//        bg.add(female);
//
//        // Country
//        JLabel country = new JLabel("Country");
//        country.setBounds(30, 250, 150, 25);
//        add(country);
//
//        t2 = new JTextField();
//        t2.setBounds(220, 250, 150, 25);
//        add(t2);
//
//        // Address
//        JLabel addr = new JLabel("Address");
//        addr.setBounds(30, 290, 150, 25);
//        add(addr);
//
//        t3 = new JTextField();
//        t3.setBounds(220, 290, 150, 25);
//        add(t3);
//
//        // Email
//        JLabel email = new JLabel("E-Mail");
//        email.setBounds(30, 330, 150, 25);
//        add(email);
//
//        t4 = new JTextField();
//        t4.setBounds(220, 330, 150, 25);
//        add(t4);
//
//        // Mobile Number
//        JLabel phone = new JLabel("Mobile No.");
//        phone.setBounds(30, 370, 150, 25);
//        add(phone);
//
//        t5 = new JTextField();
//        t5.setBounds(220, 370, 150, 25);
//        add(t5);
//
//        // Add Button
//        add = new JButton("Add");
//        add.setBackground(Color.black);
//        add.setForeground(Color.white);
//        add.setBounds(70, 430, 100, 25);
//        add.addActionListener(this);
//        add(add);
//
//        // Back Button
//        back = new JButton("Back");
//        back.setBackground(Color.black);
//        back.setForeground(Color.white);
//        back.setBounds(220, 430, 100, 25);
//        back.addActionListener(this);
//        add(back);
//
//        // Image on the right side
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/customer.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel Image = new JLabel(i3);
//        Image.setBounds(400, 40, 450, 420);
//        add(Image);
//
//        // Fetch user details from the account table
//        try {
//            cone c = new cone();
//            ResultSet rs = c.s.executeQuery("select * from account where username = 'saniya'");
//            while (rs.next()) {
//                labeluser.setText(rs.getString("username"));
//                labelname.setText(rs.getString("name"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == add) {
//            String username = labeluser.getText();
//            String idType = (String) id.getSelectedItem();
//            String number = t1.getText();
//            String name = labelname.getText();
//            String gender = null;
//
//            if (male.isSelected()) {
//                gender = "Male";
//            } else if (female.isSelected()) {
//                gender = "Female";
//            }
//
//            String country = t2.getText();
//            String address = t3.getText();
//            String mobile = t5.getText();
//            String email = t4.getText();
//
//            // Insert customer details into the database
//            try {
//                cone c = new cone();
//                String query = "Insert into customer values('" + username + "', '" + idType + "', '" + number + "', '" + name + "', '" + gender + "', '" + country + "', '" + address + "', '" + mobile + "', '" + email + "')";
//                c.s.executeUpdate(query);
//
//                JOptionPane.showMessageDialog(null, "Customer details added successfully");
//                setVisible(false);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (ae.getSource() == back) {
//            setVisible(false);
//        }
//    }
//
//    public static void main(String[] args) {
//        new addcustomer();
//    }
//}
//package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class addcustomer extends JFrame implements ActionListener {
    JLabel labeluser, labelname;
    JTextField t1, t2, t3, t4, t5;
    JComboBox<String> id;
    JRadioButton male, female;
    JButton add, back;

    addcustomer() {
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel user = new JLabel("Username");
        user.setBounds(30, 50, 150, 25);
        add(user);
        
        labeluser = new JLabel();
        labeluser.setBounds(220, 50, 150, 25);
        add(labeluser);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        id = new JComboBox<>(new String[]{"Passport", "Aadhar Card", "Pancard", "Ration Card"});
        id.setBounds(220, 90, 150, 25); 
        id.setBackground(Color.white);
        add(id);
        
        JLabel lblnum = new JLabel("Number");
        lblnum.setBounds(30, 130, 150, 25);
        add(lblnum);
        
        t1 = new JTextField();
        t1.setBounds(220, 130, 150, 25);
        add(t1);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);
        
        JLabel lblgen = new JLabel("Gender");
        lblgen.setBounds(30, 210, 150, 25);
        add(lblgen);
        
        male = new JRadioButton("Male");
        male.setBounds(220, 210, 75, 25);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(300, 210, 75, 25);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        JLabel country = new JLabel("Country");
        country.setBounds(30, 250, 150, 25);
        add(country);
        
        t2 = new JTextField();
        t2.setBounds(220, 250, 150, 25);
        add(t2);
        
        JLabel addr = new JLabel("Address");
        addr.setBounds(30, 290, 150, 25);
        add(addr);
        
        t3 = new JTextField();
        t3.setBounds(220, 290, 150, 25);
        add(t3);
        
        JLabel email = new JLabel("E-Mail");
        email.setBounds(30, 330, 150, 25);
        add(email);
        
        t4 = new JTextField();
        t4.setBounds(220, 330, 150, 25);
        add(t4);
        
        JLabel phone = new JLabel("Mobile No.");
        phone.setBounds(30, 370, 150, 25);
        add(phone);
        
        t5 = new JTextField();
        t5.setBounds(220, 370, 150, 25);
        add(t5);
        
        add = new JButton("Add");
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.setBounds(70, 430, 100, 25);
        add.addActionListener(this);
        add(add);
       
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(220, 430, 100, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);
        
        try {
            cone c = new cone();
            ResultSet rs = c.s.executeQuery("SELECT * FROM account WHERE username = 'saniya'");
            while (rs.next()) {
                labeluser.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String username = labeluser.getText();
            String idType = (String) id.getSelectedItem();
            String number = t1.getText();
            String name = labelname.getText();
            String gender = male.isSelected() ? "Male" : "Female";
            String country = t2.getText();
            String address = t3.getText();
            String mobile = t5.getText();
            String email = t4.getText();
                
            try {
                cone c = new cone();
                String query = "INSERT INTO customer VALUES('" + username + "', '" + idType + "', '" + number + "', '" + name + "', '" + gender + "', '" + country + "', '" + address + "', '" + mobile + "', '" + email + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer details added successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addcustomer();
    }
}
