package calculator;

/**
 *
 * @author Md Rifat
 */
public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();     
        setLocation(400, 100);
        setTitle("Calculator");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSeven6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jt = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbSeven = new javax.swing.JButton();
        jbMulti = new javax.swing.JButton();
        jbSub = new javax.swing.JButton();
        jbEight = new javax.swing.JButton();
        jbNine = new javax.swing.JButton();
        jbFive = new javax.swing.JButton();
        jbFour = new javax.swing.JButton();
        jbOne = new javax.swing.JButton();
        jbSix = new javax.swing.JButton();
        jbZero = new javax.swing.JButton();
        jbTwo = new javax.swing.JButton();
        jbEquel = new javax.swing.JButton();
        jbDiv = new javax.swing.JButton();
        jbThree = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();

        jbSeven6.setText("7");
        jbSeven6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeven6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jt.setBorder(null);
        jt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jt.setFocusable(false);

        jbAdd.setText("+");
        jbAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbSeven.setText("7");
        jbSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSevenActionPerformed(evt);
            }
        });

        jbMulti.setText("X");
        jbMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiActionPerformed(evt);
            }
        });

        jbSub.setText("-");
        jbSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubActionPerformed(evt);
            }
        });

        jbEight.setText("8");
        jbEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEightActionPerformed(evt);
            }
        });

        jbNine.setText("9");
        jbNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNineActionPerformed(evt);
            }
        });

        jbFive.setText("5");
        jbFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiveActionPerformed(evt);
            }
        });

        jbFour.setText("4");
        jbFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFourActionPerformed(evt);
            }
        });

        jbOne.setText("1");
        jbOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOneActionPerformed(evt);
            }
        });

        jbSix.setText("6");
        jbSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSixActionPerformed(evt);
            }
        });

        jbZero.setText("0");
        jbZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZeroActionPerformed(evt);
            }
        });

        jbTwo.setText("2");
        jbTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTwoActionPerformed(evt);
            }
        });

        jbEquel.setText("=");
        jbEquel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEquelActionPerformed(evt);
            }
        });

        jbDiv.setText("/");
        jbDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDivActionPerformed(evt);
            }
        });

        jbThree.setText("3");
        jbThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbThreeActionPerformed(evt);
            }
        });

        jbReset.setText("Reset");
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbEight, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbOne, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbFour, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbFive, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbNine, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbZero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbReset, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jbEquel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jbDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbMulti, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jbSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNine, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFive, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSix, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbOne, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbThree, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbZero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEquel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
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

    private void jbSeven6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeven6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSeven6ActionPerformed

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        String text = jt.getText();
        jt.setText(text + "+");
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubActionPerformed
        String text = jt.getText();
        jt.setText(text + "-");
    }//GEN-LAST:event_jbSubActionPerformed

    private void jbMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiActionPerformed
        String text = jt.getText();
        jt.setText(text + "x");
    }//GEN-LAST:event_jbMultiActionPerformed

    private void jbSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSevenActionPerformed
        String text = jt.getText();
        jt.setText(text + "7");
    }//GEN-LAST:event_jbSevenActionPerformed

    private void jbEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEightActionPerformed
        String text = jt.getText();
        jt.setText(text + "8");
    }//GEN-LAST:event_jbEightActionPerformed

    private void jbNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNineActionPerformed
        String text = jt.getText();
        jt.setText(text + "9");
    }//GEN-LAST:event_jbNineActionPerformed

    private void jbFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFourActionPerformed
        String text = jt.getText();
        jt.setText(text + "4");
    }//GEN-LAST:event_jbFourActionPerformed

    private void jbFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiveActionPerformed
        String text = jt.getText();
        jt.setText(text + "5");
    }//GEN-LAST:event_jbFiveActionPerformed

    private void jbSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSixActionPerformed
        String text = jt.getText();
        jt.setText(text + "6");
    }//GEN-LAST:event_jbSixActionPerformed

    private void jbOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOneActionPerformed
        String text = jt.getText();
        jt.setText(text + "1");
    }//GEN-LAST:event_jbOneActionPerformed

    private void jbTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTwoActionPerformed
        String text = jt.getText();
        jt.setText(text + "2");
    }//GEN-LAST:event_jbTwoActionPerformed

    private void jbThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbThreeActionPerformed
        String text = jt.getText();
        jt.setText(text + "3");
    }//GEN-LAST:event_jbThreeActionPerformed

    private void jbZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZeroActionPerformed
        String text = jt.getText();
        jt.setText(text + "0");
    }//GEN-LAST:event_jbZeroActionPerformed

    private void jbEquelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEquelActionPerformed
        String text = jt.getText();
        String arr[] = text.split("[-, + , / , x]");

        double result = 0;

        if (-1 != text.indexOf("+")) {
            result = Double.parseDouble(arr[0]) + Double.parseDouble(arr[1]);
        } else if (-1 != text.indexOf("-")) {
            result = Double.parseDouble(arr[0]) - Double.parseDouble(arr[1]);
        } else if (-1 != text.indexOf("x")) {
            result = Double.parseDouble(arr[0]) * Double.parseDouble(arr[1]);
        } else if (-1 != text.indexOf("/")) {           
            result = Double.parseDouble(arr[0]) / Double.parseDouble(arr[1]);
        }

        jt.setText(Double.toString(result));
    }//GEN-LAST:event_jbEquelActionPerformed

    private void jbDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDivActionPerformed
        String text = jt.getText();
        jt.setText(text + "/");
    }//GEN-LAST:event_jbDivActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        jt.setText("");
    }//GEN-LAST:event_jbResetActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbDiv;
    private javax.swing.JButton jbEight;
    private javax.swing.JButton jbEquel;
    private javax.swing.JButton jbFive;
    private javax.swing.JButton jbFour;
    private javax.swing.JButton jbMulti;
    private javax.swing.JButton jbNine;
    private javax.swing.JButton jbOne;
    private javax.swing.JButton jbReset;
    private javax.swing.JButton jbSeven;
    private javax.swing.JButton jbSeven6;
    private javax.swing.JButton jbSix;
    private javax.swing.JButton jbSub;
    private javax.swing.JButton jbThree;
    private javax.swing.JButton jbTwo;
    private javax.swing.JButton jbZero;
    private javax.swing.JTextField jt;
    // End of variables declaration//GEN-END:variables
}
