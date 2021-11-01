package views;


import models.Teacher;


public class Registation extends javax.swing.JFrame {

    public Registation() {
        initComponents();
        setLocation(300, 100);
        setTitle("Registation Form");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollBar1 = new javax.swing.JScrollBar();
        main_panel = new javax.swing.JPanel();
        left_jp = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        right_jp = new javax.swing.JPanel();
        signUp_jl = new javax.swing.JLabel();
        jL_name = new javax.swing.JLabel();
        jT_name = new javax.swing.JTextField();
        jL_id = new javax.swing.JLabel();
        jT_id = new javax.swing.JTextField();
        jL_email = new javax.swing.JLabel();
        jT_email = new javax.swing.JTextField();
        jL_pass = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jT_pass = new javax.swing.JPasswordField();
        jB_submit = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setBackground(new java.awt.Color(44, 62, 80));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left_jp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Prgramming Language\\Java Swing Projects\\CRUDOperation\\src\\assets\\r.png")); // NOI18N

        javax.swing.GroupLayout left_jpLayout = new javax.swing.GroupLayout(left_jp);
        left_jp.setLayout(left_jpLayout);
        left_jpLayout.setHorizontalGroup(
            left_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_jpLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        left_jpLayout.setVerticalGroup(
            left_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_jpLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        main_panel.add(left_jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 430, -1));

        right_jp.setBackground(new java.awt.Color(28, 40, 51));

        signUp_jl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        signUp_jl.setForeground(new java.awt.Color(253, 254, 254));
        signUp_jl.setText("Sign Up");

        jL_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jL_name.setForeground(new java.awt.Color(202, 207, 210));
        jL_name.setText("Name");

        jT_name.setBackground(new java.awt.Color(28, 40, 51));
        jT_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_name.setForeground(new java.awt.Color(234, 236, 238));
        jT_name.setBorder(null);
        jT_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nameActionPerformed(evt);
            }
        });

        jL_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jL_id.setForeground(new java.awt.Color(202, 207, 210));
        jL_id.setText("Teacher ID");

        jT_id.setBackground(new java.awt.Color(28, 40, 51));
        jT_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_id.setForeground(new java.awt.Color(234, 236, 238));
        jT_id.setBorder(null);
        jT_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_idActionPerformed(evt);
            }
        });

        jL_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jL_email.setForeground(new java.awt.Color(202, 207, 210));
        jL_email.setText("Email");

        jT_email.setBackground(new java.awt.Color(28, 40, 51));
        jT_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_email.setForeground(new java.awt.Color(234, 236, 238));
        jT_email.setBorder(null);
        jT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_emailActionPerformed(evt);
            }
        });

        jL_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jL_pass.setForeground(new java.awt.Color(202, 207, 210));
        jL_pass.setText("Password");

        jT_pass.setBackground(new java.awt.Color(28, 40, 51));
        jT_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_pass.setForeground(new java.awt.Color(234, 236, 238));
        jT_pass.setBorder(null);

        jB_submit.setBackground(new java.awt.Color(128, 139, 150));
        jB_submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB_submit.setForeground(new java.awt.Color(255, 255, 255));
        jB_submit.setText("Submit");
        jB_submit.setBorder(null);
        jB_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_submit.setFocusPainted(false);
        jB_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout right_jpLayout = new javax.swing.GroupLayout(right_jp);
        right_jp.setLayout(right_jpLayout);
        right_jpLayout.setHorizontalGroup(
            right_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_jpLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(right_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right_jpLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(signUp_jl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(right_jpLayout.createSequentialGroup()
                        .addComponent(jT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 56, Short.MAX_VALUE))
                    .addGroup(right_jpLayout.createSequentialGroup()
                        .addGroup(right_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jT_email, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jT_name)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4)
                            .addComponent(jL_id, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_email, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_pass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jB_submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        right_jpLayout.setVerticalGroup(
            right_jpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_jpLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(signUp_jl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jL_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jT_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jL_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jL_email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jT_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jL_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jT_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        main_panel.add(right_jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 470, 506));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_emailActionPerformed

    private void jT_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_idActionPerformed

    private void jT_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nameActionPerformed

    @SuppressWarnings("deprecation")
    private void jB_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_submitActionPerformed
        Teacher t = new Teacher();
        t.setName(jT_name.getText());
        t.setTeacher_id(jT_id.getText());
        t.setEmail(jT_email.getText());
        t.setPassword(jT_pass.getText());
        t.save();
        clear();
    }//GEN-LAST:event_jB_submitActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Registation().setVisible(true);
            }
        });

    }

    public void clear() {
        jT_name.setText("");
        jT_id.setText("");
        jT_email.setText("");
        jT_pass.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_submit;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_id;
    private javax.swing.JLabel jL_name;
    private javax.swing.JLabel jL_pass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jT_email;
    private javax.swing.JTextField jT_id;
    private javax.swing.JTextField jT_name;
    private javax.swing.JPasswordField jT_pass;
    private javax.swing.JPanel left_jp;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel right_jp;
    private javax.swing.JLabel signUp_jl;
    // End of variables declaration//GEN-END:variables
}
