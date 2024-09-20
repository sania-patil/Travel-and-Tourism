package travel.managment.system;
//import java.sql.*;    

//public class cone {
////import java.sql.*;    
////    1.register the driver
////    2.creating the connection string
////    3.creating the statement
////    4.executing mysql queries
////    5.closing the connections(optional)
//    Connection c;
//    Statement s;
//    cone()
//    {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            c = DriverManager.getConnection("jdbc:mysql:///travelmanagmentsystem","root","kpatil948@");
//            s = c.createStatement();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}
import java.sql.*;

public class cone {
    Connection c;
    Statement s;

    public cone() {
        try {
            // Update the JDBC URL, username, and password to match your setup
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_management", "root", "kpatil948@"); // Update with your DB name and credentials
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

