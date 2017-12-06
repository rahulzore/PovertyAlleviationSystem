/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CuratorOrganization.DataCollectorRole;

import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Network.Network;
import Business.Organization.DataCollectorOrganization;
import Business.Organization.JobRequestManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.TrainingRequestManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanch
 */
public class ManageRecordsJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private DataCollectorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    /**
     * Creates new form ManageRecordsJPanel
     */
    public ManageRecordsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =(DataCollectorOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateRequestTable();
    }
private void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        ArrayList<WorkRequest> worklist = new ArrayList<>();
        model.setRowCount(0);
        for(Network net : business.getNetworkList()){
                if(net.getName().equalsIgnoreCase(enterprise.getNetworkName()))
                {
                    for(Enterprise enter: net.getEnterpriseDirectory().getEnterpriseList()){
                        for (Organization org : enter.getOrganizationList().getOrganizationList()){
                            if(org instanceof JobRequestManagerOrganization || org instanceof TrainingRequestManagerOrganization){
                                for(WorkRequest wk : org.getWorkQueue().getWorkRequestList()){
                                    worklist.add(wk);
                                }
                            }
                        }
                    }
                }
                
        }
                        
         //WorkRequest request =organization.getWorkQueue().getWorkRequestList()
                 for(WorkRequest request :worklist){
                     Object[] row = new Object[2];
                     row[0] =request;
                     row[1] = request.getQuestionaire().getPersonalQuestionnaire().getRequestType();
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
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        viewRecordButton = new javax.swing.JButton();
        backJBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Individual Name", "Request Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 0, 51));
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setForeground(new java.awt.Color(153, 0, 51));
        valueLabel.setText("<value>");

        viewRecordButton.setBackground(new java.awt.Color(102, 255, 102));
        viewRecordButton.setText("View Record");
        viewRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordButtonActionPerformed(evt);
            }
        });

        backJBtn.setBackground(new java.awt.Color(255, 51, 51));
        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addComponent(viewRecordButton)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(288, 288, 288)))
                    .addContainerGap(74, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(viewRecordButton)
                .addGap(64, 64, 64)
                .addComponent(backJBtn)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordButtonActionPerformed
       
    }//GEN-LAST:event_viewRecordButtonActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewRecordButton;
    // End of variables declaration//GEN-END:variables
}
