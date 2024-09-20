
package travel.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Insets;

public class dashboard extends JFrame {
    String username;
    dashboard(String username)
    {
        this.username =  username;
//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
       JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        JButton person = new JButton("Add Personal Details");
        person.setBounds(0, 0, 300, 50);
        person.setBackground(new Color(0,0,102));
        person.setForeground(Color.WHITE);
        person.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,60,0));
        p2.add(person);
        
        JButton update = new JButton("Update Personal Details");
        update.setBounds(0, 50, 300, 50);
        update.setBackground(new Color(0,0,102));
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,30,0));
        p2.add(update);
        
        JButton view = new JButton("View Details");
        view.setBounds(0, 100, 300, 50);
        view.setBackground(new Color(0,0,102));
        view.setForeground(Color.WHITE);
        view.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,130,0));
        p2.add(view);
        
        JButton delete = new JButton("Delete Personal Details");
        delete.setBounds(0, 150, 300, 50);
        delete.setBackground(new Color(0,0,102));
        delete.setForeground(Color.WHITE);
        delete.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,40,0));
        p2.add(delete);
        
        JButton check = new JButton("Check Package");
        check.setBounds(0, 200, 300, 50);
        check.setBackground(new Color(0,0,102));
        check.setForeground(Color.WHITE);
        check.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,110,0));
        p2.add(check);
        
        JButton book = new JButton("Book Package");
        book.setBounds(0, 250, 300, 50);
        book.setBackground(new Color(0,0,102));
        book.setForeground(Color.WHITE);
        book.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,120,0));
        p2.add(book);
        
        JButton viewpack = new JButton("View Package");
        viewpack.setBounds(0, 300, 300, 50);
        viewpack.setBackground(new Color(0,0,102));
        viewpack.setForeground(Color.WHITE);
        viewpack.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,120,0));
        p2.add(viewpack);
        
        JButton viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,130,0));
        p2.add(viewhotels);
        
        JButton bookhotels = new JButton("Book Hotels");
        bookhotels.setBounds(0, 400, 300, 50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,140,0));
        p2.add(bookhotels);
        
        JButton viewbookhotels = new JButton("View Booked Hotels");
        viewbookhotels.setBounds(0, 450, 300, 50);
        viewbookhotels.setBackground(new Color(0,0,102));
        viewbookhotels.setForeground(Color.WHITE);
        viewbookhotels.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,70,0));
        p2.add(viewbookhotels);
        
        JButton destination = new JButton("Destinations");
        destination.setBounds(0, 500, 300, 50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,100,0));
        p2.add(destination);
        
        JButton payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,120,0));
        p2.add(payments);
        
       JButton calci = new JButton("Calculator");
        calci.setBounds(0, 600, 300, 50);
        calci.setBackground(new Color(0,0,102));
        calci.setForeground(Color.WHITE);
        calci.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,155,0));
        p2.add(calci);
        
        JButton notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,120,0));
        p2.add(notepad);
        
        JButton about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.BOLD,20));
        person.setMargin(new Insets(0,0,120,0));
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6); 
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travels and Tourism Management System");
        text.setBounds(400, 70, 1000, 70);
        image.add(text);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.PLAIN,50));
       setVisible(true);
    }
    
    public static void main(String[] args){
    new dashboard("");
    }
}
