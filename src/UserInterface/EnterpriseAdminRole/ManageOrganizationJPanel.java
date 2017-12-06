/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EnterpriseAdminRole;

import Business.Employee.Employee;
import Business.Enterpise.CuratorEnterprise;
import Business.Enterpise.Enterprise;
import Business.Enterpise.Enterprise.EnterpriseType;
import Business.Enterpise.JobProviderEnterprise;

import Business.Enterpise.NGOEnterprise;
import Business.Enterpise.TrainingProviderEnterprise;

import Business.Organization.Organization;
import Business.Organization.Organization.JobProviderType;
import Business.Organization.Organization.Type;

import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kinnari
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise, OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;

        populateCombo();
        populateTable();
    }

    private void populateCombo() {

        organizationJComboBox.removeAllItems();

        if ((enterprise.getEnterpriseType().getValue().equals(EnterpriseType.Curator.getValue()))) {
//                organizationJComboBox.addItem(Organization.Type.DataCollector);
            CuratorEnterprise.CuratorType type[] = CuratorEnterprise.CuratorType.values();
            for (CuratorEnterprise.CuratorType cType : type) {
                organizationJComboBox.addItem(cType);
            }
        }
        else if(enterprise.getEnterpriseType().getValue().equals(EnterpriseType.NGO.getValue())){
            NGOEnterprise.NGOType type[]= NGOEnterprise.NGOType.values();
            for(NGOEnterprise.NGOType nType : type){
                organizationJComboBox.addItem(nType);
            }
        }
        else if(enterprise.getEnterpriseType().getValue().equals(EnterpriseType.TrainingProvider.getValue())){
           TrainingProviderEnterprise.TrainingProviderType type[]= TrainingProviderEnterprise.TrainingProviderType.values();
            for(TrainingProviderEnterprise.TrainingProviderType nType : type){
                organizationJComboBox.addItem(nType);
            }
        }
        else if(enterprise.getEnterpriseType().getValue().equals(EnterpriseType.JobProvider.getValue())){
            JobProviderEnterprise.JobProviderType type[]= JobProviderEnterprise.JobProviderType.values();
            for(JobProviderEnterprise.JobProviderType nType : type){
                organizationJComboBox.addItem(nType);
            }
        }
        else if (enterprise.getEnterpriseType().getValue().equals(EnterpriseType.Restaurant.getValue())){
            organizationJComboBox.addItem(Organization.Type.Restaurant);
        }
		else if (enterprise.getEnterpriseType().getValue().equals(EnterpriseType.TrainingProcessManager.getValue())){
            organizationJComboBox.addItem(Organization.Type.TrainingProcessManager);
        }
        else if (enterprise.getEnterpriseType().getValue().equals(EnterpriseType.TrainingProvider.getValue())){
            organizationJComboBox.addItem(Organization.Type.TrainingProvider);
        }

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : directory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOrganization = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization Type ");

        jLabel2.setText("Organization Name: ");

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Orgnanizations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(organizationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(addJButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel3)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addJButton)
                .addGap(24, 24, 24)
                .addComponent(backjButton1)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        //Type obj = (Type) organizationJComboBox.getSelectedItem();
        String type = organizationJComboBox.getSelectedItem().toString();
        String sname = txtOrganization.getText().trim();
        if (sname.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please enter name of organization", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
        if(enterprise instanceof JobProviderEnterprise)
        {
            for (JobProviderType jt : Organization.JobProviderType.values()){
                if(jt.toString().equals(type)){
                directory.createOrganization(null,jt, sname);
            }
            }
        }
        else
        {
        for(Type t : Organization.Type.values()){
            if(t.toString().equals(type)){
                directory.createOrganization(t,null, sname);
            }
        }
        }
//        Object obj = (Object) organizationJComboBox.getSelectedItem();
//        if(obj instanceof Organization.Type)
//        {
//            Organization.CDCType cd =(CDCType) organizationJComboBox.getSelectedItem();
//            directory.createOrganization(cd,null,null,null);
//        }
        //directory.createOrganization(obj, sname);

        populateTable();

    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtOrganization;
    // End of variables declaration//GEN-END:variables
}
