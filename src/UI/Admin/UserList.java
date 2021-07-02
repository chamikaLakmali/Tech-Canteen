/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import CommonTasks.RemovingData;
import HybernetSession.HybernetSessionFctory;
import UI.Login;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.hibernate.Session;

/**
 *
 * @author Chamika
 */
public class UserList extends javax.swing.JFrame {

    int height=60;
    public UserList() {
        initComponents();
        fillCustomerInfo();
        fillAdmin();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        userType = new javax.swing.JComboBox<>();
        imgLayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(background);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 930, 350));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("User List");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 320, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 883, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        userType.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Types", "Admins", "Customers" }));
        userType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTypeMouseClicked(evt);
            }
        });
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });
        jPanel1.add(userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, -1));

        imgLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.jpeg"))); // NOI18N
        jPanel1.add(imgLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminDashboard adminDashboard=new AdminDashboard();
        adminDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void userTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTypeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userTypeMouseClicked

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
        if (userType.getSelectedIndex()==0){
            height=60;
            background.removeAll();
            fillCustomerInfo();
            fillAdmin();
        }
        else if (userType.getSelectedIndex()==1){
            height=60;
            background.removeAll();
            fillAdmin();
        }
        else if (userType.getSelectedIndex()==2){
            height=60;
            background.removeAll();
            fillCustomerInfo();
        }
    }//GEN-LAST:event_userTypeActionPerformed

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
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel imgLayer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables

    public void fillCustomerInfo(){
       // height=60;
        //background.removeAll();
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        final AtomicReference<ResultSet> itemTypes=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call getUserList()}" )){

                cst.execute();
                itemTypes.set(cst.getResultSet());
                try(ResultSet rs =cst.getResultSet()){
                    if(rs.next()!=false){
                        setTitle();
                        do{
                            
                            JPanel addPanal = new JPanel();
                            JLabel uname = new JLabel();
                            JLabel designation = new JLabel();
                            JLabel phone = new JLabel();
                            JLabel email = new JLabel();
                            JLabel delete = new JLabel();
                            JLabel uId = new JLabel();

                            
                            addPanal.setBackground(new java.awt.Color(102, 204, 255));
                            addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            uId.setText(rs.getString("reg_no"));
                            uname.setBackground(new java.awt.Color(204, 255, 255));
                            uname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            uname.setText(rs.getString("name"));
                            uname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            uname.setOpaque(true);


                            designation.setBackground(new java.awt.Color(204, 255, 255));
                            designation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            designation.setText("Customer");
                            designation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            designation.setOpaque(true);


                            phone.setBackground(new java.awt.Color(204, 255, 255));
                            phone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            phone.setText(rs.getString("tele"));
                            phone.setOpaque(true);


                            email.setBackground(new java.awt.Color(204, 255, 255));
                            email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            email.setText(rs.getString("email"));
                            email.setOpaque(true);


                            delete.setBackground(new java.awt.Color(204, 255, 255));
                            delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N

                            delete.setOpaque(true);
                            
                            delete.addMouseListener(new MouseAdapter() {                                
                                    @Override
                                    public void mouseClicked(MouseEvent e){

                                        RemovingData removeData=new RemovingData();
                                        removeData.removeCustomer(uId.getText());
                                        userType.setSelectedIndex(0);
                                        height=60;
                                        background.removeAll();
                                        fillCustomerInfo();
                                        fillAdmin();
                                        background.setVisible(false);
                                        background.setVisible(true);

                                    }
                                });


                            addPanal.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 40));
                            addPanal.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));
                            addPanal.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 150, 40));
                            addPanal.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 220, 40));
                            addPanal.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 35, 40));

                            background.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 910, 60));
                            height=height+60;
                            
                            
                            
                        }while(rs.next());
                    }
                    
                        
                    
                }   
            }
        });
        session.close();
        
    }
    
    public void fillAdmin(){
        //height=60;
       // background.removeAll();
       
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        final AtomicReference<ResultSet> itemTypes=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call getAdminList()}" )){

                cst.execute();
                itemTypes.set(cst.getResultSet());
                try(ResultSet rs =cst.getResultSet()){
                    if(rs.next()!=false){
                        setTitle();
                        do{
                            if (!(Login.userID.equals(rs.getString("adminID")))){
  
                            
                                JPanel addPanal = new JPanel();
                                JLabel uname = new JLabel();
                                JLabel designation = new JLabel();
                                JLabel phone = new JLabel();
                                JLabel email = new JLabel();
                                JLabel delete = new JLabel();
                                JLabel uID = new JLabel();

                                addPanal.setBackground(new java.awt.Color(102, 204, 255));
                                addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                                uname.setBackground(new java.awt.Color(204, 255, 255));
                                uname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                                uname.setText(rs.getString("name"));
                                uname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                                uname.setOpaque(true);
                                
                                uID.setText(rs.getString("adminID"));


                                designation.setBackground(new java.awt.Color(204, 255, 255));
                                designation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                                designation.setText("Admin");
                                designation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                                designation.setOpaque(true);


                                phone.setBackground(new java.awt.Color(204, 255, 255));
                                phone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                                phone.setText(rs.getString("tele"));
                                phone.setOpaque(true);


                                email.setBackground(new java.awt.Color(204, 255, 255));
                                email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                                email.setText(rs.getString("email"));
                                email.setOpaque(true);


                                delete.setBackground(new java.awt.Color(204, 255, 255));
                                delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                                delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N

                                delete.setOpaque(true);
                                
                                delete.addMouseListener(new MouseAdapter() {                                
                                    @Override
                                    public void mouseClicked(MouseEvent e){

                                        RemovingData removeData=new RemovingData();
                                        removeData.removeAdmin(uID.getText());
                                        userType.setSelectedIndex(0);
                                        height=60;
                                        background.removeAll();
                                        fillCustomerInfo();
                                        fillAdmin();
                                        background.setVisible(false);
                                        background.setVisible(true);

                                    }
                                });

                                addPanal.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 40));
                                addPanal.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));
                                addPanal.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 150, 40));
                                addPanal.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 220, 40));
                                addPanal.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 35, 40));

                                background.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 910, 60));
                                height=height+60;
                            }
                            
                        }while(rs.next());
                    }
                    
                        
                    
                }   
            }
        });
        session.close();
        
        
    }
    
    public void setTitle(){
        JPanel titlePanal = new JPanel();
        JLabel titleItem1 = new JLabel();
        JLabel titleItem2 = new JLabel();
        JLabel titleItem3 = new JLabel();
        JLabel titleItem4 = new JLabel();
        

        titlePanal.setBackground(new java.awt.Color(255, 255, 255));
        titlePanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleItem1.setBackground(new java.awt.Color(102, 204, 255));
        titleItem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem1.setText("                    User Name");
        titleItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titleItem1.setOpaque(true);
        titlePanal.add(titleItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));

        titleItem2.setBackground(new java.awt.Color(102, 204, 255));
        titleItem2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem2.setText("  Designation");
        titleItem2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titleItem2.setOpaque(true);
        titlePanal.add(titleItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 40));

        titleItem3.setBackground(new java.awt.Color(102, 204, 255));
        titleItem3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem3.setText(" Phone Number");
        titleItem3.setOpaque(true);
        titlePanal.add(titleItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 150, 40));
        
        titleItem4.setBackground(new java.awt.Color(102, 204, 255));
        titleItem4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem4.setText(" Email");
        titleItem4.setOpaque(true);
        titlePanal.add(titleItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 220, 40));
        
        

        background.add(titlePanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 910, 50));
    }
}
