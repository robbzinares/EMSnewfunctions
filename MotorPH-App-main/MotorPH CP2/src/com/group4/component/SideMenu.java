package com.group4.component;

import com.group4.form.EmployeeForm;
import com.group4.form.PayrollForm;
import com.group4.form.TimesheetForm;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SideMenu extends JPanel {

    public SideMenu() {
        initComponents();
        setBackground(new Color(6, 17, 60));
        setVisible(true);
        setOpaque(false);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ButtonEmployees) {
            loadForm(new EmployeeForm());
        } else if (e.getSource() == ButtonTimesheet) {
            loadForm(new TimesheetForm());
        } else if (e.getSource() == ButtonPayroll) {
            loadForm(new PayrollForm());
        }
    }

    public JButton getButtonEmployees() {
        return ButtonEmployees;
    }

    public JButton getButtonTimesheet() {
        return ButtonTimesheet;
    }

    public JButton getButtonPayroll() {
        return ButtonPayroll;
    }

    private void loadForm(JPanel panel) {
        // Remove any existing components from the panel
        removeAll();

        // Add the new panel to the SideMenu
        add(panel);

        // Repaint the SideMenu to reflect the changes
        revalidate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPayroll = new com.group4.resources.Button();
        ButtonEmployees = new com.group4.resources.Button();
        ButtonTimesheet = new com.group4.resources.Button();

        setBackground(new java.awt.Color(6, 17, 60));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setOpaque(false);

        ButtonPayroll.setBackground(new java.awt.Color(6, 17, 60));
        ButtonPayroll.setBorder(null);
        ButtonPayroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Payroll.png"))); // NOI18N
        ButtonPayroll.setToolTipText("");
        ButtonPayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPayrollActionPerformed(evt);
            }
        });

        ButtonEmployees.setBackground(new java.awt.Color(6, 17, 60));
        ButtonEmployees.setBorder(null);
        ButtonEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Employee.png"))); // NOI18N
        ButtonEmployees.setToolTipText("");
        ButtonEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmployeesActionPerformed(evt);
            }
        });

        ButtonTimesheet.setBackground(new java.awt.Color(6, 17, 60));
        ButtonTimesheet.setBorder(null);
        ButtonTimesheet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Timesheet.png"))); // NOI18N
        ButtonTimesheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimesheetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonTimesheet, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ButtonPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(ButtonEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonTimesheet, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPayroll, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEmployeesActionPerformed
        ButtonEmployees.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Employee_selected.png")));
        ButtonTimesheet.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Timesheet.png")));
        ButtonPayroll.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Payroll.png")));
    }//GEN-LAST:event_ButtonEmployeesActionPerformed

    private void ButtonTimesheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimesheetActionPerformed
        ButtonEmployees.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Employee.png")));
        ButtonTimesheet.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Timesheet_selected.png")));
        ButtonPayroll.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Payroll.png")));
    }//GEN-LAST:event_ButtonTimesheetActionPerformed

    private void ButtonPayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPayrollActionPerformed
        ButtonEmployees.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Employee.png")));
        ButtonTimesheet.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Timesheet.png")));
        ButtonPayroll.setIcon(new ImageIcon(getClass().getResource("/com/group4/images/Payroll_selected.png")));
    }//GEN-LAST:event_ButtonPayrollActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group4.resources.Button ButtonEmployees;
    private com.group4.resources.Button ButtonPayroll;
    private com.group4.resources.Button ButtonTimesheet;
    // End of variables declaration//GEN-END:variables
}
