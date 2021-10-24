package databaseconnection;

import java.sql.*;

public class DatabaseConnection {

    Connection cn;

    public Connection connection() {

        try {
            
            Class.forName("org.mariadb.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }

       try{
            cn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/students?user=root&password=");
            System.out.println("Database connect..");
       }catch(SQLException e){
           System.out.println("Database connection fail "+ e);
       }
       
       return cn;

    }

}
