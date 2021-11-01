
package models;

import crudoperation.DBConnection;
import java.sql.*;
import javax.swing.*;


public class Courses {
    private String courseTitle;
    private String courseCode;
    private String courseCredit;

    public Courses() {
    }

    public Courses(String courseTitle, String courseCode, String courseCredit) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }
    
    public void save(){
       Connection con = new DBConnection().connection();
       String insertQuery = "INSERT INTO courses "
               + "(`course_title`, `course_code`, `course_credit`) "
               + "VALUES (? , ? , ?)";
      
       try{
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setString(1, this.courseTitle);
            pst.setString(2, this.courseCode);
            pst.setString(3, this.courseCredit);
            
            ResultSet rs = pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Course add success");
            
            rs.close();
            con.close();
           
            
       }catch(SQLException error){
           System.out.println(error);
       }
    }
    
    
    
    
}
