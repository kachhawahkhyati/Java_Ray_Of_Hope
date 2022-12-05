/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonRegistrationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.MedicOrganization;
import Business.Organizations.Organization;
import Business.Organizations.PersonRegistrationOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalAssistanceWorkRequest;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shwetabulchandani
 */
public class NewPersonRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewPersonRegistrationJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    PersonDirectory persondirectory;
    PersonRegistrationOrganization organization;
    Network network;
    Random rand;
    public NewPersonRegistrationJPanel(JPanel userProcessContainer, PersonDirectory persondirectory, UserAccount account, Enterprise enterprise, EcoSystem business, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.persondirectory = persondirectory;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        this.organization = (PersonRegistrationOrganization) organization;
        jXDatePicker1.getMonthView().setUpperBound(new Date());
        rand = new Random();
        for (Network net : business.getNetworkCatalog()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        femaleRDB = new javax.swing.JRadioButton();
        maleRDB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        photoText = new javax.swing.JTextField();
        btnRegisterChild = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMark = new javax.swing.JTextField();
        cmbAge = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, 35));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, 40));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 52, 58));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Registration");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 320, 30));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 190, 30));

        femaleRDB.setText("Female");
        add(femaleRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 35));

        maleRDB.setText("Male");
        add(maleRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 35));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 130, 35));

        photoText.setMaximumSize(new java.awt.Dimension(6, 20));
        add(photoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 190, 30));

        btnRegisterChild.setBackground(new java.awt.Color(255, 255, 255));
        btnRegisterChild.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnRegisterChild.setText("Register");
        btnRegisterChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterChildActionPerformed(evt);
            }
        });
        add(btnRegisterChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 130, -1));

        uploadButton.setBackground(new java.awt.Color(255, 255, 255));
        uploadButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });
        add(uploadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 110, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Photo ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 130, 35));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Registration Date");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, 35));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Identification Mark");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 130, 35));
        add(txtMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 190, 30));

        cmbAge.setBackground(new java.awt.Color(255, 255, 255));
        cmbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78" }));
        add(cmbAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 190, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Does person have special needs?");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 230, 30));

        yesBtn.setText("Yes");
        add(yesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        noBtn.setText("No");
        add(noBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 720, 350));
        add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterChildActionPerformed
    try {
            if (!validation()) {
                String personName = txtName.getText();
                String ageString = cmbAge.getSelectedItem().toString();
                int personAge = Integer.parseInt(ageString);
                String gender = "";
                if (maleRDB.isSelected()) {
                    gender = "Male";
                } else if (femaleRDB.isSelected()) {
                    gender = "Female";
                }
                Date date = jXDatePicker1.getDate();
                DateFormat formatit = new SimpleDateFormat("yyyy-MM-dd");
                String temp = "";
                Date regDate = new Date();
                try {
                    temp = formatit.format(date);
                    regDate = formatit.parse(temp);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Please select the registration date");
                }
                String identificationMark = txtMark.getText();
                Person person = new Person();
                int personId = rand.nextInt(100);
                person = persondirectory.addPerson();
                person.setPersonAge(personAge);
                person.setPersonId(personId);
                person.setName(personName);
                person.setIdentificationMark(identificationMark);
                person.setImageDetails(photoText.getText());
                person.setRegistrationDate(regDate);
                person.setGender(gender);
                person.setStatus("Newly Registered");
                if (yesBtn.isSelected()) {
                    person.setIsSpecialPerson(true);
                } else if (noBtn.isSelected()) {
                    person.setIsSpecialPerson(false);
                }
                person.setMedicalStatus((person.getMedicalStatus() == null ? "" : person.getMedicalStatus()) + "Sent to Doctor");
                MedicalAssistanceWorkRequest docwrkreq = new MedicalAssistanceWorkRequest();
                docwrkreq.setStatus("Sent to Doctor");
                docwrkreq.setMessage("Please medically examine the newly registered person");
                docwrkreq.setSender(account);
                docwrkreq.setPersonId(person.getPersonId());
                docwrkreq.setPersonName(person.getName());
                List<MedicOrganization> list = new ArrayList<>();
                for (Network network : business.getNetworkCatalog()) {
                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (this.network.equals(network)) {
                            for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                                if (organization instanceof MedicOrganization) {
                                    list.add((MedicOrganization) organization);
                                }
                            }
                        }
                    }
                }
                for (MedicOrganization org : list) {
                    org.getWorkQueue().getWorkRequestList().add(docwrkreq);
                }
                if (list != null && list.size() > 0) {
                    account.getWorkQueue().getWorkRequestList().add(docwrkreq);
                    business.getWorkQueue().getWorkRequestList().add(docwrkreq);
                }
                txtName.setText("");
                buttonGroup1.clearSelection();
                cmbAge.getModel().setSelectedItem(0);
                jXDatePicker1.getEditor().setText("");
                txtMark.setText("");
                photoText.setText("");
                buttonGroup2.clearSelection();
                JOptionPane.showMessageDialog(null, "Person registered successfully");
            }
        } catch (ParseException ex) {
            Logger.getLogger(NewPersonRegistrationJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterChildActionPerformed
               
    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
       
         browseImageFile();
    }//GEN-LAST:event_uploadButtonActionPerformed

    private String browseImageFile() {
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File file = chooseFile.getSelectedFile();
        String pathofFile = file.getPath();
        photoText.setText(pathofFile);
        return pathofFile;
    }
    
    public boolean validation() throws ParseException {
        DateFormat formait = new SimpleDateFormat("yyyy/MM/dd");

        String selectedFormaString = "";
        try {
            Date selected = jXDatePicker1.getDate();
            selectedFormaString = formait.format(selected);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select the registration date");
            return true;
        }
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the name of the person");
            return true;
        } //else if (!ValidationHelper.validateName(txtName.getText())) {
           // JOptionPane.showMessageDialog(null, "Please enter the name in the correct format(No special characters)");
           // return true;
        //} 
        else if (cmbAge.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide the age of the person");
            return true;
        } else if (!maleRDB.isSelected() && !femaleRDB.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select the gender of the person");
            return true;
        } else if (selectedFormaString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select the registration date");
            return true;
        } else if (txtMark.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the identification mark. If there are none, please write NA/None");
            return true;
        } //else if (!ValidationHelper.validateIdentity(txtMark.getText())) {
          //  JOptionPane.showMessageDialog(null, "No special character in identification mark");
           // return true;
       // } 
        else if (photoText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select the image of the person");
            return true;
        } else if (!yesBtn.isSelected() && !noBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select whether person has special needs question");
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterChild;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbAge;
    private javax.swing.JRadioButton femaleRDB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JRadioButton maleRDB;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JTextField photoText;
    private javax.swing.JTextField txtMark;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton uploadButton;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
