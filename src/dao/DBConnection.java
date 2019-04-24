package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
   static Connection con;
   public static Connection dbCon(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","root");
       
       }
       catch(Exception e){
           System.out.println("Error"+e);
       }
       return con;
       
   }
}
