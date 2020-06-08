package markbook;
import javax.swing.JFrame;
/**
 * <h1>Title: Login Page</h1>
 * Purpose: Allows a user with an existing account to login.
 * @author owner
 */

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPages
     */
    public LoginPage() {
        initComponents();
        this.setLocationRelativeTo(null); //centres to the screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        designPanel = new javax.swing.JPanel();
        Logo1 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        newUserButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        errorMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        designPanel.setBackground(new java.awt.Color(255, 255, 255));

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/markbook/MarkBook Logo1.PNG"))); // NOI18N

        javax.swing.GroupLayout designPanelLayout = new javax.swing.GroupLayout(designPanel);
        designPanel.setLayout(designPanelLayout);
        designPanelLayout.setHorizontalGroup(
            designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        designPanelLayout.setVerticalGroup(
            designPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(designPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        loginLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(102, 102, 102));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

        numberLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(102, 102, 102));
        numberLabel.setText("Identification Number:");

        passwordLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(102, 102, 102));
        passwordLabel.setText("Password: ");

        numberField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N

        loginButton.setBackground(new java.awt.Color(153, 153, 153));
        loginButton.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        newUserButton.setBackground(new java.awt.Color(153, 153, 153));
        newUserButton.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        newUserButton.setText("New User?");
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N

        errorMessageLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 10)); // NOI18N
        errorMessageLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(designPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberLabel)
                                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(loginPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(errorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(designPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabel)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        numberField.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Redirects user to sign up page.
     * @param evt Event where the user clicks the sign up button.
     */
    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        SignUpPage signup = new SignUpPage();
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newUserButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * Logs in the user.
     * @param evt Event where the user clicks the login button.
     */
    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        Markbook book = new Markbook();
        String password = new String(this.passwordField.getPassword());
        if (!this.checkIfNumber()) {
            errorMessageLabel.setText("Please enter a valid identification number.");
        } else {
            if (book.loginUser(Integer.parseInt(numberField.getText()), password)) {
                this.setVisible(false);
            } else {
                errorMessageLabel.setText("Please enter a valid ID and password.");
            }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    /**
     * Checks if the value entered in the identification number field is a number.
     * @return Boolean value based on if the entered value is a number.
     */
    public boolean checkIfNumber() {
        String userID = this.numberField.getText();
        return userID.matches("[0-9]+") && userID.length() > 2;
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo1;
    private javax.swing.JPanel designPanel;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton newUserButton;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
