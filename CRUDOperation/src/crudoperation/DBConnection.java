/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudoperation;

import java.sql.*;


public class DBConnection {
    private Connection cn;

    public Connection connection() {

        try {
            
            Class.forName("org.mariadb.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }

       try{
            cn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/diu?user=root&password=");
            System.out.println("Database connect..");
       }catch(SQLException e){
           System.out.println("Database connection fail "+ e);
       }
       
       return cn;

    }
}
