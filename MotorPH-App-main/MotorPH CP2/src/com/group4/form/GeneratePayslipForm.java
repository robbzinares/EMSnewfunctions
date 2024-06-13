package com.group4.form;

import java.text.NumberFormat;

public class GeneratePayslipForm extends javax.swing.JPanel {

    private String enumber;
    private String elname;
    private String efname;
    private String position;
    private String status;
    private String basic;
    private String rice;
    private String phoneAllowance;
    private String clothing;
    private String hourly;

    public GeneratePayslipForm(String enumber, String elname, String efname, String position, String status, String basic, String rice, String phoneAllowance, String clothing, String hourly) {
        this.enumber = enumber;
        this.elname = elname;
        this.efname = efname;
        this.position = position;
        this.status = status;
        this.basic = basic;
        this.rice = rice;
        this.phoneAllowance = phoneAllowance;
        this.clothing = clothing;
        this.hourly = hourly;

        initComponents();
        populateFields();
    }

    private void populateFields() {
        // Populate form fields with the employee data
        tfEnum.setText(enumber);
        tfLastName.setText(elname);
        tfFirstName.setText(efname);
        tfPosition.setText(position);
        tfStatus.setText(status);
        tfBasic.setText(basic);
        tfRiceSubsidy.setText(rice);
        tfClothing.setText(clothing);
        tfPhoneAllowance.setText(phoneAllowance);
        tfHourlyRate.setText(hourly);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundCornerPanel1 = new com.group4.components.RoundCornerPanel();
        jLabel1 = new javax.swing.JLabel();
        roundCornerPanel2 = new com.group4.components.RoundCornerPanel();
        tfEnum = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        roundCornerPanel3 = new com.group4.components.RoundCornerPanel();
        roundCornerPanel4 = new com.group4.components.RoundCornerPanel();
        jLabel18 = new javax.swing.JLabel();
        tfTotalEarnings2 = new javax.swing.JTextField();
        roundCornerPanel5 = new com.group4.components.RoundCornerPanel();
        jLabel19 = new javax.swing.JLabel();
        tfDeduc2 = new javax.swing.JTextField();
        roundCornerPanel6 = new com.group4.components.RoundCornerPanel();
        jLabel20 = new javax.swing.JLabel();
        tfNetSalary2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfBasic = new javax.swing.JTextField();
        tfRiceSubsidy = new javax.swing.JTextField();
        tfPhoneAllowance = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfClothing = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfHourlyRate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfTax = new javax.swing.JTextField();
        tfSss = new javax.swing.JTextField();
        tfPhilhealth = new javax.swing.JTextField();
        tfPagibig = new javax.swing.JTextField();
        TotalEarnings = new javax.swing.JLabel();
        tfTotalEarnings = new javax.swing.JTextField();
        tfDeduc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfNetSalary = new javax.swing.JTextField();
        btnCalculate = new com.group4.resources.Button();

        setBackground(new java.awt.Color(73, 79, 101));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Payslip");

        javax.swing.GroupLayout roundCornerPanel1Layout = new javax.swing.GroupLayout(roundCornerPanel1);
        roundCornerPanel1.setLayout(roundCornerPanel1Layout);
        roundCornerPanel1Layout.setHorizontalGroup(
            roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundCornerPanel1Layout.setVerticalGroup(
            roundCornerPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tfEnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfEnum.setForeground(new java.awt.Color(52, 70, 119));
        tfEnum.setBorder(null);

        tfLastName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfLastName.setForeground(new java.awt.Color(249, 130, 14));
        tfLastName.setBorder(null);

        tfFirstName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfFirstName.setForeground(new java.awt.Color(249, 130, 14));
        tfFirstName.setBorder(null);

        tfPosition.setBackground(new java.awt.Color(255, 204, 204));
        tfPosition.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPosition.setBorder(null);

        tfStatus.setBackground(new java.awt.Color(255, 255, 204));
        tfStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfStatus.setBorder(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/avatargif.gif"))); // NOI18N

        javax.swing.GroupLayout roundCornerPanel2Layout = new javax.swing.GroupLayout(roundCornerPanel2);
        roundCornerPanel2.setLayout(roundCornerPanel2Layout);
        roundCornerPanel2Layout.setHorizontalGroup(
            roundCornerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundCornerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundCornerPanel2Layout.createSequentialGroup()
                        .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundCornerPanel2Layout.createSequentialGroup()
                        .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundCornerPanel2Layout.setVerticalGroup(
            roundCornerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(roundCornerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundCornerPanel2Layout.createSequentialGroup()
                        .addGroup(roundCornerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(roundCornerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        roundCornerPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundCornerPanel4.setBackground(new java.awt.Color(153, 204, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel18.setText("Total Earnings");

        tfTotalEarnings2.setBackground(new java.awt.Color(153, 204, 255));
        tfTotalEarnings2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfTotalEarnings2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTotalEarnings2.setBorder(null);

        javax.swing.GroupLayout roundCornerPanel4Layout = new javax.swing.GroupLayout(roundCornerPanel4);
        roundCornerPanel4.setLayout(roundCornerPanel4Layout);
        roundCornerPanel4Layout.setHorizontalGroup(
            roundCornerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel18)
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(tfTotalEarnings2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        roundCornerPanel4Layout.setVerticalGroup(
            roundCornerPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTotalEarnings2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        roundCornerPanel3.add(roundCornerPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, -1, 59));

        roundCornerPanel5.setBackground(new java.awt.Color(255, 204, 153));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel19.setText("Total Deductions");

        tfDeduc2.setBackground(new java.awt.Color(255, 204, 153));
        tfDeduc2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfDeduc2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDeduc2.setBorder(null);

        javax.swing.GroupLayout roundCornerPanel5Layout = new javax.swing.GroupLayout(roundCornerPanel5);
        roundCornerPanel5.setLayout(roundCornerPanel5Layout);
        roundCornerPanel5Layout.setHorizontalGroup(
            roundCornerPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel19)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(tfDeduc2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        roundCornerPanel5Layout.setVerticalGroup(
            roundCornerPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfDeduc2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        roundCornerPanel3.add(roundCornerPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 16, -1, -1));

        roundCornerPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel20.setText("Net Salary");

        tfNetSalary2.setBackground(new java.awt.Color(204, 255, 204));
        tfNetSalary2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfNetSalary2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNetSalary2.setBorder(null);

        javax.swing.GroupLayout roundCornerPanel6Layout = new javax.swing.GroupLayout(roundCornerPanel6);
        roundCornerPanel6.setLayout(roundCornerPanel6Layout);
        roundCornerPanel6Layout.setHorizontalGroup(
            roundCornerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundCornerPanel6Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel20)
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(tfNetSalary2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        roundCornerPanel6Layout.setVerticalGroup(
            roundCornerPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundCornerPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfNetSalary2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        roundCornerPanel3.add(roundCornerPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 16, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Earnings");
        roundCornerPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, -1, -1));

        jLabel4.setText("Basic Salary");
        roundCornerPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, -1));

        jLabel5.setText("Rice Subsidy");
        roundCornerPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 153, -1, -1));

        jLabel6.setText("Phone Allowance");
        roundCornerPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 179, 101, -1));

        jLabel7.setText("Clothing Allowance");
        roundCornerPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 203, 115, -1));

        tfBasic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfBasic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfBasic, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 125, 209, -1));

        tfRiceSubsidy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfRiceSubsidy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfRiceSubsidy, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 151, 209, -1));

        tfPhoneAllowance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfPhoneAllowance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfPhoneAllowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 177, 174, -1));

        jLabel9.setText("Hourly Pay");
        roundCornerPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 231, 70, -1));

        tfClothing.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfClothing.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfClothing, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 203, 159, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Deductions");
        roundCornerPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 93, -1, -1));

        tfHourlyRate.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfHourlyRate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfHourlyRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 229, 203, -1));

        jLabel11.setText("Income Tax");
        roundCornerPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 127, -1, -1));

        jLabel12.setText("SSS Contribution");
        roundCornerPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 153, -1, -1));

        jLabel13.setText("PhilHealth Contribution");
        roundCornerPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 179, -1, -1));

        jLabel14.setText("PAGIBIG Contribution");
        roundCornerPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 205, -1, -1));

        tfTax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTax.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTaxActionPerformed(evt);
            }
        });
        roundCornerPanel3.add(tfTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 125, 225, -1));

        tfSss.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfSss.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfSss, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 151, 197, -1));

        tfPhilhealth.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfPhilhealth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfPhilhealth, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 177, 160, -1));

        tfPagibig.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfPagibig.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfPagibig, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 203, 173, -1));

        TotalEarnings.setText("Gross Salary");
        roundCornerPanel3.add(TotalEarnings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        tfTotalEarnings.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTotalEarnings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfTotalEarnings, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 211, -1));

        tfDeduc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfDeduc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfDeduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDeducActionPerformed(evt);
            }
        });
        roundCornerPanel3.add(tfDeduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 280, 190, -1));

        jLabel16.setText("Total Deductions");
        roundCornerPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 107, -1));

        jLabel17.setText("Net Salary");
        roundCornerPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 318, 69, -1));

        tfNetSalary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfNetSalary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        roundCornerPanel3.add(tfNetSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 316, 217, -1));

        btnCalculate.setBackground(new java.awt.Color(255, 140, 50));
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        roundCornerPanel3.add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 248, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundCornerPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addComponent(roundCornerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundCornerPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(roundCornerPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundCornerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(roundCornerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTaxActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        try {
            // Get the values from text fields
            double basicSalary = Double.parseDouble(tfBasic.getText().replaceAll(",", ""));
            double riceSubsidy = Double.parseDouble(tfRiceSubsidy.getText().replaceAll(",", ""));
            double phoneAllowance = Double.parseDouble(tfPhoneAllowance.getText().replaceAll(",", ""));
            double clothingAllowance = Double.parseDouble(tfClothing.getText().replaceAll(",", ""));

            // Calculate Gross Monthly Salary
            double totalEarnings = basicSalary + riceSubsidy + phoneAllowance + clothingAllowance;
            tfTotalEarnings.setText(formatWithCommas(totalEarnings));
            tfTotalEarnings2.setText(formatWithCommas(totalEarnings));

            // Calculate SSS contribution
            double sssContribution = calculateSssContribution(basicSalary);
            tfSss.setText(formatWithCommas(sssContribution));

            // Calculate Pag-IBIG contribution
            double pagibigContribution = calculatePagibigContribution(basicSalary);
            tfPagibig.setText(formatWithCommas(pagibigContribution));

            // Calculate PhilHealth contribution
            double philhealthContribution = calculatePhilhealthContribution(basicSalary);
            tfPhilhealth.setText(formatWithCommas(philhealthContribution));

            // Calculate withholding tax
            double annualTax = calculateAnnualTax(totalEarnings * 12);
            double withHoldingTax = annualTax / 12;
            tfTax.setText(formatWithCommas(withHoldingTax));

            // Calculate total deductions
            double totalDeductions = sssContribution + pagibigContribution + philhealthContribution + withHoldingTax;
            tfDeduc.setText(formatWithCommas(totalDeductions));
            tfDeduc2.setText(formatWithCommas(totalDeductions));

            // Calculate net earnings after deductions
            double netEarnings = basicSalary - totalDeductions + riceSubsidy + phoneAllowance + clothingAllowance;

            // Calculate net salary
            double netSalary = netEarnings;
            tfNetSalary.setText(formatWithCommas(netSalary));
            tfNetSalary2.setText(formatWithCommas(netSalary));

        } catch (NumberFormatException e) {
            // Handle parsing errors
            System.err.println("Error: Invalid input format");
        }
    }

    private String formatWithCommas(double value) {
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        return formatter.format(value);
    }

    // calculate SSS contribution based on basic salary
    private double calculateSssContribution(double basicSalary) {
        if (basicSalary >= 12750 && basicSalary < 13250) {
            return 585.00;
        } else if (basicSalary >= 13250 && basicSalary < 13750) {
            return 607.50;
        } else if (basicSalary >= 13750 && basicSalary < 14250) {
            return 630.00;
        } else if (basicSalary >= 14250 && basicSalary < 14750) {
            return 652.50;
        } else if (basicSalary >= 14750 && basicSalary < 15250) {
            return 675.00;
        } else if (basicSalary >= 15250 && basicSalary < 15750) {
            return 697.50;
        } else if (basicSalary >= 15750 && basicSalary < 16250) {
            return 720.00;
        } else if (basicSalary >= 16250 && basicSalary < 16750) {
            return 742.50;
        } else if (basicSalary >= 16750 && basicSalary < 17250) {
            return 765.00;
        } else if (basicSalary >= 17250 && basicSalary < 17750) {
            return 787.50;
        } else if (basicSalary >= 17750 && basicSalary < 18250) {
            return 810.00;
        } else if (basicSalary >= 18250 && basicSalary < 18750) {
            return 832.50;
        } else if (basicSalary >= 18750 && basicSalary < 19250) {
            return 855.00;
        } else if (basicSalary >= 19250 && basicSalary < 19750) {
            return 877.50;
        } else if (basicSalary >= 19750 && basicSalary < 20250) {
            return 900.00;
        } else if (basicSalary >= 20250 && basicSalary < 20750) {
            return 922.50;
        } else if (basicSalary >= 20750 && basicSalary < 21250) {
            return 945.00;
        } else if (basicSalary >= 21250 && basicSalary < 21750) {
            return 967.50;
        } else if (basicSalary >= 21750 && basicSalary < 22250) {
            return 990.00;
        } else if (basicSalary >= 22250 && basicSalary < 22750) {
            return 1012.50;
        } else if (basicSalary >= 22750 && basicSalary < 23250) {
            return 1035.00;
        } else if (basicSalary >= 23250 && basicSalary < 23750) {
            return 1057.50;
        } else if (basicSalary >= 23750 && basicSalary < 24250) {
            return 1080.00;
        } else {
            return 1125.00; // Default contribution for over salary
        }
    }

    // Method to calculate Pag-IBIG contribution based on basic salary
    private double calculatePagibigContribution(double monthlyBasicSalary) {

        if (monthlyBasicSalary > 1500) {
            // Employee's Contribution Rate 2%
            double employeeContribution = 0.02 * monthlyBasicSalary;
            // Employer's Contribution Rate 2%
            double employerContribution = 0.02 * monthlyBasicSalary;
            // Total Contribution 4%
            double totalContribution = employeeContribution + employerContribution;
            // Limit the total contribution to 100
            return Math.min(totalContribution, 100.0);
        } else {
            return 0.0;
        }
    }

    private double calculatePhilhealthContribution(double monthlyBasicSalary) {
        if (monthlyBasicSalary <= 10000) {
            return 300.0; // Monthly Premium 300
        } else if (monthlyBasicSalary > 10000 && monthlyBasicSalary <= 59999.99) {
            // Premium Rate 3% - Monthly Premium - 300 up to 1,800
            return 0.03 * monthlyBasicSalary - 300;
        } else if (monthlyBasicSalary >= 60000) {
            // Premium Rate 3% - Monthly Premium 1,800
            return 1800.0;
        } else {
            // Handle other cases if needed
            return 0.0;
        }
    }

    // Method to calculate withholding tax based on total earnings
    private double calculateAnnualTax(double annualTax) {
        if (annualTax <= 250000) {
            return 0.0; // No withholding tax

        } else if (annualTax > 250000 && annualTax <= 400000) {

            return 0.15 * (annualTax - 250000);

        } else if (annualTax > 400000 && annualTax <= 800000) {

            return 22500 + 0.20 * (annualTax - 400000);

        } else if (annualTax > 800000 && annualTax <= 2000000) {

            return 102500 + 0.25 * (annualTax - 800000);

        } else if (annualTax > 2000000 && annualTax <= 8000000) {

            return 402500 + 0.30 * (annualTax - 2000000);
        } else if (annualTax <= 8000000) {

            return 2202500 + .35 * (annualTax - 8000000);
        }
        return 0;
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void tfDeducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDeducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDeducActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalEarnings;
    private com.group4.resources.Button btnCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private com.group4.components.RoundCornerPanel roundCornerPanel1;
    private com.group4.components.RoundCornerPanel roundCornerPanel2;
    private com.group4.components.RoundCornerPanel roundCornerPanel3;
    private com.group4.components.RoundCornerPanel roundCornerPanel4;
    private com.group4.components.RoundCornerPanel roundCornerPanel5;
    private com.group4.components.RoundCornerPanel roundCornerPanel6;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfClothing;
    private javax.swing.JTextField tfDeduc;
    private javax.swing.JTextField tfDeduc2;
    private javax.swing.JTextField tfEnum;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfHourlyRate;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfNetSalary;
    private javax.swing.JTextField tfNetSalary2;
    private javax.swing.JTextField tfPagibig;
    private javax.swing.JTextField tfPhilhealth;
    private javax.swing.JTextField tfPhoneAllowance;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfRiceSubsidy;
    private javax.swing.JTextField tfSss;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfTax;
    private javax.swing.JTextField tfTotalEarnings;
    private javax.swing.JTextField tfTotalEarnings2;
    // End of variables declaration//GEN-END:variables
}
