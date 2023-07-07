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
    public final static MainView INSTANCE =new MainView();
    private boolean isInitialized;
    /**
     * Creates new form MainView
     */
    public MainView() {
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
        checkoutRecordsBtn = new javax.swing.JButton();
        addMemberBtn = new javax.swing.JButton();
        editMemberBtn = new javax.swing.JButton();
        addBCopyBtn = new javax.swing.JButton();
        addBookBtn = new javax.swing.JButton();
        checkoutBBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        viewContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        checkoutRecordsBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        checkoutRecordsBtn.setForeground(new java.awt.Color(75, 68, 68));
        checkoutRecordsBtn.setText("Checkout Records");
        checkoutRecordsBtn.setBorder(null);

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

        addBCopyBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        addBCopyBtn.setForeground(new java.awt.Color(75, 68, 68));
        addBCopyBtn.setText("Add Book Copy");
        addBCopyBtn.setBorder(null);

        addBookBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        addBookBtn.setForeground(new java.awt.Color(75, 68, 68));
        addBookBtn.setText("Add Book");
        addBookBtn.setBorder(null);

        checkoutBBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        checkoutBBtn.setForeground(new java.awt.Color(75, 68, 68));
        checkoutBBtn.setText("Checkout Book");
        checkoutBBtn.setBorder(null);

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(75, 68, 68));
        logoutBtn.setText("Log out");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(evt -> {

            LibrarySystem.hideAllWindows();
            Util.centerFrameOnDesktop(LoginView.INSTANCE);
            LoginView.INSTANCE.setVisible(true);
//
//            LibrarySystem.showAllWindows();
//            INSTANCE.setVisible(false);
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        viewContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout viewContainerLayout = new javax.swing.GroupLayout(viewContainer);
        viewContainer.setLayout(viewContainerLayout);
        viewContainerLayout.setHorizontalGroup(
            viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        viewContainerLayout.setVerticalGroup(
            viewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(viewContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        // viewContainer.removeAll();
        NewLibraryMember nlm = new NewLibraryMember();
        viewContainer.add(nlm);
        nlm.setVisible(true);
    }//GEN-LAST:event_addMemberBtnActionPerformed

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
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JButton checkoutBBtn;
    private javax.swing.JButton checkoutRecordsBtn;
    private javax.swing.JButton editMemberBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBtn;
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
