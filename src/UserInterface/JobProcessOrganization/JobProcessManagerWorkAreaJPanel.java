/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.JobProcessOrganization;

import UserInterface.CuratorOrganization.JobManagerRole.*;
import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Organization.DataCollectorOrganization;
import Business.Organization.JobProcessOrganization;
import Business.Organization.JobRequestManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CuratorOrganization.DataCollectorRole.ManageIndividualDetailsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanch
 */
public class JobProcessManagerWorkAreaJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private JobProcessOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    
    /**
     * Creates new form JobRequestManagerWorkAreaJPanel
     */
    public JobProcessManagerWorkAreaJPanel() {
        initComponents();
    }

    public JobProcessManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
         initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =(JobProcessOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = ecoSystem;
        valueLabel1.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        btnManageRequest1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewStatistics = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(153, 0, 51));
        enterpriseLabel1.setText("Organization :");

        valueLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        valueLabel1.setForeground(new java.awt.Color(153, 0, 51));
        valueLabel1.setText("<value>");

        btnManageRequest1.setText("Manage Individual Job Request");
        btnManageRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequest1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Job Process Manager Work Area");

        btnViewStatistics.setText("View Job Statistics");
        btnViewStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStatisticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(enterpriseLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnManageRequest1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1)
                    .addComponent(valueLabel1))
                .addGap(80, 80, 80)
                .addComponent(btnManageRequest1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewStatistics)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequest1ActionPerformed
        // TODO add your handling code here:
        ProcessJobRequestJPanel panel = new ProcessJobRequestJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("ProcessJobRequestJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnManageRequest1ActionPerformed

    private void btnViewStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStatisticsActionPerformed
        // TODO add your handling code here:
        JobStatisticsJPanel panel = new JobStatisticsJPanel(userProcessContainer, userAccount, organization, enterprise, business);
        userProcessContainer.add("JobStatisticsJPanel", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewStatisticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageRequest1;
    private javax.swing.JButton btnViewStatistics;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
