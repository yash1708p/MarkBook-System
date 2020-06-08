package markbook;
import java.util.Arrays;
import javax.swing.JFrame;
/**
 * <h1>Title: Sign Up PageM</h1>
 * Purpose: Allows for new users to create new accounts.
 * @version 4.0
 * @author Adrian Chung, Yash Patel, Kiran Patel.
 * @since January 10, 2019
 */

public class SignUpPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage
     */
    public SignUpPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpPanel = new javax.swing.JPanel();
        designPanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        returnLabel = new javax.swing.JLabel();
        userTypeComboBox = new javax.swing.JComboBox<>();
        userTypeLabel = new javax.swing.JLabel();
        errorMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        signUpPanel.setBackground(new java.awt.Color(153, 153, 153));

        designPanel.setBackground(new java.awt.Color(255, 255, 255));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/markbook/MarkBook Logo1.PNG"))); // NOI18N

        signUpLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 24)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(102, 102, 102));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setText("Sign-Up");

        nameLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Name:");

        nameField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        numberLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(102, 102, 102));
        numberLabel.setText("Identification Number:");

        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Password:");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        confirmPasswordLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(102, 102, 102));
        confirmPasswordLabel.setText("Confirm Password: ");

        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });

        signUpButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(153, 153, 153));
        signUpButton.setText("Sign-Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        returnLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(0, 51, 255));
        returnLabel.setText("Return To Login");
        returnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnLabelMouseClicked(evt);
            }
        });

        userTypeComboBox.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        userTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher" }));
        userTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeComboBoxActionPerformed(evt);
            }
        });

        userTypeLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        userTypeLabel.setForeground(new java.awt.Color(102, 102, 102));
        userTypeLabel.setText("User Type:");

        errorMessageLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 10)); // NOI18N
        errorMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout designPanelLayout = new javax.swing.GroupLayout(designPanel);
        designPanel.setLayout(designPanelLayout);
        designPanelLayout.setHorizontalGroup(
            designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(designPanelLayout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(designPanelLayout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(designPanelLayout.createSequentialGroup()
                                .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmPasswordLabel)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(numberField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(userTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, designPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, designPanelLayout.createSequentialGroup()
                                .addComponent(signUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(177, 177, 177))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, designPanelLayout.createSequentialGroup()
                                .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(returnLabel)
                                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(221, 221, 221))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, designPanelLayout.createSequentialGroup()
                                .addComponent(errorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193))))))
        );
        designPanelLayout.setVerticalGroup(
            designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designPanelLayout.createSequentialGroup()
                .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(designPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(signUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(designPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        nameField.getAccessibleContext().setAccessibleName("NameField");
        numberField.getAccessibleContext().setAccessibleName("NumberField");

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(designPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(designPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTypeComboBoxActionPerformed

    private void returnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseClicked
        LoginPage login = new LoginPage();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnLabelMouseClicked

    /**
     * Signs up a new user.
     * @param evt The event of the sign up button being clicked.
     */
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        Markbook book = new Markbook();
        boolean signup = this.signUpAttempt();
        if (signup) {
            int number = Integer.parseInt(this.numberField.getText());
            String name = this.nameField.getText();
            String password = new String(this.passwordField.getPassword());
            LoginPage returnLogin = new LoginPage();
            if (userTypeComboBox.getSelectedItem().toString().equals("Teacher")) {
                if (book.addTeacher(name, number, password)) {
                    returnLogin.setVisible(true);
                    this.dispose();
                } else {
                    this.errorMessageLabel.setText("User already exists.");
                }
            } else {
                if (book.addStudent(name, number, password)) {
                    returnLogin.setVisible(true);
                    this.dispose();
                } else {
                    this.errorMessageLabel.setText("User already exists.");
                }

            }
        } else {
            this.errorMessageLabel.setText("Please fill all fields correctly.");
        }
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

    }//GEN-LAST:event_passwordFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed

    }//GEN-LAST:event_numberFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    /**
     * Checks if the value entered in the identification number field is a number.
     * @return Boolean value based on if the entered value is a number.
     */
    public boolean checkIfNumber() {
        String userID = this.numberField.getText();
        return userID.matches("[0-9]+") && userID.length() > 2;
    }
    
    /**
     * Checks if all fields are filled.
     * @return Boolean value based on if all fields are filled.
     */
    public boolean checkIfFieldsFilled() {
        return !nameField.getText().isEmpty() && !numberField.getText().isEmpty() && passwordField.getPassword().length > 0 && confirmPasswordField.getPassword().length > 0; 
    }
    
    /**
     * Confirms password.
     * @return Boolean value based on if the passwords submitted match.
     */
    public boolean passwordEquals() {
        return Arrays.equals(this.confirmPasswordField.getPassword(), this.passwordField.getPassword());
    }
     
    /**
     * Checks if the criteria for a sign up attempt is valid.
     * @return Boolean value based on if the sign up attempt is valid.
     */
    public boolean signUpAttempt() {
        return this.checkIfNumber() && this.checkIfFieldsFilled() && this.passwordEquals();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPanel designPanel;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JLabel userTypeLabel;
    // End of variables declaration//GEN-END:variables
}
