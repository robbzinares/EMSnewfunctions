package com.group4.form;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class AddEmployeeForm extends javax.swing.JPanel {
    
    private JTable EmployeeData;

    public AddEmployeeForm() {
        initComponents();
    }
    
    
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundCornerPanel1 = new com.group4.components.RoundCornerPanel();
        tfAddress = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfPagibig = new javax.swing.JTextField();
        tfClothing = new javax.swing.JTextField();
        tfRiceSubsidy = new javax.swing.JTextField();
        tfHourlyRate = new javax.swing.JTextField();
        tfEnum = new javax.swing.JTextField();
        tfTin = new javax.swing.JTextField();
        tfPhoneAllowance = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfPhilhealth = new javax.swing.JTextField();
        tfGrossSemi = new javax.swing.JTextField();
        tfBirthday = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfSupervisor = new javax.swing.JTextField();
        AddBtn = new com.group4.resources.Button();
        tfBasic = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfSss = new javax.swing.JTextField();

        setBackground(new java.awt.Color(73, 79, 101));

        tfAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        tfStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        tfPagibig.setBorder(javax.swing.BorderFactory.createTitledBorder("PAGIBIG"));

        tfClothing.setBorder(javax.swing.BorderFactory.createTitledBorder("Clothing Allowance"));

        tfRiceSubsidy.setBorder(javax.swing.BorderFactory.createTitledBorder("Rice Subsidy"));
        tfRiceSubsidy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRiceSubsidyActionPerformed(evt);
            }
        });

        tfHourlyRate.setBorder(javax.swing.BorderFactory.createTitledBorder("Hourly Rate"));

        tfEnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEnum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Number", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfEnum.setOpaque(true);
        tfEnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnumActionPerformed(evt);
            }
        });

        tfTin.setBorder(javax.swing.BorderFactory.createTitledBorder("TIN"));

        tfPhoneAllowance.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Allowance"));

        tfFirstName.setBorder(javax.swing.BorderFactory.createTitledBorder("First Name"));

        tfPhilhealth.setBorder(javax.swing.BorderFactory.createTitledBorder("PhilHealth"));

        tfGrossSemi.setBorder(javax.swing.BorderFactory.createTitledBorder("Gross Semi-Monthly Rate"));

        tfBirthday.setBorder(javax.swing.BorderFactory.createTitledBorder("Birthday"));
        tfBirthday.setMinimumSize(new java.awt.Dimension(50, 40));

        tfPosition.setBorder(javax.swing.BorderFactory.createTitledBorder("Position"));

        tfSupervisor.setBorder(javax.swing.BorderFactory.createTitledBorder("Supervisor"));
        tfSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSupervisorActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(255, 204, 51));
        AddBtn.setText("ADD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        tfBasic.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Salary"));
        tfBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBasicActionPerformed(evt);
            }
        });

        tfPhone.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone Number"));
        tfPhone.setMinimumSize(new java.awt.Dimension(50, 40));

        tfLastName.setBorder(javax.swing.BorderFactory.createTitledBorder("Last Name"));

        tfSss.setBorder(javax.swing.BorderFactory.createTitledBorder("SSS"));

        javax.swing.GroupLayout roundCornerPanel1Layout = new javax.swing.GroupLayout(roundCornerPanel1);
        roundCornerPanel1.setLayout(roundCornerPanel1Layout);
        roundCornerPanel1Layout.setHorizontalGroup(
            roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfClothing, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBasic, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfHourlyRate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                            .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfPosition, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBirthday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfStatus)
                            .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfLastName)
                            .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        roundCornerPanel1Layout.setVerticalGroup(
            roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(roundCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(roundCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfEnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnumActionPerformed

    private void tfRiceSubsidyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRiceSubsidyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRiceSubsidyActionPerformed

    private void tfBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBasicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBasicActionPerformed

    private void tfSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSupervisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSupervisorActionPerformed

 

    // Method to set the EmployeeData
    public void setEmployeeData(JTable EmployeeData) {
        this.EmployeeData = EmployeeData;
    

}
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // Retrieve data from text fields
        String enumber = tfEnum.getText();
        String elname = tfLastName.getText();
        String efname = tfFirstName.getText();
        String bday = tfBirthday.getText();
        String add = tfAddress.getText();
        String phone = tfPhone.getText();
        String sss = tfSss.getText();
        String philhealth = tfPhilhealth.getText();
        String tin = tfTin.getText();
        String pagibig = tfPagibig.getText();
        String status = tfStatus.getText();
        String supervisor = tfSupervisor.getText();
        String basic = tfBasic.getText();
        String rice = tfRiceSubsidy.getText();
        String clothing = tfClothing.getText();
        String grossSemi = tfGrossSemi.getText();
        String hourly = tfHourlyRate.getText();
        String phoneAllowance = tfPhoneAllowance.getText();
        String position = tfPosition.getText();
        
        
        // Check if any field is empty
    if (enumber.isEmpty() || elname.isEmpty() || efname.isEmpty() || bday.isEmpty() || add.isEmpty() ||
        phone.isEmpty() || sss.isEmpty() || philhealth.isEmpty() || tin.isEmpty() || pagibig.isEmpty() ||
        status.isEmpty() || supervisor.isEmpty() || basic.isEmpty() || rice.isEmpty() || clothing.isEmpty() ||
        grossSemi.isEmpty() || hourly.isEmpty() || phoneAllowance.isEmpty() || position.isEmpty()) {
        
        // Show error message if any field is empty
        JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit method without proceeding further
    }

        String newEntry = String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"",
                enumber, elname, efname, bday, add, phone, sss, philhealth, tin, pagibig,
                status, supervisor, basic, rice, clothing, grossSemi, hourly, phoneAllowance, position);

        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\PotChi\\Documents\\NetBeansProjects\\MotorPH-App\\MotorPH CP2\\src\\com\\group4\\csv\\employeedata1.csv", true))) {
            writer.println(newEntry);
            writer.println();

            JOptionPane.showMessageDialog(null, "Employee Added Successfully!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

            SwingUtilities.getWindowAncestor(this).dispose();
            // After successfully adding the employee, update the table model
            DefaultTableModel model = (DefaultTableModel) EmployeeData.getModel();
            model.addRow(new Object[]{enumber, elname, efname, bday, add, phone, sss, philhealth, tin, pagibig,
                status, supervisor, basic, rice, clothing, grossSemi, hourly, phoneAllowance, position});
            

 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Adding Employee Failed: " + e.getMessage());
        }


    }//GEN-LAST:event_AddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group4.resources.Button AddBtn;
    private com.group4.components.RoundCornerPanel roundCornerPanel1;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfBirthday;
    private javax.swing.JTextField tfClothing;
    private javax.swing.JTextField tfEnum;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfGrossSemi;
    private javax.swing.JTextField tfHourlyRate;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPagibig;
    private javax.swing.JTextField tfPhilhealth;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfPhoneAllowance;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfRiceSubsidy;
    private javax.swing.JTextField tfSss;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfSupervisor;
    private javax.swing.JTextField tfTin;
    // End of variables declaration//GEN-END:variables
}
