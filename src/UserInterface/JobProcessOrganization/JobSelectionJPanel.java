/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.JobProcessOrganization;


import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Enterpise.JobProviderEnterprise;
import Business.Enterpise.TrainingProviderEnterprise;
import Business.Network.Network;
import Business.Organization.JobProcessOrganization;
import Business.Organization.JobProviderOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JobWorkRequest;
import java.awt.CardLayout;
//import Business.WorkQueue.TrainingRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanch
 */
public class JobSelectionJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private JobProcessOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    JobWorkRequest request;
    private JobProviderOrganization selecteddropdownOrg;
    /** Creates new form TrainingSelectionJPanel */
    public JobSelectionJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, JobWorkRequest request) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =(JobProcessOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        this.request = request;
          valueLabel.setText(enterprise.getName());
          populateDetails();
          populateTrainingCombo();
    }
    private void populateDetails(){
        nametxt.setText(request.getQuestionaire().getPersonalQuestionnaire().getName());
        lblResultComputers.setText(request.getQuestionaire().getJobQuestionaire().isIsComputer() ? "Yes": "No");
        lblResultRead.setText(request.getQuestionaire().getEducationQuestionaire().isIsRead()? "Yes": "No");
        lblResultWrite.setText(request.getQuestionaire().getEducationQuestionaire().isIsWrite()? "Yes": "No");
        lblResultCrime.setText(request.getQuestionaire().getCriminalRelatedQuestionaire().isIsConvCrime()? "Yes": "No");
        lblResultDrugs.setText(request.getQuestionaire().getDrugAbuseQuestionaire().isIsConsumeDrug()? "Yes": "No");
        lblResultConDrugs.setText(request.getQuestionaire().getDrugAbuseQuestionaire().isIsComDrug()? "Yes": "No");
    }
    private void populateTrainingCombo(){
        availabeInstCombo.removeAllItems();
        Enterprise tm =null;
        for (Network network : business.getNetworkList()) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if(ent instanceof JobProviderEnterprise){
                        tm = ent;
                        break;
                    }
                }
        }
//        if(request.getQuestionaire().getTrainingQuestionaire().getInterest() != null ){
//            if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("Carpentry"))
//            {
//                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
//                 if(org instanceof CarpentryTrainingOrganization )
//                        availabeInstCombo.addItem(org);
//                    }
//            }
//            else if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("Security"))
//            {
//                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
//                 if(org instanceof SecurityTrainingOrganization )
//                        availabeInstCombo.addItem(org);
//                    }
//            }
//            else if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("Construction"))
//            {
//                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
//                 if(org instanceof ConstructionTrainingOrganization )
//                        availabeInstCombo.addItem(org);
//                    }
//            }
//            else if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("General"))
//            {
//                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
//                 if(org instanceof GeneralTrainingOrganization )
//                        availabeInstCombo.addItem(org);
//                    }
//            }
//        }
//        else
//        {
            
                    for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                        availabeInstCombo.addItem(org);
                    }
                
//        }
 
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        availabeInstCombo = new javax.swing.JComboBox();
        assignTrainerBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        tabbedComputers = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblResultComputers = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblResultRead = new javax.swing.JLabel();
        lblResultWrite = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblResultCrime = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblResultDrugs = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblResultConDrugs = new javax.swing.JLabel();
        backJBtn = new javax.swing.JButton();
        backJBtn1 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Assign Job Organization");

        jLabel4.setText("Available job organization:");

        availabeInstCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        availabeInstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabeInstComboActionPerformed(evt);
            }
        });

        assignTrainerBtn.setText("Assign Job");
        assignTrainerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTrainerBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Individual Name:");

        nametxt.setEnabled(false);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        jLabel2.setText("Computers:");

        lblResultComputers.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultComputers)
                .addContainerGap(513, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblResultComputers))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Computers", jPanel1);

        jLabel5.setText("Read");

        lblResultRead.setText("jLabel6");

        lblResultWrite.setText("jLabel6");

        jLabel6.setText("Write");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultRead))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultWrite)))
                .addContainerGap(535, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblResultRead))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblResultWrite))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Education", jPanel2);

        jLabel7.setText("Convited for Crime:");

        lblResultCrime.setText("jLabel9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultCrime)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblResultCrime))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Criminal", jPanel3);

        jLabel1.setText("Used Drugs:");

        lblResultDrugs.setText("jLabel9");

        jLabel9.setText("Know anyone who uses drugs:");

        lblResultConDrugs.setText("jLabel10");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResultDrugs))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultConDrugs)))
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblResultDrugs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblResultConDrugs))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Drugs", jPanel4);

        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJBtn1)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignTrainerBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(availabeInstCombo, 0, 218, Short.MAX_VALUE)
                                .addComponent(nametxt))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(tabbedComputers, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(324, 324, 324)
                    .addComponent(backJBtn)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(availabeInstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tabbedComputers, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignTrainerBtn)
                    .addComponent(backJBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(253, 253, 253)
                    .addComponent(backJBtn)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignTrainerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTrainerBtnActionPerformed
        // TODO add your handling code here:
        Organization org = ( Organization) availabeInstCombo.getSelectedItem();
        if(org != null){
            org.getWorkQueue().getWorkRequestList().add(request);
        }
//        if(org instanceof CarpentryTrainingOrganization){
//            
//        }
        //request.setMessage(message);
        UserAccount res = org.getUserAccountList().getUserAccountList().get(0);
        request.setReceiver(res);
        request.setStatus("assigned");
        UserAccount sd= request.getSender();
        JOptionPane.showMessageDialog(null, "Job Organization assigned successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_assignTrainerBtnActionPerformed

    private void availabeInstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabeInstComboActionPerformed
        // TODO add your handling code here:
        //selecteddropdownOrg = (JobProviderOrganization) availabeInstCombo.getSelectedItem();
//        if(selecteddropdownOrg != null)
//        {
//            seatstxt.setText(String.valueOf( selecteddropdownOrg.getSeats()));
//        }
    }//GEN-LAST:event_availabeInstComboActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed

    private void backJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtn1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTrainerBtn;
    private javax.swing.JComboBox availabeInstCombo;
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton backJBtn1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblResultComputers;
    private javax.swing.JLabel lblResultConDrugs;
    private javax.swing.JLabel lblResultCrime;
    private javax.swing.JLabel lblResultDrugs;
    private javax.swing.JLabel lblResultRead;
    private javax.swing.JLabel lblResultWrite;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTabbedPane tabbedComputers;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
