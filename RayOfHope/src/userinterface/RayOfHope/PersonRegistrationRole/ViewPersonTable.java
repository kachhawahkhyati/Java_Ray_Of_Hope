/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RayOfHope.PersonRegistrationRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.LabOrganization;
import Business.Organizations.MedicOrganization;
import Business.Organizations.Organization;
import Business.Organizations.PersonRegistrationOrganization;
import Business.Organizations.PharmacistOrganization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mandardeshmukh
 */
public class ViewPersonTable extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonTable
     */
    JPanel userProcessContainer;
    UserAccount account;
    PersonRegistrationOrganization personRegistrationOrganization;
    Enterprise enterprise;
    Person person;
    PersonDirectory persondirectory;
    EcoSystem business;
    Network network;
    public ViewPersonTable(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, PersonDirectory persondirectory) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.personRegistrationOrganization = (PersonRegistrationOrganization) organization;
        this.business = business;
        this.persondirectory = persondirectory;
        this.enterprise = enterprise;
        for (Network net : business.getNetworkCatalog()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.equals(enterprise)) {
                    network = net;
                }
            }
        }
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDeletePerson = new javax.swing.JButton();
        btnViewPerson = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNewPerson = new javax.swing.JTable();

        setBackground(new java.awt.Color(246, 226, 187));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 52, 58));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Person Records");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 370, 30));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 480, 330));

        btnDeletePerson.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletePerson.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnDeletePerson.setText("Delete Person");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });
        add(btnDeletePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 150, 33));

        btnViewPerson.setBackground(new java.awt.Color(255, 255, 255));
        btnViewPerson.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnViewPerson.setText("View Person Details");
        btnViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonActionPerformed(evt);
            }
        });
        add(btnViewPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 180, 33));

        tblNewPerson.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblNewPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Id", "Person Name", "Gender", "Age", "Status", "Medical Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNewPerson);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
       int selectedRow = tblNewPerson.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Person to delete");
        }
        Person ch = (Person) tblNewPerson.getValueAt(selectedRow, 0);
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the person?", "Alert", JOptionPane.YES_NO_CANCEL_OPTION);
        if (result == 0) {
            persondirectory.removePerson(ch);
            List<Organization> list = new ArrayList<>();
            for (Network network : business.getNetworkCatalog()) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (this.network.equals(network)) {
                        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof MedicOrganization || organization instanceof PharmacistOrganization || organization instanceof LabOrganization) {
                                list.add(organization);
                            }
                        }
                    }
                }
            }
            for (Organization org : list) {
                org.getWorkQueue().delete(ch.getPersonId());
            }
            account.getWorkQueue().delete(ch.getPersonId());
            business.getWorkQueue().delete(ch.getPersonId());
        }
        populateTable();
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void btnViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonActionPerformed

        int selectedRow = tblNewPerson.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person to view details");
            return;
        }
        person = (Person) tblNewPerson.getValueAt(selectedRow, 0);
        ViewPersonDetailsJPanel panel = new ViewPersonDetailsJPanel(userProcessContainer, person);
        this.userProcessContainer.add("ViewPersonDetailsJPanel", panel);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewPersonActionPerformed

    public void populateTable() {
        DefaultTableModel dtms = (DefaultTableModel) tblNewPerson.getModel();
        dtms.setRowCount(0);
        if (persondirectory != null && persondirectory.getPersonList() != null && persondirectory.getPersonList().size() > 0) {
            for (Person person : persondirectory.getPersonList()) {
                Object[] row = new Object[dtms.getColumnCount()];
                row[0] = person;
                row[1] = person.getName();
                row[2] = person.getGender();
                row[3] = person.getPersonAge();
                row[4] = person.getStatus();
                row[5] = person.getMedicalStatus();
                dtms.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnViewPerson;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNewPerson;
    // End of variables declaration//GEN-END:variables
}
