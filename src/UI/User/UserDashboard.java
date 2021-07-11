/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.User;

import CommonTasks.RemovingData;
import UI.ChangePssword;
import UI.Login;
import UI.UpdateUserProfile;
import UI.ViewMeals;
import UI.ViewItems;
import UI.ViewOrders;
import java.awt.Color;

/**
 *
 * @author Chamika
 */
public class UserDashboard extends javax.swing.JFrame {

    /**
     * Creates new form StudentDashboard
     */
    public UserDashboard() {
        initComponents();
        profileSOptions.setVisible(false);
        
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
        mealOptions = new javax.swing.JButton();
        orderList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        button6 = new javax.swing.JButton();
        profileSOptions = new javax.swing.JPanel();
        updateProfile = new javax.swing.JLabel();
        changePassword = new javax.swing.JLabel();
        deleteAccount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        cartIcon = new javax.swing.JLabel();
        profileSettings = new javax.swing.JLabel();
        buyListIcon = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mealOptions.setBackground(new java.awt.Color(0, 0, 0));
        mealOptions.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        mealOptions.setForeground(new java.awt.Color(255, 255, 255));
        mealOptions.setText("Meal Menu");
        mealOptions.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mealOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mealOptionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mealOptionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mealOptionsMouseExited(evt);
            }
        });
        mealOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealOptionsActionPerformed(evt);
            }
        });
        jPanel1.add(mealOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 320, 35));

        orderList.setBackground(new java.awt.Color(0, 0, 0));
        orderList.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        orderList.setForeground(new java.awt.Color(255, 255, 255));
        orderList.setText("View my orders");
        orderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderListMouseExited(evt);
            }
        });
        jPanel1.add(orderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 320, 35));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 260, 50));

        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText("User Dashboard");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 400, -1));

        button6.setBackground(new java.awt.Color(0, 0, 0));
        button6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("View Inventory Items");
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
        });
        jPanel1.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 320, 35));

        profileSOptions.setBackground(new java.awt.Color(0, 0, 0));

        updateProfile.setBackground(new java.awt.Color(0, 0, 0));
        updateProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updateProfile.setForeground(new java.awt.Color(255, 255, 255));
        updateProfile.setText("           Update profile");
        updateProfile.setOpaque(true);
        updateProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateProfileMouseExited(evt);
            }
        });

        changePassword.setBackground(new java.awt.Color(0, 0, 0));
        changePassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        changePassword.setForeground(new java.awt.Color(255, 255, 255));
        changePassword.setText("         Change Password");
        changePassword.setOpaque(true);
        changePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePasswordMouseExited(evt);
            }
        });

        deleteAccount.setBackground(new java.awt.Color(0, 0, 0));
        deleteAccount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteAccount.setForeground(new java.awt.Color(255, 255, 255));
        deleteAccount.setText("        Delete My Account");
        deleteAccount.setOpaque(true);
        deleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteAccountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout profileSOptionsLayout = new javax.swing.GroupLayout(profileSOptions);
        profileSOptions.setLayout(profileSOptionsLayout);
        profileSOptionsLayout.setHorizontalGroup(
            profileSOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileSOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(profileSOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(deleteAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addContainerGap())
        );
        profileSOptionsLayout.setVerticalGroup(
            profileSOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileSOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(profileSOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 220, 130));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeicon.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        cartIcon.setBackground(new java.awt.Color(255, 204, 204));
        cartIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crt (2).png"))); // NOI18N
        cartIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartIconMouseExited(evt);
            }
        });

        profileSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Webp.net-resizeimage (1).png"))); // NOI18N
        profileSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileSettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileSettingsMouseExited(evt);
            }
        });

        buyListIcon.setBackground(new java.awt.Color(255, 204, 204));
        buyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buy.png"))); // NOI18N
        buyListIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyListIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buyListIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buyListIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 772, Short.MAX_VALUE)
                .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student_wallpaper.jpg"))); // NOI18N
        img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMouseClicked(evt);
            }
        });
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mealOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealOptionsMouseClicked
        ViewMeals mealList=new ViewMeals();
        mealList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mealOptionsMouseClicked

    private void mealOptionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealOptionsMouseEntered
        mealOptions.setBackground(Color.white);
        mealOptions.setForeground(Color.black);
    }//GEN-LAST:event_mealOptionsMouseEntered

    private void mealOptionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealOptionsMouseExited
        mealOptions.setBackground(Color.black);
        mealOptions.setForeground(Color.white);
    }//GEN-LAST:event_mealOptionsMouseExited

    private void mealOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mealOptionsActionPerformed

    private void orderListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListMouseEntered
        orderList.setBackground(Color.white);
        orderList.setForeground(Color.black);
    }//GEN-LAST:event_orderListMouseEntered

    private void orderListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListMouseExited
        orderList.setBackground(Color.black);
        orderList.setForeground(Color.white);
    }//GEN-LAST:event_orderListMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void profileSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileSettingsMouseClicked
        profileSOptions.setVisible(true);
    }//GEN-LAST:event_profileSettingsMouseClicked

    private void profileSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileSettingsMouseEntered
        profileSOptions.setVisible(false);
    }//GEN-LAST:event_profileSettingsMouseEntered

    private void profileSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileSettingsMouseExited
        //profileSOptions.setVisible(false);
    }//GEN-LAST:event_profileSettingsMouseExited

    private void updateProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProfileMouseClicked
        UpdateUserProfile updateUserProfile=new UpdateUserProfile();
        updateUserProfile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateProfileMouseClicked

    private void updateProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProfileMouseEntered
        updateProfile.setBackground(Color.white);
        updateProfile.setForeground(Color.black);
    }//GEN-LAST:event_updateProfileMouseEntered

    private void updateProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProfileMouseExited
        updateProfile.setBackground(Color.black);
        updateProfile.setForeground(Color.white);
    }//GEN-LAST:event_updateProfileMouseExited

    private void changePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordMouseEntered
        changePassword.setBackground(Color.white);
        changePassword.setForeground(Color.black);
    }//GEN-LAST:event_changePasswordMouseEntered

    private void changePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordMouseExited
        changePassword.setBackground(Color.black);
        changePassword.setForeground(Color.white);
    }//GEN-LAST:event_changePasswordMouseExited

    private void imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMouseClicked
        profileSOptions.setVisible(false);
    }//GEN-LAST:event_imgMouseClicked

    private void changePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordMouseClicked
        ChangePssword pwd=new ChangePssword();
        pwd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changePasswordMouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        ViewItems view=new ViewItems();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button6MouseClicked

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_button6MouseEntered

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_button6MouseExited

    private void cartIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartIconMouseClicked
         MyCart myCart=new MyCart();
         myCart.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_cartIconMouseClicked

    private void cartIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartIconMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cartIconMouseEntered

    private void cartIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartIconMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cartIconMouseExited

    private void buyListIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyListIconMouseClicked
        ViewBuyingList viewBuyingList=new ViewBuyingList();
        viewBuyingList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buyListIconMouseClicked

    private void buyListIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyListIconMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buyListIconMouseEntered

    private void buyListIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyListIconMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buyListIconMouseExited

    private void orderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListMouseClicked
        ViewOrders viewOrders=new ViewOrders();
        viewOrders.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderListMouseClicked

    private void deleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountMouseClicked
        RemovingData removingData=new RemovingData();
        removingData.removeCustomer(Login.userID);
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteAccountMouseClicked

    private void deleteAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteAccountMouseEntered

    private void deleteAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteAccountMouseExited

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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button6;
    private javax.swing.JLabel buyListIcon;
    private javax.swing.JLabel cartIcon;
    private javax.swing.JLabel changePassword;
    private javax.swing.JLabel close;
    private javax.swing.JLabel deleteAccount;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logout;
    private javax.swing.JButton mealOptions;
    private javax.swing.JButton orderList;
    private javax.swing.JPanel profileSOptions;
    private javax.swing.JLabel profileSettings;
    private javax.swing.JLabel title;
    private javax.swing.JLabel updateProfile;
    // End of variables declaration//GEN-END:variables
}