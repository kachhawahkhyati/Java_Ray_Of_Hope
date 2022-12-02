/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdopterRegisteration;
import Business.Adopter.Adopter;
import Business.Adopter.AdopterDirectory;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.AdopterOrganization;
import Business.Organizations.PersonCareOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PersonCareAdoptionWorkRequest;
import Business.WorkQueue.PersonCareWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 * Person Selection JPanel
 * @author khyati
 */
public class PersonSelectionJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem business;
    AdopterDirectory adopterdirectory;
    AdopterOrganization adopterorganization;
    Adopter adopter;
    String bgcstatus,financestatus;
    int uid;
    PersonDirectory persondirectory;
    PersonCareWorkRequest request;

    /**
     * Creates new form PersonSelectionJPanel
     */
    public PersonSelectionJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AdopterDirectory adopterdirectory, int uid, PersonDirectory persondirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.adopterdirectory = adopterdirectory;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
        this.adopterorganization = (AdopterOrganization) organization;
        this.uid = uid;
        this.persondirectory = persondirectory;
        for (Adopter a : adopterdirectory.getAdoptersList()) {
            if (a.getUsername().equals(account.getUsername())) {
                adopter = a;
                btnAdopt.setEnabled(!adopter.isFlag());
            }
        }
        populatePersonTable();
    }
    
    public void populatePersonTable() {
        DefaultTableModel dtms = (DefaultTableModel) tblPerson.getModel();
        dtms.setRowCount(0);
        for (Person person : persondirectory.getPersonList()) {
            if ("Acquired".equalsIgnoreCase(person.getStatus()) || ("Adopted by " + adopter.getName()).startsWith(person.getStatus())) {
                Object[] row = new Object[dtms.getColumnCount()];
                row[0] = person;
                row[1] = person.getName();
                row[2] = person.getGender();
                row[3] = person.getPersonAge();
                row[4] = person.getStatus();
                //row[5] = child.getStatus();
                dtms.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        btnAdopt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 52, 58));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Selection");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 383, -1));

        tblPerson.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Person ID", "Person Name", "Gender", "Age", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 790, 120));

        btnAdopt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAdopt.setText("Adopt");
        btnAdopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdoptActionPerformed(evt);
            }
        });
        add(btnAdopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/female doc and patients.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 830, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdoptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdoptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        Person ch = (Person) tblPerson.getValueAt(selectedRow, 0);
        PersonCareAdoptionWorkRequest adc = new PersonCareAdoptionWorkRequest();
        adc.setPersonId(ch.getPersonId());
        adc.setUserId(uid);
        adc.setAdopterName(adopter.getName());
        adc.setMessage("I want to adopt");
        adc.setStatus("Pending with Person care");
        adc.setPersonName(ch.getName());
        adc.setEmailId(adopter.getEmailId());
        //adc.s
        Organization org = null;
        for (Network network : business.getNetworkCatalog()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PersonCareOrganization) {
                        org = organization;
                        break;
                    }
                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(adc);
            account.getWorkQueue().getWorkRequestList().add(adc);
            business.getWorkQueue().getWorkRequestList().add(adc);
        }
        adopter.setFlag(true);
        JOptionPane.showMessageDialog(null, "Request has been sent to Person Care");
        btnAdopt.setEnabled(false);
    }//GEN-LAST:event_btnAdoptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdopt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPerson;
    // End of variables declaration//GEN-END:variables
}
