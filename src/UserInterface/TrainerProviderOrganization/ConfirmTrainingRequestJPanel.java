/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TrainerProviderOrganization;

import Business.Constant;
import Business.Enterpise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TrainingProvider.SecurityTrainingOrganization;
import Business.Organization.TrainingProviderOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.TrainingRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nishad
 */
public class ConfirmTrainingRequestJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private TrainingRequest request;
    /**
     * Creates new form ConfirmTrainingRequestJPanel
     */
    public ConfirmTrainingRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise,TrainingRequest request) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.request = request;
        populateIndividualDetails();
    }
 private void populateIndividualDetails(){
        nametxt.setText(request.getQuestionaire().getPersonalQuestionnaire().getName());
       edutxt.setText(request.getQuestionaire().getPersonalQuestionnaire().getEducation());
       avatxt.setText(request.getQuestionaire().getTrainingQuestionaire().getTrainingDuration());
       distxt.setText(request.getQuestionaire().getTrainingQuestionaire().getDisability());
       txtRequestType.setText(request.getQuestionaire().getTrainingQuestionaire().getTrainingField());
       txtSender.setText(request.getSender().getUserID());
        //seatstxt.setText(String.valueOf(selecteddropdownOrg.getSeats()));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRequestType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        confirmationField = new javax.swing.JComboBox<>();
        backJBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        edutxt = new javax.swing.JTextField();
        avatxt = new javax.swing.JTextField();
        distxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Request Type:");

        txtRequestType.setEnabled(false);

        jLabel2.setText("Sender:");

        txtSender.setEnabled(false);

        jLabel3.setText("Confirm:");

        confirmationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        backJBtn.setBackground(new java.awt.Color(255, 0, 0));
        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Process Training Requst");

        btnConfirm.setBackground(new java.awt.Color(51, 255, 51));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel5.setText("Individual Name:");

        jLabel6.setText("Availability:");

        jLabel7.setText("Disability:");

        jLabel8.setText("Education:");

        nametxt.setEnabled(false);

        edutxt.setEnabled(false);

        avatxt.setEnabled(false);

        distxt.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nametxt)
                                        .addComponent(edutxt)
                                        .addComponent(avatxt)
                                        .addComponent(distxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnConfirm)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2)))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtRequestType)
                                                .addComponent(txtSender)
                                                .addComponent(confirmationField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(backJBtn)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(distxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRequestType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJBtn)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProvideTrainingRequestJPanel sysAdminwjp = (ProvideTrainingRequestJPanel) component;
        sysAdminwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        txtRequestType.setText(((TrainingRequest)request).getQuestionaire().getPersonalQuestionnaire().getRequestType());
        txtSender.setText(((TrainingRequest)request).getSender().getUserID());
    }//GEN-LAST:event_backJBtnActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
     
        String str = (String)confirmationField.getSelectedItem();
        if(str.equalsIgnoreCase("Yes"))
        {
            request.setStatus(Constant.TR_REQUESTSTATUS_PROCESSED);
            request.setTrainingResult("Accepted to Institute");
            //((TrainingProviderOrganization) organization).
        }
        else
        {
            request.setStatus(Constant.TR_REQUESTSTATUS_REJECTED);
            request.setTrainingResult("Sorry we can not process the request");
        }
        JOptionPane.showMessageDialog(null, "Confirmed", "Warning", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avatxt;
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> confirmationField;
    private javax.swing.JTextField distxt;
    private javax.swing.JTextField edutxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField txtRequestType;
    private javax.swing.JTextField txtSender;
    // End of variables declaration//GEN-END:variables
}
