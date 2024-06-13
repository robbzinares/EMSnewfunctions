package com.group4.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.group4.form.EmployeeForm;
import com.group4.form.PayrollForm;
import com.group4.form.TimesheetForm;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Main extends javax.swing.JFrame {

    private Animator animatorLogin;
    private Animator animatorBody;
    private boolean Login;
    private JPopupMenu profileMenu;
    private EmployeeDataHandler dataHandler;

    public Main() {
        initComponents();
        getContentPane().setBackground(new Color(73, 79, 101));

        java.awt.EventQueue.invokeLater(() -> {
            setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 25, 25));
        });

        TimingTarget targetLogin = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (Login) {
                    Background.setAnimate(fraction);
                } else {
                    Background.setAnimate(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (Login) {
                    PanelLogin.setVisible(false);
                    Background.setShowPaint(true);
                    PanelBody.setAlpha(0);
                    PanelBody.setVisible(true);
                    animatorBody.start();
                } else {
                    enableLogin(true);
                    txtUser.grabFocus();
                }
            }
        };
        TimingTarget targetBody = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (Login) {
                    PanelBody.setAlpha(fraction);
                } else {
                    PanelBody.setAlpha(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (Login == false) {
                    PanelBody.setVisible(false);
                    Background.setShowPaint(false);
                    Background.setAnimate(1);
                    PanelLogin.setVisible(true);
                    animatorLogin.start();
                }
            }
        };
        animatorLogin = new Animator(1500, targetLogin);
        animatorBody = new Animator(500, targetBody);
        animatorLogin.setResolution(0);
        animatorBody.setResolution(0);

        initializePlaceholders();

        // Initialize the data handler
        dataHandler = new EmployeeDataHandler();

        // Load employees from CSV file
        loadEmployeesFromCSV();
    }

    private void initializePlaceholders() {
        txtUser.setText("Enter Username");
        txtUser.setForeground(new Color(155, 155, 155));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtUser.getText().equals("Enter Username")) {
                    txtUser.setText("");
                    txtUser.setForeground(Color.BLACK);
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtUser.getText().isEmpty()) {
                    txtUser.setText("Enter Username");
                    txtUser.setForeground(new Color(155, 155, 155));
                }
            }
        });

        txtPass.setPlaceholder("Enter Password");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new com.group4.resources.Button();
        button2 = new com.group4.resources.Button();
        jTextField1 = new javax.swing.JTextField();
        Background = new com.group4.resources.WaveBackground();
        PanelLogin = new com.group4.resources.PanelTransparent();
        cmdLogin = new com.group4.resources.Button();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new com.group4.resources.textField1();
        txtPass = new com.group4.resources.PasswordField();
        PanelBody = new com.group4.resources.PanelTransparent();
        cmdLogout = new com.group4.resources.Button();
        Profile = new javax.swing.JLabel();
        panelFormPlaceholder = new com.group4.resources.PanelTransparent();
        EmployeeForm = new com.group4.form.EmployeeForm();
        TimesheetForm = new com.group4.form.TimesheetForm();
        PayrollForm = new com.group4.form.PayrollForm();
        sideMenu = new com.group4.component.SideMenu();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(73, 79, 101));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        Background.setLayout(new java.awt.CardLayout());

        cmdLogin.setBackground(new java.awt.Color(255, 140, 50));
        cmdLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdLogin.setForeground(new java.awt.Color(255, 255, 255));
        cmdLogin.setText("LOGIN");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Group 18 (1).png"))); // NOI18N

        txtUser.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/profile.png"))); // NOI18N
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
                PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addContainerGap(391, Short.MAX_VALUE)
                                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                                                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(cmdLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(363, 363, 363))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(441, 441, 441))))
        );
        PanelLoginLayout.setVerticalGroup(
                PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(300, Short.MAX_VALUE))
        );

        Background.add(PanelLogin, "card2");

        PanelBody.setBackground(new java.awt.Color(73, 79, 101));
        PanelBody.setToolTipText("");

        cmdLogout.setBackground(new java.awt.Color(73, 79, 101));
        cmdLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/log-out (1).png"))); // NOI18N
        cmdLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogoutActionPerformed(evt);
            }
        });

        Profile.setBackground(new java.awt.Color(255, 255, 255));
        Profile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/officer.png"))); // NOI18N
        Profile.setText("   Hello, Admin!    ");
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });

        panelFormPlaceholder.setLayout(new java.awt.CardLayout());
        panelFormPlaceholder.add(EmployeeForm, "card2");
        panelFormPlaceholder.add(EmployeeForm, "card3");
        panelFormPlaceholder.add(TimesheetForm, "card4");
        panelFormPlaceholder.add(PayrollForm, "card3");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group4/images/Group 19.png"))); // NOI18N

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
                PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBodyLayout.createSequentialGroup()
                                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelBodyLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(cmdLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(sideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(panelFormPlaceholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(PanelBodyLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 800, Short.MAX_VALUE)
                                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
        );
        PanelBodyLayout.setVerticalGroup(
                PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelBodyLayout.createSequentialGroup()
                                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelBodyLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelBodyLayout.createSequentialGroup()
                                                .addGap(206, 206, 206)
                                                .addComponent(sideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                                                .addComponent(cmdLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34))
                                        .addGroup(PanelBodyLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(panelFormPlaceholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Background.add(PanelBody, "card3");

        getContentPane().add(Background, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        Login = true;
        if (!animatorLogin.isRunning()) {
            String user = txtUser.getText().trim();
            String pass = String.valueOf(txtPass.getPassword());
            boolean action = true;
            if (user.isEmpty()) {
                txtUser.grabFocus();
                action = false;
            }
            if (pass.isEmpty()) {
                if (action) {
                    txtPass.grabFocus();
                }
                action = false;
            }
            if (action) {
                animatorLogin.start();
                enableLogin(false);
            }
        }
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void cmdLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLogoutActionPerformed
        logout();
    }//GEN-LAST:event_cmdLogoutActionPerformed

    private void logout() {
        Login = false;
        clearLogin();
        animatorBody.start();
    }

    private void loadForm(JPanel panel) {
        panelFormPlaceholder.removeAll();
        panelFormPlaceholder.add(panel);
        panelFormPlaceholder.revalidate();
        panelFormPlaceholder.repaint();
    }

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        profileMenu = new JPopupMenu();
        JMenuItem logoutMenuItem = new JMenuItem("Logout");
        logoutMenuItem.addActionListener(e -> logout());
        profileMenu.add(logoutMenuItem);

        // Add mouse click listener to the profile image
        Profile.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (SwingUtilities.isLeftMouseButton(evt)) {
                    profileMenu.show(Profile, evt.getX(), evt.getY());
                }
            }
        });
    }//GEN-LAST:event_ProfileMouseClicked

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Enter Username")) {
            txtUser.setText("");
            txtUser.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Enter Username");
            txtUser.setForeground(new Color(155, 155, 155));
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // Perform any necessary action upon pressing Enter in the username field
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // Handle focus gained in password field
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        // Handle focus lost in password field
    }//GEN-LAST:event_txtPassFocusLost

    private void enableLogin(boolean action) {
        txtUser.setEditable(action);
        txtPass.setEditable(action);
        cmdLogin.setEnabled(action);
    }

    public void clearLogin() {
        txtUser.setText("");
        txtPass.setText("");
    }

    public void loadEmployeesFromCSV() {
        try {
            List<Employee> employees = dataHandler.readEmployeesFromCSV("employees.csv");
            if (employees != null) {
                EmployeeForm.setEmployees(employees);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading employees from CSV: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group4.resources.WaveBackground Background;
    private com.group4.form.EmployeeForm EmployeeForm;
    private com.group4.resources.PanelTransparent PanelBody;
    private com.group4.resources.PanelTransparent PanelLogin;
    private com.group4.form.PayrollForm PayrollForm;
    private javax.swing.JLabel Profile;
    private com.group4.form.TimesheetForm TimesheetForm;
    private com.group4.resources.Button button1;
    private com.group4.resources.Button button2;
    private com.group4.resources.Button cmdLogin;
    private com.group4.resources.Button cmdLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private com.group4.resources.PanelTransparent panelFormPlaceholder;
    private com.group4.component.SideMenu sideMenu;
    private com.group4.resources.PasswordField txtPass;
    private com.group4.resources.textField1 txtUser;
    // End of variables declaration//GEN-END:variables
}
