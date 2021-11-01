package views;

import crudoperation.DBConnection;
import models.Students;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

/**
 *
 * @author Md Rifat
 */
public class Student extends javax.swing.JFrame {

    public Student() {
        initComponents();
        loadTableData();
        jT_studentTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = jT_studentTable.getSelectedRow();
                System.out.println(selectedRow);
                if (selectedRow >= 0) {
                    DefaultTableModel model = (DefaultTableModel) jT_studentTable.getModel();
                    int id = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
                    jT_selectedId.setText(Integer.toString(id));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jT_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jT_address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jT_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_pass = new javax.swing.JPasswordField();
        jB_clear = new javax.swing.JButton();
        jB_save1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_studentTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jT_selectedId = new javax.swing.JTextField();
        jB_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Students");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        jB_clear.setText("Clear");
        jB_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_clearActionPerformed(evt);
            }
        });

        jB_save1.setText("Save");
        jB_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_save1ActionPerformed(evt);
            }
        });

        jT_studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null , null},
            },
            new String [] {
                "ID", "Name", "S.Id", "Address", "Email","Password"
            }
        ));
        jScrollPane1.setViewportView(jT_studentTable);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selected Id");

        jT_selectedId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_selectedId.setText("0");
        jT_selectedId.setEnabled(false);
        jT_selectedId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_selectedIdActionPerformed(evt);
            }
        });

        jB_delete.setText("Delete");
        jB_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_save1))
                    .addComponent(jT_name)
                    .addComponent(jLabel2)
                    .addComponent(jT_id, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jT_address, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jT_email, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jT_pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jT_selectedId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jB_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_clear)
                            .addComponent(jB_save1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jT_selectedId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_save1ActionPerformed
        Students st = new Students();
        st.setName(jT_name.getText());
        st.setStudent_id(jT_id.getText());
        st.setAddress(jT_address.getText());
        st.setEmail(jT_email.getText());
        st.setPassword(jT_pass.getPassword().toString());

        st.save();
        clear();
        loadTableData();

    }//GEN-LAST:event_jB_save1ActionPerformed

    private void jB_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_clearActionPerformed
        clear();
    }//GEN-LAST:event_jB_clearActionPerformed

    private void jT_selectedIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_selectedIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_selectedIdActionPerformed

    private void jB_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_deleteActionPerformed
        int id = Integer.parseInt(jT_selectedId.getText());

        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "Select A Student");
        } else {
            Connection con = new DBConnection().connection();
            String deleteQuery = "DELETE FROM student WHERE id=?";

            try {
                PreparedStatement pst = con.prepareStatement(deleteQuery);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery();
                rs.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Student Delete Success");
                loadTableData();            

            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_jB_deleteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    public void clear() {
        jT_address.setText("");
        jT_email.setText("");
        jT_id.setText("");
        jT_name.setText("");
        jT_pass.setText("");
    }

    @SuppressWarnings("unchecked")
    public void loadTableData() {
        Connection con = new DBConnection().connection();
        String getTableDataQuery = "SELECT * FROM student";

        try {

            PreparedStatement pst = con.prepareStatement(getTableDataQuery);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData RSMD = rs.getMetaData();
            int count = RSMD.getColumnCount();

            DefaultTableModel dft = (DefaultTableModel) jT_studentTable.getModel();
            dft.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();

                for (int i = 1; i <= count; i++) {
                    v.add(rs.getString(i));
                }
                
                dft.addRow(v);
            }

        } catch (SQLException error) {
            System.out.println(error);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_clear;
    private javax.swing.JButton jB_delete;
    private javax.swing.JButton jB_save1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_address;
    private javax.swing.JTextField jT_email;
    private javax.swing.JTextField jT_id;
    private javax.swing.JTextField jT_name;
    private javax.swing.JPasswordField jT_pass;
    private javax.swing.JTextField jT_selectedId;
    private javax.swing.JTable jT_studentTable;
    // End of variables declaration//GEN-END:variables
}
