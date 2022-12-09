/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.labOrganization;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.LabOrganization;
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author khyati
 */
public class LabWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkArea
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private LabOrganization labOrganization;
    private OrganizationDirectory directory;
    Enterprise enterprise;
    Person person;
    private UserAccount userAccount;
    PersonDirectory personDirectory;
    
    public LabWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem ecosystem) {

        initComponents();
        this.userProcessContainer=userProcessContainer;   
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.labOrganization = (LabOrganization)organization;
        valueLabel.setText(organization.getName());
        manageLabWorkAreaJPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LabNetworkPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabWorkArea = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 204, 153));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabNetworkPanel.setBackground(new java.awt.Color(0, 153, 102));
        LabNetworkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabNetworkPanelMousePressed(evt);
            }
        });
        LabNetworkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        LabNetworkPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 40));

        LabWorkArea.setBackground(new java.awt.Color(255, 204, 153));
        LabWorkArea.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        LabWorkArea.setText("Lab Work Area");
        LabWorkArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabWorkAreaMousePressed(evt);
            }
        });
        LabNetworkPanel.add(LabWorkArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 6, 220, 50));

        jPanel3.add(LabNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, -1));

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/labadminnn.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 160, 190));

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setText("Organization");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 20));

        valueLabel.setBackground(new java.awt.Color(0, 153, 102));
        valueLabel.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 190, 100, 20));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(systemAdminPanel, java.awt.BorderLayout.CENTER);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1345, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void LabWorkAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabWorkAreaMousePressed
        manageLabWorkAreaJPanel();
    }//GEN-LAST:event_LabWorkAreaMousePressed

    private void LabNetworkPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabNetworkPanelMousePressed
        // TODO add your handling code here:
        manageLabWorkAreaJPanel();
    }//GEN-LAST:event_LabNetworkPanelMousePressed

    private void manageLabWorkAreaJPanel() {
        LabJPanel panel = new LabJPanel(rightSystemAdminPanel, userAccount, labOrganization, ecosystem);
        rightSystemAdminPanel.add("ManageNetworkJPanel", panel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LabNetworkPanel;
    private javax.swing.JLabel LabWorkArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
