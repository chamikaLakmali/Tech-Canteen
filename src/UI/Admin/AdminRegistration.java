/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Email.SendEmails;
import HybernetSession.HybernetSessionFctory;
import Pojos.Admin;
import UI.Login;
import java.awt.Color;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chamika
 */
public class AdminRegistration extends javax.swing.JFrame {
    int status=1;
    int mailstat=1;
    /**
     * Creates new form AdminRegistration
     */
    public AdminRegistration() {
        initComponents();
        filldefaultData();
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
        title = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText("Admin Registration");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 440, -1));

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl1.setText("Admin ID                ");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 170, 30));

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl2.setText("Name                    ");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 170, 20));

        lbl4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl4.setText("Phone Number      ");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        lbl5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl5.setText("Email                     ");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 170, 20));

        lbl6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl6.setText("Password                ");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 180, -1));

        id.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 320, -1));

        name.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 320, -1));

        phone.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phoneMouseExited(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 320, -1));

        email.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 320, -1));

        password.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 320, -1));

        register.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        register.setText("Register");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        error.setBackground(new java.awt.Color(255, 0, 51));
        error.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 460, 30));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 883, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stafreg.jpg"))); // NOI18N
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

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminDashboard admin=new AdminDashboard();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        char [] pass=password.getPassword();
        String pwrd;
        pwrd = ("" + new String(pass));
        error.setForeground(Color.red);
        String mailAddress=email.getText();
        if (id.getText().equals("") || name.getText().equals("") || phone.getText().equals("") || email.getText().equals("") || password.getPassword().equals("") || phone.getText().equals("Please enter in this format :XXX-XXXXXXX")){
//            error.setForeground(Color.red);
            error.setText("Please fill all the fields..");
        }
        else{
            String phonePatter="\\d{3}-\\d{7}"; // pattern for phone number
            String emailPattern="[a-zA-Z].[\\w\\W]*\\.[a-zA-Z]{1,3}"; //pattern for email
            if (Pattern.compile(phonePatter).matcher(phone.getText()).matches()) { //validating phone number
                error.setText("");
                if (Pattern.compile(emailPattern).matcher(email.getText()).matches()) { // validating email address
                    Session session1=HybernetSessionFctory.getSessionFactory().openSession();
                    Transaction t2=session1.beginTransaction();

                    String sql="FROM Admin";
                    Query query=session1.createQuery(sql);
//
                    java.util.List <Admin>adminList=query.list();
                    for(Iterator<Admin> adminIterator=adminList.iterator();adminIterator.hasNext();){
                        Admin admin=adminIterator.next();
                        if (admin.getAdminId().equals(id.getText())){
                            status=0;
                        }
                        if(admin.getEmail().equals(email.getText())){
                            mailstat=0;
                        }
                       
                    }
                    
                    if (status==1){
                        if (mailstat==1){
                            
                        
                            Admin admin=new Admin();
                            admin.setAdminId(id.getText());
                            admin.setName(name.getText());
                            admin.setEmail(email.getText());
                            admin.setTele(phone.getText());
                            admin.setPassword(pwrd);
                            session1.save(admin);
                            session1.getTransaction().commit();

                            SendEmails email=new SendEmails();
                            email.sendEmailToAdmin(mailAddress);
                            
                            JOptionPane.showMessageDialog(null, "Admin Added Successfully..", "Successful", JOptionPane.INFORMATION_MESSAGE);

                            AdminDashboard adminDashboard=new AdminDashboard();
                            adminDashboard.setVisible(true);
                            this.dispose();
                        }
                        else{
                            error.setText("This email has already been used in the system..");
                        }
                    }
                    else{
                        error.setText("Admin Id already exists..");
                    }
                }
                else{
                    error.setText("Invalid email address..");
                }
            }
            else{
                error.setText("Invalid phone number..");
            }
        }
    }//GEN-LAST:event_registerMouseClicked

    private void phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseClicked
        phone.setText("");
    }//GEN-LAST:event_phoneMouseClicked

    private void phoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseExited
        
    }//GEN-LAST:event_phoneMouseExited

    public void filldefaultData(){
        phone.setText("Please enter in this format :XXX-XXXXXXX");
    }
   
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
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JTextField email;
    private javax.swing.JLabel error;
    private javax.swing.JTextField id;
    private javax.swing.JLabel img;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton register;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}