
package databaseconnection;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection cn = new DatabaseConnection().connection();
        
        try{
            PreparedStatement st =  cn.prepareStatement("select * from student where name=?");   
            try (ResultSet rs = st.executeQuery()) {
               
                while(rs.next()){
                    System.out.println("Name :"+ rs.getString("name"));
                    System.out.println("Email :"+ rs.getString("email"));
                }
            }        
            cn.close();
        }catch(SQLException e){
            System.out.println("Error "+ e);
        }
        
    }
}
