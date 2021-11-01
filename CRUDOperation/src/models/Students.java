package models;

import crudoperation.DBConnection;
import java.sql.*;
import javax.swing.*;

public class Students {

    private int id;
    private String name;
    private String student_id;
    private String address;
    private String email;
    private String password;

    public Students() {
    }

    public Students(String name, String student_id, String address, String email, String password) {

        this.name = name;
        this.student_id = student_id;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void save() {

        Connection con = new DBConnection().connection();
        String insertQuery = "INSERT INTO `student` "
                + "(`id`, `name`, `student_id`, `address`, `email`, `password`)"
                + " VALUES (NULL, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(insertQuery);
            pst.setString(1, this.name);
            pst.setString(2, this.student_id);
            pst.setString(3, this.address);
            pst.setString(4, this.email);
            pst.setString(5, this.password);

            ResultSet rs = pst.executeQuery();
            rs.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Student information successfully saved");

        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }
}
