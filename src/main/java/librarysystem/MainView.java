/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarysystem;

/**
 *
 * @author garit
 */
public class MainView extends javax.swing.JFrame implements LibWindow {
    public final static MainView INSTANCE = new MainView();
    private boolean isInitialized;
    /**
     * Creates new form MainView
     */
    private MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addMemberBtn = new javax.swing.JButton();
        editMemberBtn = new javax.swing.JButton();
        addBCopyBtn = new javax.swing.JButton();
        addBookBtn = new javax.swing.JButton();
        checkoutRecordsBtn = new javax.swing.JButton();
        checkoutBBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        viewContainer = new javax.swing.JPanel();
        newMemberView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        editMemberView = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addCopyView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addBookView = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        checkBookView = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        checkoutRecordsView = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addMemberBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        addMemberBtn.setForeground(new java.awt.Color(75, 68, 68));
        addMemberBtn.setText("Add Library Member");
        addMemberBtn.setBorder(null);
        addMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberBtnActionPerformed(evt);
            }
        });

        editMemberBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        editMemberBtn.setForeground(new java.awt.Color(75, 68, 68));
        editMemberBtn.setText("Edit Library Member");
        editMemberBtn.setBorder(null);
        editMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMemberBtnActionPerformed(evt);
            }
        });

        addBCopyBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        addBCopyBtn.setForeground(new java.awt.Color(75, 68, 68));
        addBCopyBtn.setText("Add Book Copy");
        addBCopyBtn.setBorder(null);
        addBCopyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBCopyBtnActionPerformed(evt);
            }
        });

        addBookBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        addBookBtn.setForeground(new java.awt.Color(75, 68, 68));
        addBookBtn.setText("Add Book");
        addBookBtn.setBorder(null);
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        checkoutRecordsBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        checkoutRecordsBtn.setForeground(new java.awt.Color(75, 68, 68));
        checkoutRecordsBtn.setText("Checkout Records");
        checkoutRecordsBtn.setBorder(null);
        checkoutRecordsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutRecordsBtnActionPerformed(evt);
            }
        });

        checkoutBBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        checkoutBBtn.setForeground(new java.awt.Color(75, 68, 68));
        checkoutBBtn.setText("Checkout Book");
        checkoutBBtn.setBorder(null);
        checkoutBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(75, 68, 68));
        logoutBtn.setText("Log out");
        logoutBtn.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editMemberBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(addBCopyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(addBookBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(checkoutRecordsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMemberBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(checkoutBBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBCopyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkoutBBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkoutRecordsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        viewContainer.setBackground(new java.awt.Color(255, 255, 255));

        newMemberView.setBackground(new java.awt.Color(255, 255, 255));
        newMemberView.setPreferredSize(new java.awt.Dimension(741, 614));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("New Library Member");
        jLabel1.setPreferredSize(new java.awt.Dimension(162, 20));

        javax.swing.GroupLayout newMemberViewLayout = new javax.swing.GroupLayout(newMemberView);
        newMemberView.setLayout(newMemberViewLayout);
        newMemberViewLayout.setHorizontalGroup(
            newMemberViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newMemberViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        newMemberViewLayout.setVerticalGroup(
            newMemberViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newMemberViewLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 574, Short.MAX_VALUE))
        );

        editMemberView.setBackground(new java.awt.Color(255, 255, 255));
        editMemberView.setPreferredSize(new java.awt.Dimension(741, 614));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Library Member Update");

        javax.swing.GroupLayout editMemberViewLayout = new javax.swing.GroupLayout(editMemberView);
        editMemberView.setLayout(editMemberViewLayout);
        editMemberViewLayout.setHorizontalGroup(
            editMemberViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMemberViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        editMemberViewLayout.setVerticalGroup(
            editMemberViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editMemberViewLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(575, Short.MAX_VALUE))
        );

        addCopyView.setBackground(new java.awt.Color(255, 255, 255));
        addCopyView.setPreferredSize(new java.awt.Dimension(741, 614));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Add Book Copy");
        jLabel3.setPreferredSize(new java.awt.Dimension(162, 20));

        javax.swing.GroupLayout addCopyViewLayout = new javax.swing.GroupLayout(addCopyView);
        addCopyView.setLayout(addCopyViewLayout);
        addCopyViewLayout.setHorizontalGroup(
            addCopyViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCopyViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        addCopyViewLayout.setVerticalGroup(
            addCopyViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCopyViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(575, Short.MAX_VALUE))
        );

        addBookView.setBackground(new java.awt.Color(255, 255, 255));
        addBookView.setPreferredSize(new java.awt.Dimension(741, 614));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Add New Book");
        jLabel4.setPreferredSize(new java.awt.Dimension(162, 20));

        javax.swing.GroupLayout addBookViewLayout = new javax.swing.GroupLayout(addBookView);
        addBookView.setLayout(addBookViewLayout);
        addBookViewLayout.setHorizontalGroup(
            addBookViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
        );
        addBookViewLayout.setVerticalGroup(
            addBookViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookViewLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 575, Short.MAX_VALUE))
        );

        checkBookView.setBackground(new java.awt.Color(255, 255, 255));
        checkBookView.setPreferredSize(new java.awt.Dimension(741, 614));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Checkout Book Form");
        jLabel5.setPreferredSize(new java.awt.Dimension(162, 20));

        javax.swing.GroupLayout checkBookViewLayout = new javax.swing.GroupLayout(checkBookView);
        checkBookView.setLayout(checkBookViewLayout);
        checkBookViewLayout.setHorizontalGroup(
            checkBookViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkBookViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
        );
        checkBookViewLayout.setVerticalGroup(
            checkBookViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkBookViewLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 573, Short.MAX_VALUE))
        );

        checkoutRecordsView.setBackground(new java.awt.Color(255, 255, 255));
        checkoutRecordsView.setPreferredSize(new java.awt.Dimension(741, 614));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Checkout Records");
        jLabel6.setPreferredSize(new java.awt.Dimension(162, 20));

        javax.swing.GroupLayout checkoutRecordsViewLayout = new javax.swing.GroupLayout(checkoutRecordsView);
        checkoutRecordsView.setLayout(checkoutRecordsViewLayout);
        checkoutRecordsViewLayout.setHorizontalGroup(
            checkoutRecordsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkoutRecordsViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(538, 538, 538))
        );
        checkoutRecordsViewLayout.setVerticalGroup(
            checkoutRecordsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkoutRecordsViewLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 576, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout viewContainerLayout = new javax.swing.GroupLayout(viewContainer);
        viewContainer.setLayout(viewContainerLayout);
        viewContainerLayout.setHorizontalGroup(
            viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newMemberView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(editMemberView, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(addCopyView, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(addBookView, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(checkBookView, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addGap(24, 24, 24)))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(checkoutRecordsView, javax.swing.GroupLayout.PREFERRED_SIZE, 681, Short.MAX_VALUE)
                    .addGap(30, 30, 30)))
        );
        viewContainerLayout.setVerticalGroup(
            viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newMemberView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(editMemberView, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(addCopyView, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(addBookView, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(checkBookView, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                    .addGap(24, 24, 24)))
            .addGroup(viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewContainerLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(checkoutRecordsView, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addGap(30, 30, 30)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(viewContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void addMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberBtnActionPerformed
        // TODO add your handling code here:
        newMemberView.setVisible(true);
        editMemberView.setVisible(false);
        addCopyView.setVisible(false);
        addBookView.setVisible(false);
        checkBookView.setVisible(false);
        checkoutRecordsView.setVisible(false);
        
    }//GEN-LAST:event_addMemberBtnActionPerformed

    private void editMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMemberBtnActionPerformed
        // TODO add your handling code here:
        newMemberView.setVisible(false);
        editMemberView.setVisible(true);
        addCopyView.setVisible(false);
        addBookView.setVisible(false);
        checkBookView.setVisible(false);
        checkoutRecordsView.setVisible(false);
        
    }//GEN-LAST:event_editMemberBtnActionPerformed

    private void addBCopyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBCopyBtnActionPerformed
        // TODO add your handling code here:
        newMemberView.setVisible(false);
        editMemberView.setVisible(false);
        addCopyView.setVisible(true);
        addBookView.setVisible(false);
        checkBookView.setVisible(false);
        checkoutRecordsView.setVisible(false);
    }//GEN-LAST:event_addBCopyBtnActionPerformed

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        // TODO add your handling code here:
        newMemberView.setVisible(false);
        editMemberView.setVisible(false);
        addCopyView.setVisible(false);
        addBookView.setVisible(true);
        checkBookView.setVisible(false);
        checkoutRecordsView.setVisible(false);
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void checkoutBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBBtnActionPerformed
        // TODO add your handling code here:
        newMemberView.setVisible(false);
        editMemberView.setVisible(false);
        addCopyView.setVisible(false);
        addBookView.setVisible(false);
        checkBookView.setVisible(true);
        checkoutRecordsView.setVisible(false);
    }//GEN-LAST:event_checkoutBBtnActionPerformed

    private void checkoutRecordsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutRecordsBtnActionPerformed
        // TODO add your handling code here:
        newMemberView.setVisible(false);
        editMemberView.setVisible(false);
        addCopyView.setVisible(false);
        addBookView.setVisible(false);
        checkBookView.setVisible(false);
        checkoutRecordsView.setVisible(true);
    }//GEN-LAST:event_checkoutRecordsBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBCopyBtn;
    private javax.swing.JButton addBookBtn;
    private javax.swing.JPanel addBookView;
    private javax.swing.JPanel addCopyView;
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JPanel checkBookView;
    private javax.swing.JButton checkoutBBtn;
    private javax.swing.JButton checkoutRecordsBtn;
    private javax.swing.JPanel checkoutRecordsView;
    private javax.swing.JButton editMemberBtn;
    private javax.swing.JPanel editMemberView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel newMemberView;
    private javax.swing.JPanel viewContainer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void init() {
        this.initComponents();
        this.isInitialized = true;
    }

    @Override
    public boolean isInitialized() {
        return isInitialized;
    }

    @Override
    public void isInitialized(boolean val) {
        this.isInitialized = val;
    }
}
