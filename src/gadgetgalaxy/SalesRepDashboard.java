/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gadgetgalaxy;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SalesRepDashboard extends javax.swing.JFrame {

    private ProductService productService = new ProductService();
    private String currentSelectedModel = "";

    public SalesRepDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Gadget Galaxy - Inventory System");
        loadTable("All");
    }

    private void loadTable(String category) {
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);

        ArrayList<Product> list = productService.searchProducts(category);

        for (Product p : list) {
            model.addRow(new Object[]{
                p.getBrand(),
                p.getModel(),
                p.getCategory(),
                p.getSpecifications(),
                p.getPrice()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBrand = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSpec = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        cmbSearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBrand.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 140, 32));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("Brand");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Model");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 32));

        txtModel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, 32));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 32));

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 140, 32));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("Specification");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 317, 200, 32));

        txtSpec.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecActionPerformed(evt);
            }
        });
        jPanel1.add(txtSpec, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 140, 32));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(242, 242, 242));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gadgetgalaxy/loginbutt.png"))); // NOI18N
        btnAdd.setText("Add Gadget");
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 240, 45));

        tblProducts.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Category", "Price", "Specifications"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 84, 572, 376));

        cmbSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Smartphone", "Laptop", "Tablet", "Audio Device", "Accessory", " " }));
        jPanel1.add(cmbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 154, 45));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(242, 242, 242));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gadgetgalaxy/loginbutt.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 140, 45));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 204));
        jLabel6.setText("Category");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 214, 150, 40));

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Smartphone", "Laptop", "Tablet", "Audio Device", "Accessory", " " }));
        jPanel1.add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, 32));

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(242, 242, 242));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gadgetgalaxy/loginbutt.png"))); // NOI18N
        btnUpdate.setText("Update Gadget");
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 447, 240, 45));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(242, 242, 242));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gadgetgalaxy/loginbutt.png"))); // NOI18N
        btnDelete.setText("Delete Gadget");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 504, 240, 45));

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
        jPanel1.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gadgetgalaxy/salesrep.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String cat = cmbSearch.getSelectedItem().toString();
        loadTable(cat);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String brand = txtBrand.getText();
        String modelVal = txtModel.getText();
        String cat = cmbCategory.getSelectedItem().toString();
        String spec = txtSpec.getText();
        String price = txtPrice.getText();

        
        if (brand.isEmpty() || modelVal.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Brand, Model and Price are required!");
            return;
        }

       
        if (spec.isEmpty()) {
            spec = "-";
        }

        Product p = new Product(brand, modelVal, cat, spec, price);

        if (productService.addProduct(p)) {
            JOptionPane.showMessageDialog(this, "Product Added!");
            clearFields();
            loadTable("All");
        } else {
            JOptionPane.showMessageDialog(this, "Model already exists!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        

    
        if (currentSelectedModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a product first!");
            return;
        }

        String brand = txtBrand.getText();
        String modelVal = txtModel.getText();
        String cat = cmbCategory.getSelectedItem().toString();
        String spec = txtSpec.getText();
        String price = txtPrice.getText();

       
        if (brand.isEmpty() || modelVal.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Brand, Model and Price are required!");
            return;
        }

       
        if (spec.isEmpty()) {
            spec = "-";
        }

        Product newP = new Product(brand, modelVal, cat, spec, price);
        productService.updateProduct(currentSelectedModel, newP);

        JOptionPane.showMessageDialog(this, "Updated!");
        clearFields();
        loadTable("All");
    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (currentSelectedModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Select a product first!");
            return;
        }

        int opt = JOptionPane.showConfirmDialog(this, "Delete Model: " + currentSelectedModel + "?");
        if (opt == JOptionPane.YES_OPTION) {
            productService.deleteProduct(currentSelectedModel);
            JOptionPane.showMessageDialog(this, "Deleted!");
            clearFields();
            loadTable("All");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        int row = tblProducts.getSelectedRow();

        txtBrand.setText(model.getValueAt(row, 0).toString());
        txtModel.setText(model.getValueAt(row, 1).toString());
        cmbCategory.setSelectedItem(model.getValueAt(row, 2).toString());
        txtSpec.setText(model.getValueAt(row, 3).toString());
        txtPrice.setText(model.getValueAt(row, 4).toString());

        currentSelectedModel = model.getValueAt(row, 1).toString();
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void clearFields() {
    txtBrand.setText("");
    txtModel.setText("");
    txtSpec.setText("");
    txtPrice.setText("");
    currentSelectedModel = "";
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
        java.util.logging.Logger.getLogger(SalesRepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(SalesRepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(SalesRepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(SalesRepDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new SalesRepDashboard().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSpec;
    // End of variables declaration//GEN-END:variables
}
