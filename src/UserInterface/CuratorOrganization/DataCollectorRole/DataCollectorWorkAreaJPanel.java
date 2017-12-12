/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CuratorOrganization.DataCollectorRole;

import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Organization.DataCollectorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanch
 */
public class DataCollectorWorkAreaJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private DataCollectorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    /**
     * Creates new form DataCollectorWorkAreaJPanel
     */
    public DataCollectorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =(DataCollectorOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        manageRecordJButton = new javax.swing.JButton();
        manageDetailsJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        valueLabel.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(153, 0, 51));
        valueLabel.setText("<value>");

        manageRecordJButton.setText("Manage Individual Records");
        manageRecordJButton.setBorder(null);
        manageRecordJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRecordJButtonActionPerformed(evt);
            }
        });

        manageDetailsJButton.setText("Enter Individual Details");
        manageDetailsJButton.setToolTipText("Click  to Enter Details");
        manageDetailsJButton.setBorder(null);
        manageDetailsJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        manageDetailsJButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        manageDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDetailsJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("My Work Area -Data Collector Role");

        enterpriseLabel.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 0, 51));
        enterpriseLabel.setText("EnterPrise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageDetailsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageRecordJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(manageDetailsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageRecordJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageRecordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRecordJButtonActionPerformed

        ManageRecordsJPanel manageRecordsJPanel = new ManageRecordsJPanel(userProcessContainer,userAccount,organization, enterprise,business);
        userProcessContainer.add("manageRecordsJPanel", manageRecordsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageRecordJButtonActionPerformed

    private void manageDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDetailsJButtonActionPerformed
        // TODO add your handling code here:
        ManageIndividualDetailsJPanel manageIndividualDetailsJPanel = new ManageIndividualDetailsJPanel(userProcessContainer,userAccount,organization, enterprise,business);
        userProcessContainer.add("manageIndividualDetailsJPanel", manageIndividualDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDetailsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageDetailsJButton;
    private javax.swing.JButton manageRecordJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
