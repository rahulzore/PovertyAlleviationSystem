/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.JobProviderOrganization;

import Business.Constant;
import UserInterface.JobProcessOrganization.*;
import UserInterface.CuratorOrganization.JobManagerRole.*;
import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Organization.DataCollectorOrganization;
import Business.Organization.JobProcessOrganization;
import Business.Organization.JobProviderOrganization;
import Business.Organization.JobRequestManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanch
 */
public class ProvideJobRequestJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    /**
     * Creates new form ManageJobRequestJPanel
     */
    public ProvideJobRequestJPanel() {
        initComponents();
    }

    ProvideJobRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        loggedinLabel.setText(userAccount.getEmployee().getName());
        orgLbl.setText(organization.getName());
        roleLbl.setText(userAccount.getRole().toString());
        populateRequestTable();
    }

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        
        model.setRowCount(0);
         //WorkRequest request =organization.getWorkQueue().getWorkRequestList()
                 for(WorkRequest request :organization.getWorkQueue().getWorkRequestList()){
                     Object[] row = new Object[6];
                     row[0] =request;
                     row[1] = ((JobWorkRequest)request).getQuestionaire().getPersonalQuestionnaire().getName();
                     row[2] = ((JobWorkRequest)request).getQuestionaire().getPersonalQuestionnaire().getRequestType();
                      row[3]=request.getSender();
                    row[4]=request.getReceiver()==null?"Waiting to be assigned":request.getReceiver();
                    row[5]=request.getStatus();
                    model.addRow(row);
                 }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        btnAssignJob = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        loggedinLabel = new javax.swing.JLabel();
        roleLbl = new javax.swing.JLabel();
        orgLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        backJBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Individual Name", "Request Type", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);
        if (requestTable.getColumnModel().getColumnCount() > 0) {
            requestTable.getColumnModel().getColumn(0).setResizable(false);
            requestTable.getColumnModel().getColumn(1).setResizable(false);
            requestTable.getColumnModel().getColumn(2).setResizable(false);
            requestTable.getColumnModel().getColumn(3).setResizable(false);
            requestTable.getColumnModel().getColumn(4).setResizable(false);
            requestTable.getColumnModel().getColumn(5).setResizable(false);
        }

        btnAssignJob.setBackground(new java.awt.Color(51, 255, 51));
        btnAssignJob.setText("Assign Job");
        btnAssignJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignJobActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Log In as :");

        loggedinLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loggedinLabel.setText("jLabel2");

        roleLbl.setText("jLabel2");

        orgLbl.setText("jLabel3");

        jLabel11.setText("Enterprise");

        jLabel12.setText("Role :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Job Provider Work Area");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(roleLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(orgLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(loggedinLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(loggedinLabel)))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(orgLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(roleLbl))
                .addContainerGap())
        );

        backJBtn1.setBackground(new java.awt.Color(0, 102, 255));
        backJBtn1.setText("<< Back");
        backJBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(btnAssignJob))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJBtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJBtn1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssignJob)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignJobActionPerformed
        int selectedRow = requestTable.getSelectedRow();
        JobWorkRequest request= null;
        if(selectedRow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (selectedRow >= 0) {
            request = (JobWorkRequest) requestTable.getValueAt(selectedRow, 0);
            if((request.getStatus().equalsIgnoreCase("Rejected") || request.getStatus().equalsIgnoreCase(Constant.TR_REQUESTSTATUS_PROCESSED)) || request.getTestResult().equalsIgnoreCase("Sorry we can not process the request"))
            {
                JOptionPane.showMessageDialog(null, "Please select different request to process", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            ConfirmJobRequestJPanel ConfirmJobRequestJPanel = new ConfirmJobRequestJPanel(userProcessContainer,userAccount,organization, enterprise,request);
            userProcessContainer.add("ConfirmJobRequestJPanel", ConfirmJobRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAssignJobActionPerformed

    private void backJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtn1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBtn1;
    private javax.swing.JButton btnAssignJob;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggedinLabel;
    private javax.swing.JLabel orgLbl;
    private javax.swing.JTable requestTable;
    private javax.swing.JLabel roleLbl;
    // End of variables declaration//GEN-END:variables
}
