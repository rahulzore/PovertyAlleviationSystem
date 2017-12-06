/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.TrainingProcessOrganization;

import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Enterpise.TrainingProviderEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.TrainingProcessOrganization;
import Business.Organization.TrainingProvider.CarpentryTrainingOrganization;
import Business.Organization.TrainingProvider.ConstructionTrainingOrganization;
//import Business.Organization.TrainingProvider.CossssnstructionTrainingOrganization;
import Business.Organization.TrainingProvider.GeneralTrainingOrganization;
import Business.Organization.TrainingProvider.SecurityTrainingOrganization;
import Business.Organization.TrainingProviderOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TrainingRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanch
 */
public class TrainingSelectionJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private TrainingProcessOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    TrainingRequest request;
    private TrainingProviderOrganization selecteddropdownOrg;
    /** Creates new form TrainingSelectionJPanel */
    public TrainingSelectionJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, TrainingRequest request) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =(TrainingProcessOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        this.request = request;
          valueLabel.setText(enterprise.getName());
          populateDetails();
          populateTrainingCombo();
    }
    private void populateTrainingCombo(){
        availabeInstCombo.removeAllItems();
        Enterprise tm =null;
        for (Network network : business.getNetworkList()) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if(ent instanceof TrainingProviderEnterprise){
                        tm = ent;
                        break;
                    }
                }
        }
        if(request.getQuestionaire().getTrainingQuestionaire().getInterest() != null ){
            if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("Carpentry"))
            {
                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                 if(org instanceof CarpentryTrainingOrganization )
                        availabeInstCombo.addItem(org);
                    }
            }
            else if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("Security"))
            {
                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                 if(org instanceof SecurityTrainingOrganization )
                        availabeInstCombo.addItem(org);
                    }
            }
            else if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("Construction"))
            {
                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                 if(org instanceof ConstructionTrainingOrganization )
                        availabeInstCombo.addItem(org);
                    }
            }
            else if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("General"))
            {
                for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                 if(org instanceof GeneralTrainingOrganization )
                        availabeInstCombo.addItem(org);
                    }
            }
        }
        else
        {
            
                    for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                        availabeInstCombo.addItem(org);
                    }
                
        }
        
//        if(request.getQuestionaire().getTrainingQuestionaire().getInterest().equalsIgnoreCase("Carpentry"))
//        {
//            for(Organization org : enterprise.getOrganizationList().getOrganizationList()){
//                if(org.getType().getValue().equalsIgnoreCase("Carpentry")){
//                    availabeInstCombo.addItem(org);
//                }
//            }
//        }
//        else if (tinteresttxt.getText().equalsIgnoreCase("Security"))
//        {
//            for(Organization org : enterprise.getOrganizationList().getOrganizationList()){
//                if(org.getType().getValue().equalsIgnoreCase("Security")){
//                    availabeInstCombo.addItem(org);
//                }
//            }
//    }
//        else if (tinteresttxt.getText().equalsIgnoreCase("Construction"))
//        {
//            for(Organization org : enterprise.getOrganizationList().getOrganizationList()){
//                if(org.getType().getValue().equalsIgnoreCase("Construction")){
//                    availabeInstCombo.addItem(org);
//                }
//            }
//    }
//        else if (tinteresttxt.getText().equalsIgnoreCase("General"))
//        {
//            for(Organization org : enterprise.getOrganizationList().getOrganizationList()){
//                if(org.getType().getValue().equalsIgnoreCase("General")){
//                    availabeInstCombo.addItem(org);
//                }
//            }
//    }
    }
    private void populateDetails(){
        nametxt.setText(request.getQuestionaire().getPersonalQuestionnaire().getName());
       treceivedtxt.setText(request.getQuestionaire().getTrainingQuestionaire().getTrainingField());
       tinteresttxt.setText(request.getQuestionaire().getTrainingQuestionaire().getInterest());
        //seatstxt.setText(String.valueOf(selecteddropdownOrg.getSeats()));
        
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        treceivedtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tinteresttxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        availabeInstCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        tTypetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        seatstxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tDurationtxt = new javax.swing.JTextField();
        assignTrainerBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Training Received:");

        treceivedtxt.setEnabled(false);

        jLabel2.setText("Training Interest:");

        tinteresttxt.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Assign Training Insitute ");

        jLabel4.setText("Available training institues:");

        availabeInstCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        availabeInstCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabeInstComboActionPerformed(evt);
            }
        });

        jLabel5.setText("Training Provided:");

        tTypetxt.setEnabled(false);

        jLabel6.setText("Seats Available:");

        seatstxt.setEnabled(false);

        jLabel7.setText("Training Duration:");

        tDurationtxt.setEnabled(false);

        assignTrainerBtn.setBackground(new java.awt.Color(102, 255, 102));
        assignTrainerBtn.setText("Assign Training");
        assignTrainerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTrainerBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Individual Name:");

        nametxt.setEnabled(false);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 0, 51));
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(153, 0, 51));
        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nametxt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(treceivedtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(135, 135, 135))
                                .addComponent(availabeInstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(assignTrainerBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(seatstxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(tDurationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tTypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tinteresttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(treceivedtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availabeInstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tTypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tDurationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(seatstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tinteresttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(assignTrainerBtn)
                .addContainerGap(55, Short.MAX_VALUE))
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
    JOptionPane.showMessageDialog(null, "Distributor assigned successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_assignTrainerBtnActionPerformed

    private void availabeInstComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabeInstComboActionPerformed
        // TODO add your handling code here:
//        selecteddropdownOrg = (TrainingProviderOrganization) availabeInstCombo.getSelectedItem();
//        if(selecteddropdownOrg != null)
//        {
//            seatstxt.setText(String.valueOf( selecteddropdownOrg.getSeats()));
//        }
    }//GEN-LAST:event_availabeInstComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTrainerBtn;
    private javax.swing.JComboBox availabeInstCombo;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField seatstxt;
    private javax.swing.JTextField tDurationtxt;
    private javax.swing.JTextField tTypetxt;
    private javax.swing.JTextField tinteresttxt;
    private javax.swing.JTextField treceivedtxt;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
