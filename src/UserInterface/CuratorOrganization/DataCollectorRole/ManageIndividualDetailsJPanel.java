/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CuratorOrganization.DataCollectorRole;

import Business.EcoSystem;
import Business.Enterpise.Enterprise;
import Business.Organization.DataCollectorOrganization;
import Business.Organization.JobRequestManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.TrainingRequestManagerOrganization;
import Business.Questionnaire.PersonalQuestionnaire;
import Business.Questionnaire.Questionnaire;
import Business.UserAccount.UserAccount;
import Business.Validator;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.TrainingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanch
 */
public class ManageIndividualDetailsJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private DataCollectorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;
    /**
     * Creates new form ManageIndividualDetailsJPanel
     */
    public ManageIndividualDetailsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization =(DataCollectorOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
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

        requestGroup = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        educationCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        addRecordButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        backJBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eduRadioButton = new javax.swing.JRadioButton();
        jobRadioButton = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        ageCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ssnTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtemailAddress = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Age:");

        educationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primary School", "Secondary School", "Undergraduate", "Graduate" }));

        jLabel4.setText("Gender:");

        addRecordButton.setBackground(new java.awt.Color(102, 255, 102));
        addRecordButton.setText("Add Record");
        addRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Family Income:");

        backJBtn.setBackground(new java.awt.Color(255, 0, 0));
        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Highest Education:");

        jLabel7.setText("Request type:");

        eduRadioButton.setText("Education");

        jobRadioButton.setSelected(true);
        jobRadioButton.setText("Job");

        ageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        ageCombo.setMinimumSize(new java.awt.Dimension(59, 20));
        ageCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Enter Individual Details");

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel2.setText("Name:");

        jLabel8.setText("Enter SSN:");

        jButton1.setText("Upload Valid ID Proof");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ImageLabel.setBackground(new java.awt.Color(153, 255, 204));
        ImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Email Address:");

        jLabel10.setText("Phone number:");

        jLabel11.setText("Address:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addRecordButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(eduRadioButton)
                                                .addGap(10, 10, 10)
                                                .addComponent(jobRadioButton))
                                            .addComponent(educationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtemailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(backJBtn)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(educationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(eduRadioButton)
                            .addComponent(jobRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(ssnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtemailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(addRecordButton)
                .addGap(50, 50, 50)
                .addComponent(backJBtn)
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordButtonActionPerformed
        // TODO add your handling code here:
           if(Validator.StringEmpty(txtName.getText()) 
         || Validator.StringEmpty(txtAddress.getText())
         || Validator.StringEmpty(txtContact.getText())
         || Validator.StringEmpty(txtIncome.getText())
         || Validator.StringEmpty(txtemailAddress.getText())
         || Validator.StringEmpty(ageCombo.getSelectedItem().toString())
         || Validator.StringEmpty(genderCombo.getSelectedItem().toString())
         ||ImageLabel.getIcon()==null
          ||((!eduRadioButton.isSelected())&&(!jobRadioButton.isSelected())))
           {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
           }
           else
           {
        String name = txtName.getText();
        int age = Integer.parseInt( ageCombo.getSelectedItem().toString());
        String gender = genderCombo.getSelectedItem().toString();
        int income = Integer.parseInt(txtIncome.getText());
        if(income>24000)
        {
             JOptionPane.showMessageDialog(null, "Ineligible Individual");
             return;
        }
        String requestType=jobRadioButton.isSelected() ? "job":"edu";
         String ssn = ssnTxt.getText();
          if(Validator.isSSNValid(ssnTxt.getText())==false)
          {
              JOptionPane.showMessageDialog(null, "Invalid SSN format.");
              return;
          }
         String address = txtAddress.getText();
        
         String contact = txtContact.getText();
          if(Validator.isPhoneNumberValid(txtContact.getText())==false)
                  {
                      JOptionPane.showMessageDialog(null, "Invalid phone number format.");
                    return;
                  }
         String emailAddress = txtemailAddress.getText();
        if(Validator.isEmailValid(txtemailAddress.getText())==false)
                {
                    JOptionPane.showMessageDialog(null, "Invalid email address format.");
                    return;
                }
        Questionnaire qt = business.getQuestionnaireList().addQuestionnaire();
        PersonalQuestionnaire questionnaire = qt.getPersonalQuestionnaire();
        questionnaire.setName(name);
        questionnaire.setAge(age);
        questionnaire.setEducation(requestType);
        questionnaire.setGender(gender);
        questionnaire.setIncome(income);
        questionnaire.setRequestType(requestType);
        questionnaire.setSsn(ssn);
        questionnaire.setAddress(address);
        questionnaire.setContact(contact);
        questionnaire.setEmailAddress(emailAddress);
        questionnaire.setIdProof((ImageIcon) ImageLabel.getIcon());
        qt.setPersonalQuestionnaire(questionnaire);
        Organization org = null;

        for (Organization og : enterprise.getOrganizationList().getOrganizationList()){
            if(requestType.equalsIgnoreCase("job")){
                if (og instanceof JobRequestManagerOrganization){
                    org = og;
                    break;
                }
            }
            else{
                if (og instanceof TrainingRequestManagerOrganization){
                    org = og;
                    break;
                }
            }
        }
        if (org!=null){
            if(requestType.equalsIgnoreCase("job")){
                JobWorkRequest request = new JobWorkRequest();
                request.setSender(userAccount);
                request.setStatus("Sent");
                request.setQuestionaire(qt);
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            else if(requestType.equalsIgnoreCase("edu")){
                TrainingRequest request = new TrainingRequest();
                request.setSender(userAccount);
                request.setStatus("Sent");
                request.setQuestionaire(qt);
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }

        }
        JOptionPane.showMessageDialog(null, "Individual request created successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
         ImageLabel.setIcon(null);
         txtemailAddress.setText("");
         txtIncome.setText("");
         txtContact.setText("");
         txtAddress.setText("");
         txtName.setText("");
         ssnTxt.setText("");
                                        
    }//GEN-LAST:event_addRecordButtonActionPerformed
    }
    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed

    private void ageComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
 JFileChooser choose= new JFileChooser();
        choose.showOpenDialog(null);
        File file=choose.getSelectedFile();
        String picture=file.getAbsolutePath();
        
          ImageIcon icon=new ImageIcon(picture);
           ImageLabel.setIcon(new ImageIcon(new ImageIcon(picture).getImage().getScaledInstance(99, 99, Image.SCALE_DEFAULT)));
        
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JButton addRecordButton;
    private javax.swing.JComboBox<String> ageCombo;
    private javax.swing.JButton backJBtn;
    private javax.swing.JRadioButton eduRadioButton;
    private javax.swing.JComboBox<String> educationCombo;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jobRadioButton;
    private javax.swing.ButtonGroup requestGroup;
    private javax.swing.JTextField ssnTxt;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtemailAddress;
    // End of variables declaration//GEN-END:variables
}
