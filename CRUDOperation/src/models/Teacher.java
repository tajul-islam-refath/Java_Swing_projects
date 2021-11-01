package models;

import crudoperation.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Teacher {

    private String name;
    private String teacher_id;
    private String email;
    private String password;
    private String gender;

    public Teacher() {
    }

    public Teacher(String name, String teacher_id, String email, String password) {
        this.name = name;
        this.teacher_id = teacher_id;
        this.email = email;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void save() {
        Connection con = new DBConnection().connection();
        String insertQuery
                = "INSERT INTO `teachers` "
                + "(`name` ,`teacher_id`, `email`, `password`) "
                + "VALUES (? , ? , ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setString(1, this.name);
            pst.setString(2, this.teacher_id);
            pst.setString(3, this.email);
            pst.setString(4, this.password);
            
            ResultSet rs = pst.executeQuery();
            rs.close();
            con.close();
            
            JOptionPane.showMessageDialog(null, "Teacher information successfully saved ");
            

        } catch (SQLException error) {
            System.out.println(error);
        }
    }

}
