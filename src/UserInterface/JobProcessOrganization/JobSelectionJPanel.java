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
import Business.Organization.JobProvider.CarpentryJobOrganization;
import Business.Organization.JobProvider.ConstructionJobOrganization;
import Business.Organization.JobProvider.GeneralJobOrganization;
import Business.Organization.JobProvider.ITJobOrganization;
import Business.Organization.JobProvider.SecurityJobOrganization;
import Business.Organization.JobProviderOrganization;
import Business.Organization.Organization;
import Business.Questionnaire.Questionnaire;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JobWorkRequest;
import java.awt.CardLayout;
//import Business.WorkQueue.TrainingRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

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
//          EvaluateSpecific();
    }
//    private void EvaluateSpecific(){
//        Questionnaire qus = request.getQuestionaire();
//        if(qus.getJobQuestionaire().isIsComputer() && request.getQuestionaire().getEducationQuestionaire().isIsRead()
//            && request.getQuestionaire().getEducationQuestionaire().isIsWrite() && !request.getQuestionaire().getCriminalRelatedQuestionaire().isIsConvCrime()
//             && !request.getQuestionaire().getDrugAbuseQuestionaire().isIsConsumeDrug() && !request.getQuestionaire().getDrugAbuseQuestionaire().isIsComDrug()      )
//        {
//            txtBestSuited.setText("IT related Jobs");
//        }
//        else if(qus.getJobQuestionaire().isIsComputer() && request.getQuestionaire().getEducationQuestionaire().isIsRead()
//            && request.getQuestionaire().getEducationQuestionaire().isIsWrite() && !request.getQuestionaire().getCriminalRelatedQuestionaire().isIsConvCrime()
//             && !request.getQuestionaire().getDrugAbuseQuestionaire().isIsConsumeDrug() && request.getQuestionaire().getDrugAbuseQuestionaire().isIsComDrug() )
//        {
//            txtBestSuited.setText("Carpentry related Jobs");
//        }
//        else if(!qus.getJobQuestionaire().isIsComputer() && request.getQuestionaire().getEducationQuestionaire().isIsRead()
//            && request.getQuestionaire().getEducationQuestionaire().isIsWrite() && !request.getQuestionaire().getCriminalRelatedQuestionaire().isIsConvCrime()
//             && request.getQuestionaire().getDrugAbuseQuestionaire().isIsConsumeDrug() && request.getQuestionaire().getDrugAbuseQuestionaire().isIsComDrug() )
//        {
//            txtBestSuited.setText("Carpentry related Jobs");
//        }
//        else if(!qus.getJobQuestionaire().isIsComputer() && !request.getQuestionaire().getEducationQuestionaire().isIsRead()
//            && !request.getQuestionaire().getEducationQuestionaire().isIsWrite() && !request.getQuestionaire().getCriminalRelatedQuestionaire().isIsConvCrime()
//             && request.getQuestionaire().getDrugAbuseQuestionaire().isIsConsumeDrug() && request.getQuestionaire().getDrugAbuseQuestionaire().isIsComDrug() )
//        {
//            txtBestSuited.setText("Construction related Jobs");
//        }
//        else if(!qus.getJobQuestionaire().isIsComputer() && !request.getQuestionaire().getEducationQuestionaire().isIsRead()
//            && !request.getQuestionaire().getEducationQuestionaire().isIsWrite() && !request.getQuestionaire().getCriminalRelatedQuestionaire().isIsConvCrime()
//             && request.getQuestionaire().getDrugAbuseQuestionaire().isIsConsumeDrug() && request.getQuestionaire().getDrugAbuseQuestionaire().isIsComDrug() )
//        {
//            txtBestSuited.setText("General Jobs");
//        }
//    }
    private void populateDetails(){
        nametxt.setText(request.getQuestionaire().getPersonalQuestionnaire().getName());
        lblResultComputers.setText(request.getQuestionaire().getJobQuestionaire().isIsComputer() ? "Yes": "No");
        lblResultRead.setText(request.getQuestionaire().getEducationQuestionaire().isIsRead()? "Yes": "No");
        lblResultWrite.setText(request.getQuestionaire().getEducationQuestionaire().isIsWrite()? "Yes": "No");
        lblResultCrime.setText(request.getQuestionaire().getCriminalRelatedQuestionaire().isIsConvCrime()? "Yes": "No");
        lblResultDrugs.setText(request.getQuestionaire().getDrugAbuseQuestionaire().isIsConsumeDrug()? "Yes": "No");
        lblResultConDrugs.setText(request.getQuestionaire().getDrugAbuseQuestionaire().isIsComDrug()? "Yes": "No");
        lblResultPhysical.setText(request.getQuestionaire().getPhysicalQuestionaire().isIsPhysicallyActive()?"Yes":"No");
        lblResultGuard.setText(request.getQuestionaire().getGuardQuestionaire().isPreviousGuardExperience()?"Yes":"No");
    }
    private void populateTrainingCombo(){
//        availabeInstCombo.removeAllItems();
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
//                        availabeInstCombo.addItem(org);
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
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblResultPhysical = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblResultGuard = new javax.swing.JLabel();
        backJBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        searchJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jobsTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(153, 0, 51));

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Assign Job Organization");

        assignTrainerBtn.setBackground(new java.awt.Color(51, 255, 51));
        assignTrainerBtn.setText("Assign Job");
        assignTrainerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTrainerBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Individual Name:");

        nametxt.setEnabled(false);

        enterpriseLabel.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 0, 51));
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(153, 0, 51));
        valueLabel.setText("<value>");

        tabbedComputers.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Computers", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Education", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Criminal", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Drugs", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Physically Active:");

        lblResultPhysical.setText("jLabel12");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(lblResultPhysical)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblResultPhysical))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Physical", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Previous Guarding Experience:");

        lblResultGuard.setText("jLabel14");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(lblResultGuard)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblResultGuard))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tabbedComputers.addTab("Guarding Experience", jPanel6);

        backJBtn1.setBackground(new java.awt.Color(255, 0, 0));
        backJBtn1.setText("<< Back");
        backJBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtn1ActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        searchJButton.setText("Initiate Search");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        jobsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jobsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assignTrainerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabbedComputers, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(tabbedComputers, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addGap(18, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignTrainerBtn)
                    .addComponent(backJBtn1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignTrainerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTrainerBtnActionPerformed
        // TODO add your handling code here:
//        Organization org = ( Organization) availabeInstCombo.getSelectedItem();
//        if(org != null){
//            org.getWorkQueue().getWorkRequestList().add(request);
//        }
//        if(org instanceof CarpentryTrainingOrganization){
//            
//        }
        //request.setMessage(message);
        
        int selectedRow = jobsTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select and organization to send the request to!!");
            return;
        }
        Organization org = (Organization) jobsTable.getValueAt(selectedRow, 0);
        org.getWorkQueue().getWorkRequestList().add(request);
        UserAccount res = org.getUserAccountList().getUserAccountList().get(0);
        request.setReceiver(res);
        request.setStatus("assigned");
        UserAccount sd= request.getSender();
        JOptionPane.showMessageDialog(null, "Job Organization assigned successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_assignTrainerBtnActionPerformed

    private void backJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtn1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtn1ActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed

        // TODO add your handling code here:
        new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {

                Enterprise tm = null;
                for (Network network : business.getNetworkList()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (ent instanceof JobProviderEnterprise) {
                            tm = ent;
                            break;
                        }
                    }
                }
                DefaultTableModel dtm = (DefaultTableModel) jobsTable.getModel();

                Questionnaire qus = request.getQuestionaire();
                textArea.append("Knows how to use Computer?\n");

                Thread.sleep(2000);

                if (qus.getJobQuestionaire().isIsComputer()) {
                    for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                        if (org instanceof ITJobOrganization) {
                            Object row[] = new Object[1];
                            row[0] = org;
                            dtm.addRow(row);
                        }
                    }

                    textArea.append("Yes\n");

                } else {
                    textArea.append("No\n");

                }
                Thread.sleep(2000);
                textArea.append("Knows how to read and write?\n");
                Thread.sleep(2000);
                if (qus.getEducationQuestionaire().isIsRead() && qus.getEducationQuestionaire().isIsWrite()) {
                    for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                        if (org instanceof GeneralJobOrganization) {
                            Object row[] = new Object[1];
                            row[0] = org;
                            dtm.addRow(row);
                        }
                    }

                    textArea.append("Yes\n");

                } else {
                    textArea.append("No\n");

                }

                Thread.sleep(2000);
                textArea.append("Is Physically strong and active?\n");
                Thread.sleep(2000);
                if (qus.getEducationQuestionaire().isIsRead() && qus.getEducationQuestionaire().isIsWrite()) {
                    for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                        if (org instanceof ConstructionJobOrganization || org instanceof CarpentryJobOrganization) {
                            Object row[] = new Object[1];
                            row[0] = org;
                            dtm.addRow(row);
                        }
                    }

                    textArea.append("Yes\n");

                } else {
                    textArea.append("No\n");

                }

                Thread.sleep(2000);
                textArea.append("Previous experience as a Guard?\n");
                Thread.sleep(2000);
                if (qus.getEducationQuestionaire().isIsRead() && qus.getEducationQuestionaire().isIsWrite()) {
                    for (Organization org : tm.getOrganizationList().getOrganizationList()) {
                        if (org instanceof SecurityJobOrganization) {
                            Object row[] = new Object[1];
                            row[0] = org;
                            dtm.addRow(row);
                        }
                    }

                    textArea.append("Yes\n");

                } else {
                    textArea.append("No\n");

                }
                Thread.sleep(2000);
                textArea.append("Job Search Completed!!");
                JOptionPane.showMessageDialog(null, "Job search has been completed. Please select the best job for the individual!!");
                return null;
            }
        }.execute();

    }//GEN-LAST:event_searchJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTrainerBtn;
    private javax.swing.JButton backJBtn1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jobsTable;
    private javax.swing.JLabel lblResultComputers;
    private javax.swing.JLabel lblResultConDrugs;
    private javax.swing.JLabel lblResultCrime;
    private javax.swing.JLabel lblResultDrugs;
    private javax.swing.JLabel lblResultGuard;
    private javax.swing.JLabel lblResultPhysical;
    private javax.swing.JLabel lblResultRead;
    private javax.swing.JLabel lblResultWrite;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton searchJButton;
    private javax.swing.JTabbedPane tabbedComputers;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}