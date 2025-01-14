package Travel_and_Tourism_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    Conn(){
       try{

           Class.forName("com.mysql.jdbc.Driver");
           c= DriverManager.getConnection(("jdbc:mysql:///travelmanagementsystem"),"root","pitamber???##");

           s= c.createStatement();
       }catch (Exception e){
          e.printStackTrace();
       }

    }

}
