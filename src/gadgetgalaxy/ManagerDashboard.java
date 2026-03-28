/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gadgetgalaxy;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagerDashboard extends javax.swing.JFrame {

    private UserService userService = new UserService();
    private String currentSelectedUser = "";

    public ManagerDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Gadget Galaxy - Inventory System");
        loadTable();
        

    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);

        ArrayList<User> users = userService.getAllUsers();

        for (User u : users) {
            
            model.addRow(new Object[]{u.getUsername(), u.getPassword(), u.getType()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JTextField();
        txtNewUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDelete1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsers.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 800, 221));

        btnAdd.setBackground(new java.awt.Color(242, 242, 242));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(242, 242, 242));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginbutt.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 160, 40));

        btnUpdate.setBackground(new java.awt.Color(242, 242, 242));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(242, 242, 242));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginbutt.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 180, 40));

        btnDelete.setBackground(new java.awt.Color(242, 242, 242));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(242, 242, 242));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginbutt.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 180, 40));

        cmbType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "SalesRep" }));
        jPanel1.add(cmbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 207, 41));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("User Type :");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, 35));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("New User Name: ");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 35));

        txtNewPass.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 207, -1));

        txtNewUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 207, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("New Password:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 35));

        btnDelete1.setBackground(new java.awt.Color(242, 242, 242));
        btnDelete1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(242, 242, 242));
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginbutt.png"))); // NOI18N
        btnDelete1.setText("LogOut");
        btnDelete1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 200, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gadgetgalaxy/admin.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String name = txtNewUser.getText();
        String pass = txtNewPass.getText();
        String type = cmbType.getSelectedItem().toString();

        if (name.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all fields!");
            return;
        }

      
        User newUser = new User(name, pass, type);

        if (userService.addUser(newUser)) {
            JOptionPane.showMessageDialog(this, "User Added!");
            loadTable();
            txtNewUser.setText("");
            txtNewPass.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "User already exists!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String newName = txtNewUser.getText();
        String newPass = txtNewPass.getText();
        String uType = cmbType.getSelectedItem().toString();

       
        if (currentSelectedUser.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a user first!");
            return;
        }

        User updatedUser = new User(newName, newPass, uType);

       
        if (userService.updateUser(currentSelectedUser, updatedUser)) {
            JOptionPane.showMessageDialog(this, "User Updated Successfully!");
            loadTable();

         
            txtNewUser.setText("");
            txtNewPass.setText("");
            currentSelectedUser = ""; 
        } else {
            JOptionPane.showMessageDialog(this, "Error Updating!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String name = txtNewUser.getText();
        if (name.isEmpty()) {
            return;
        }

        int opt = JOptionPane.showConfirmDialog(this, "Delete " + name + "?");
        if (opt == JOptionPane.YES_OPTION) {
            userService.deleteUser(name);
            loadTable();
            txtNewUser.setText("");
            txtNewPass.setText("");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewUserActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        int row = tblUsers.getSelectedRow();

      
        txtNewUser.setText(model.getValueAt(row, 0).toString());
        txtNewPass.setText(model.getValueAt(row, 1).toString());
        cmbType.setSelectedItem(model.getValueAt(row, 2).toString());

     
        currentSelectedUser = model.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tblUsersMouseClicked

    private void clearFields() {
        txtNewUser.setText("");
        txtNewPass.setText("");
        txtNewUser.setEditable(true); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtNewPass;
    private javax.swing.JTextField txtNewUser;
    // End of variables declaration//GEN-END:variables
}
