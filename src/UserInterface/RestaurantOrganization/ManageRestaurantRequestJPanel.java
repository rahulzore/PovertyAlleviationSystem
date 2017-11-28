/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RestaurantOrganization;

import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Network.Network;
import Business.Organization.NGO.ChildrenNGOOrganization;
import Business.Organization.NGO.HomelessNGOOrganization;
import Business.Organization.NGO.OldAgeNGOOrganization;
import Business.Organization.NGO.RaceNGOOrganization;
import Business.Organization.Organization;
import Business.Organization.RestaurantOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rahul Zore
 */
public class ManageRestaurantRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantRequestJPanel
     */
    private JPanel userProcessContainer;
    private RestaurantOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;

    public ManageRestaurantRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, RestaurantOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (RestaurantOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        foodNameTxtField = new javax.swing.JTextField();
        quantityTxtField = new javax.swing.JTextField();
        vegRadioBtn = new javax.swing.JRadioButton();
        nonVegRadioBtn = new javax.swing.JRadioButton();
        sendJBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enter Leftover Food Details");

        jLabel2.setText("Food Name :");

        jLabel3.setText("Food Type :");

        jLabel4.setText("Food Quantity :");

        buttonGroup1.add(vegRadioBtn);
        vegRadioBtn.setText("Veg");

        buttonGroup1.add(nonVegRadioBtn);
        nonVegRadioBtn.setText("Non - Veg");

        sendJBtn.setText("Send Alert");
        sendJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJBtnActionPerformed(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodNameTxtField)
                            .addComponent(quantityTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vegRadioBtn)
                                .addGap(18, 18, 18)
                                .addComponent(nonVegRadioBtn))
                            .addComponent(sendJBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(301, 301, 301))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(foodNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vegRadioBtn)
                    .addComponent(nonVegRadioBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sendJBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sendJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJBtnActionPerformed
        // TODO add your handling code here:

        if ((foodNameTxtField.getText().trim().isEmpty())
                || (quantityTxtField.getText().trim().isEmpty())
                ||((!vegRadioBtn.isSelected())&&(!nonVegRadioBtn.isSelected()))) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory!!");
            return;
        }
        String foodName = foodNameTxtField.getText();
        String foodType = null;
        if (vegRadioBtn.isSelected()) {
            foodType = "Veg";
        } else if (nonVegRadioBtn.isSelected()) {
            foodType = "NonVeg";
        }
        int foodQty;
        try {
            foodQty = Integer.parseInt(quantityTxtField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Food Quantity should be a number!!");
            return;
        }
        FoodRequest request = new FoodRequest();
        request.setSender(userAccount);
        request.setFoodName(foodName);
        request.setFoodQty(foodQty);
        request.setFoodType(foodType);
        
        Organization org = null;
        int count=0;
        for (Network nt : business.getNetworkList()) {
            if (nt.getName().equalsIgnoreCase(enterprise.getNetworkName())) {
                for (Enterprise ent : nt.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization : ent.getOrganizationList().getOrganizationList()) {
                        if ((organization instanceof ChildrenNGOOrganization)
                                || (organization instanceof HomelessNGOOrganization)
                                || (organization instanceof OldAgeNGOOrganization)
                                || (organization instanceof RaceNGOOrganization)) {
                            org = organization;
                            //break;
                            count++;
                            organization.getWorkQueue().getWorkRequestList().add(request);

                        }
                    }
                }
            }
        }

        if (org != null) {
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            
        }
        if(count>0){
            JOptionPane.showMessageDialog(null, "Alert sent successfully!!");
        }
    }//GEN-LAST:event_sendJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField foodNameTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton nonVegRadioBtn;
    private javax.swing.JTextField quantityTxtField;
    private javax.swing.JButton sendJBtn;
    private javax.swing.JRadioButton vegRadioBtn;
    // End of variables declaration//GEN-END:variables
}