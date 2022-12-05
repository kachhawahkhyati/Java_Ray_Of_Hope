/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonRegistrationRole;


import java.util.Date;
import javax.swing.JPanel;
import Business.Person.Person;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author mandardeshmukh
 */
public class ViewPersonDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonDetailsJPanel
     */
    JPanel userProcessContainer;
    Person person;
    
    public ViewPersonDetailsJPanel(JPanel userProcessContainer, Person person) {
        initComponents();
        System.out.println("Executed");
        System.out.println(person.getPersonAge());
        this.userProcessContainer = userProcessContainer;
        
        this.person = person;
        nameTextField.setText(person.getName());
        System.out.println(person.getPersonAge());
        //cmbAge.setSelectedIndex(person.getPersonAge());
        if (person.getGender().equalsIgnoreCase("Male")) {
            maleRDB.setSelected(true);
        } else if (person.getGender().equalsIgnoreCase("female")) {
            femaleRDB.setSelected(true);
        }
        jXDatePicker1.setDate(person.getRegistrationDate());
        jTextArea1.setText(person.getIdentificationMark());
        imageTextField.setText(person.getImageDetails());
        if (person.isIsSpecialPerson()== true) {
            yesBtn.setSelected(true);
        } else {
            noBtn.setSelected(true);
        }
        yesBtn.setEnabled(false);
        noBtn.setEnabled(false);
        displayImage();
        disableInput();
        jXDatePicker1.getMonthView().setUpperBound(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        maleRDB = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        femaleRDB = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        imageLable = new javax.swing.JLabel();
        CancelBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        imageTextField = new javax.swing.JTextField();
        uploadBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbAge = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        lblBack = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 52, 58));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Person Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 520, 40));

        nameTextField.setEnabled(false);
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 210, 30));

        maleRDB.setText("Male");
        maleRDB.setEnabled(false);
        add(maleRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 80, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, 30));

        femaleRDB.setText("Female");
        femaleRDB.setEnabled(false);
        add(femaleRDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 80, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 30));

        updateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, 133, 33));

        saveBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 133, 33));

        imageLable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(imageLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 220, 180));

        CancelBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.setEnabled(false);
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 133, 33));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Identification mark");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 150, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 210, 80));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Registration Date");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 150, 30));

        lblPhoto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoto.setText("Photo");
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 150, 33));

        imageTextField.setEnabled(false);
        imageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageTextFieldActionPerformed(evt);
            }
        });
        add(imageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 210, 30));

        uploadBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        uploadBtn.setText("Update Photo");
        uploadBtn.setEnabled(false);
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });
        add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 120, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 470, 970, 290));

        cmbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78" }));
        add(cmbAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 210, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Does person have special needs?");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 220, 30));

        yesBtn.setText("Yes");
        add(yesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        noBtn.setText("No");
        add(noBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackMousePressed(evt);
            }
        });
        add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 50, 40));
        add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       enableInput(); 
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        try {
            if (!validation()) {
                String childName = nameTextField.getText();
                String ageString = cmbAge.getSelectedItem().toString();
                int childAge = Integer.parseInt(ageString);
                String gender = "";
                if (maleRDB.isSelected()) {
                    gender = "Male";
                } else if (femaleRDB.isSelected()) {
                    gender = "Female";
                }
                Date date = jXDatePicker1.getDate();
                DateFormat formatit = new SimpleDateFormat("yyyy-MM-dd");
                String temp = formatit.format(date);
                Date regDate = new Date();
                try {
                    regDate = formatit.parse(temp);
                } catch (ParseException ex) {
                    Logger.getLogger(ViewPersonDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                String identificationMark = jTextArea1.getText();
                person.setPersonAge(childAge);
                person.setPersonId(person.getPersonId());
                person.setName(childName);
                person.setIdentificationMark(identificationMark);
                person.setImageDetails(imageTextField.getText());
                person.setRegistrationDate(regDate);
                person.setGender(gender);
                JOptionPane.showMessageDialog(null, "Person Details Updated");
            }
        }   catch (ParseException ex) {
            Logger.getLogger(ViewPersonDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
         disableInput();
        
    }//GEN-LAST:event_CancelBtnActionPerformed

    public boolean validation() throws ParseException {
      DateFormat formait = new SimpleDateFormat("yyyy/MM/dd");
    
     String selectedFormaString ="";
      try{
      Date selected = jXDatePicker1.getDate();
    selectedFormaString = formait.format(selected);
     }
     catch(Exception e){
      JOptionPane.showMessageDialog(null, "Please select the registration date");
      return true;
     }
 
     if(nameTextField.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Please enter the name of the person");
         return true;
     }
     else if(!validateName()){
         JOptionPane.showMessageDialog(null, "Please enter the name in the correct format(No special characters)");
         return true;
     }
    
     else if(!maleRDB.isSelected()&& !femaleRDB.isSelected()){
         JOptionPane.showMessageDialog(null, "Please select the gender of the person");
         return true;
     }

     else if(selectedFormaString.isEmpty())
     {
        JOptionPane.showMessageDialog(null, "Please select the registration date");
         return true;  
     }
     else if(jTextArea1.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "Please enter the identification mark. If there are none, please write NA/None");
         return true;
     }
     else if(!validateIdentity()){
         JOptionPane.showMessageDialog(null, "No special character in identification mark");
         return true;
     }
     else if(imageTextField.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Please select the image of the person");
         return true;
     }
      
      else
       return false;
    }
    
      public boolean validateName(){
    boolean b=false;
    Pattern p = Pattern.compile("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$");
    String name = nameTextField.getText();
    Matcher m = p.matcher(name);
    b = m.matches();
    return b;
}  

    private boolean validateIdentity() {
         boolean b=false;
    Pattern p = Pattern.compile("^[A-Za-z0-9. ]*$");
    String name = jTextArea1.getText();
    Matcher m = p.matcher(name);
    b = m.matches();
    return b;
    }
    
    private void enableInput() {
        CancelBtn.setEnabled(true);
        femaleRDB.setEnabled(true);
        imageLable.setEnabled(true);
        cmbAge.setEnabled(true);
        jScrollPane1.setEnabled(true);
        jTextArea1.setEnabled(true);
        jXDatePicker1.setEnabled(true);
        maleRDB.setEnabled(true);
        nameTextField.setEnabled(true);
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(true);
        uploadBtn.setEnabled(true);
    }

    private void disableInput() {
        CancelBtn.setEnabled(false);
        femaleRDB.setEnabled(false);
        cmbAge.setEnabled(false);
        imageTextField.setEnabled(false);
        jScrollPane1.setEnabled(false);
        jTextArea1.setEnabled(false);
        jXDatePicker1.setEnabled(false);
        maleRDB.setEnabled(false);
        nameTextField.setEnabled(false);
        saveBtn.setEnabled(false);
        updateBtn.setEnabled(true);
        uploadBtn.setEnabled(false);
    }
    
    private String browseImageFile() {
        JFileChooser chooseFile = new JFileChooser();
        chooseFile.showOpenDialog(null);
        File file = chooseFile.getSelectedFile();
        String filePath = file.getPath();
        System.out.println(filePath);
        imageTextField.setText(filePath);
        return filePath;
    }
   
    
    private void imageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageTextFieldActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        imageTextField.setEnabled(true);
        browseImageFile();
        
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void lblBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMousePressed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewPersonTable panel = (ViewPersonTable) component;
        panel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_lblBackMousePressed

    public void displayImage() {
        BufferedImage image = null;
        String filename = person.getImageDetails();
        try {
            image = ImageIO.read(new File(filename));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File not found");
        }
        ImageIcon icon = new ImageIcon(image);
        imageLable.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JComboBox<String> cmbAge;
    private javax.swing.JRadioButton femaleRDB;
    private javax.swing.JLabel imageLable;
    private javax.swing.JTextField imageTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JRadioButton maleRDB;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton uploadBtn;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
