/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import CommonTasks.RemovingData;
import UI.User.MyCart;
import CommonTasks.AddToCart;
import HybernetSession.HybernetSessionFctory;
import Pojos.Meals;

import UI.Admin.AdminDashboard;
import CommonTasks.AddItemToBuyList;
import HybernetSession.HybernetSessionFctoryUser;
import UI.User.AddOrders;
import UI.User.UserDashboard;
import UI.User.ViewBuyingList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chamika
 */
public class ViewMeals extends javax.swing.JFrame {
    int MealID;
    int height=60;
    /**
     * Creates new form NewJFrame
     */
    public ViewMeals() {
        initComponents();
        if(Login.userType.equals("admin")){
            cartIcn.setVisible(false);
            buyListIcon.setVisible(false);
            
        }
        else if(Login.userType.equals("user")){
            cartIcn.setVisible(true);
            buyListIcon.setVisible(true);
        }
        showAllMeals();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        mtype = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        cartIcn = new javax.swing.JLabel();
        buyListIcon = new javax.swing.JLabel();
        imgLayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(background);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 930, 340));

        mtype.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Breakfast", "Lunch", "Dinner", "Tea Time" }));
        mtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtypeActionPerformed(evt);
            }
        });
        jPanel1.add(mtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 270, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Meals List ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 320, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("  Filter Options");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 140, 30));

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 30, 30));

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

        cartIcn.setBackground(new java.awt.Color(255, 204, 204));
        cartIcn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crt (2).png"))); // NOI18N
        cartIcn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartIcnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartIcnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartIcnMouseExited(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 809, Short.MAX_VALUE)
                .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartIcn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cartIcn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

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

    private void mtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtypeActionPerformed
        if (mtype.getSelectedIndex()==0){
            showAllMeals();
        }
        else{
            showMealsAcType(mtype.getSelectedItem().toString());
        }
    }//GEN-LAST:event_mtypeActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (Login.userType.equals("admin")){
            AdminDashboard adminDashboard=new AdminDashboard();
            adminDashboard.setVisible(true);
            this.dispose();
        }
        else if (Login.userType.equals("user")){
            UserDashboard userDashboard=new UserDashboard();
            userDashboard.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_backMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        mtype.setSelectedIndex(0);
        showAllMeals();
    }//GEN-LAST:event_resetMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void cartIcnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartIcnMouseClicked
        MyCart myCart=new MyCart();
        myCart.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cartIcnMouseClicked

    private void cartIcnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartIcnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cartIcnMouseEntered

    private void cartIcnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartIcnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cartIcnMouseExited

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
            java.util.logging.Logger.getLogger(ViewMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMeals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMeals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel buyListIcon;
    private javax.swing.JLabel cartIcn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel imgLayer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> mtype;
    private javax.swing.JLabel reset;
    // End of variables declaration//GEN-END:variables

     private void showAllMeals() {
        
        background.removeAll();
        height=60;
        
        setTitle();
        Session session;
        if (Login.userType.equals("user")){
            session=HybernetSessionFctoryUser.getSessionFactory().openSession();
        }
        else{
            session=HybernetSessionFctory.getSessionFactory().openSession();
        }
        final AtomicReference<ResultSet> items=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call getMealList ()}" )){
                
                
                cst.execute();
                items.set(cst.getResultSet());
                
                try(ResultSet rs =cst.getResultSet()){
                    while(rs.next()){
                        

                        JPanel addPanal = new JPanel();
                        JLabel mName = new JLabel();
                        JLabel mPrice = new JLabel();
                        JLabel mAvailability = new JLabel();
                        JLabel mID=new JLabel();
                        JButton more = new JButton();
                        JButton addToCart = new JButton();
                        JButton order = new JButton();
                        JButton edit = new JButton();
                        JButton delete = new JButton();
                        JButton addToBuyList = new JButton();

                        addPanal.setBackground(new java.awt.Color(102,204,255));
                        //addPanal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
                        addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        mName.setBackground(new java.awt.Color(204, 255, 255));
                        mName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        //itmName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                        mName.setOpaque(true);


                        mPrice.setBackground(new java.awt.Color(204, 255, 255));
                        mPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                       // itmPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                        mPrice.setOpaque(true);


                        mAvailability.setBackground(new java.awt.Color(204, 255, 255));
                        mAvailability.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        mAvailability.setOpaque(true);


                        more.setBackground(new java.awt.Color(204, 255, 255));
                        more.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                        more.setText("More Info>>");
                        
                        addToCart.setBackground(new java.awt.Color(255, 255, 255));
                        addToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N


                        order.setBackground(new java.awt.Color(255, 255, 255));
                        order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order.png"))); // NOI18N

                        edit.setBackground(new java.awt.Color(255, 255, 255));
                        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.jpg"))); // NOI18N

                        delete.setBackground(new java.awt.Color(255, 255, 255));
                        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
                        
                        addToBuyList.setBackground(new java.awt.Color(255, 255, 255));
                        addToBuyList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buy.png"))); // NOI18N
               
                     
                           
                        mID.setText(rs.getString("id"));
                        mName.setText(rs.getString("foodName"));
                        mPrice.setText(rs.getString("price"));
                        mAvailability.setText(rs.getString("availability"));
                        
                        more.addMouseListener(new MouseAdapter() {                                
                            @Override
                            public void mouseClicked(MouseEvent e){
                                MealID=Integer.parseInt(mID.getText());
                                
                                MealDescription updateMeals=new MealDescription(MealID,"m");
                                updateMeals.setVisible(true);
                                FrameDispose();
                                
                            }
                        });
                        
                        edit.addMouseListener(new MouseAdapter() {                                
                            @Override
                            public void mouseClicked(MouseEvent e){
                                MealID=Integer.parseInt(mID.getText());
                                MealDescription updateMeals=new MealDescription(MealID);
                                updateMeals.setVisible(true);
                                FrameDispose();
                            }
                        });

                        delete.addMouseListener(new MouseAdapter() {                                
                            @Override
                            public void mouseClicked(MouseEvent e){
                                MealID=Integer.parseInt(mID.getText());
                                RemovingData removingData=new RemovingData();
                                removingData.deleteMeal(MealID);
                                mtype.setSelectedIndex(0);
                                showAllMeals();
                            }
                        });
                        
                        addToCart.addMouseListener(new MouseAdapter() {                                
                                @Override
                                public void mouseClicked(MouseEvent e){
                                    MealID=Integer.parseInt(mID.getText());
                                    JFrame frame=new JFrame();
                                    
                                    String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");
                                    
                                    if(in!=null){
                                        int amnt=Integer.parseInt(in);
                                        AddToCart.addToCart(MealID,amnt,"m");
                                        MyCart cart=new MyCart();
                                        cart.setVisible(true);
                                        FrameDispose();
                                    }

                                }
                        });
                        
                        addToBuyList.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                     
                                    if(mAvailability.getText().equals("Not Available")){
                                        JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
                                        
                                    }                                    
                                    else if(mAvailability.getText().equals("Available")){
                                        MealID=Integer.parseInt(mID.getText());
                                        JFrame frame=new JFrame();
                                    
                                        String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");

                                        if(in!=null){
                                            int amnt=Integer.parseInt(in);
                                            AddItemToBuyList addItemToBuyList=new AddItemToBuyList();
                                            addItemToBuyList.addToBuyList(MealID,Float.parseFloat(mPrice.getText()), amnt, "m");
                                            ViewBuyingList bList=new ViewBuyingList();
                                            bList.setVisible(true);
                                            FrameDispose();
                                            
                                        }    
                                    }    
                                }
                        });
                        
                        order.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                     
                                    if(mAvailability.getText().equals("Not Available")){
                                        JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
                                        
                                    }                                    
                                    else if(mAvailability.getText().equals("Available")){
                                        MealID=Integer.parseInt(mID.getText());
                                        JFrame frame=new JFrame();
                                    
                                        String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");

                                        if(in!=null){
                                            
                                            int amnt=Integer.parseInt(in);
                                            AddOrders addOrders=new AddOrders(MealID, amnt, Float.parseFloat(mPrice.getText())* amnt, Float.parseFloat(mPrice.getText()),"m","m");
                                            addOrders.setVisible(true);
                                            FrameDispose();
                                            
                                        }    
                                    }    
                                }
                        });
   
                        addPanal.add(mName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));
                        addPanal.add(mPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 40));
                        addPanal.add(mAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 40));
                        addPanal.add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 180, 40));
                        
                        if (Login.userType.equals("admin")){
                            addPanal.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 40));
                            addPanal.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 40));
                        }

                        else if (Login.userType.equals("user")){
                            addPanal.add(addToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 40));
                            addPanal.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 40));
                            addPanal.add(addToBuyList, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 40, 40));
                        }
                        
                        background.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 910, 60));
                        height=height+55;
                        
                        background.setVisible(false);
                        background.setVisible(true);
                     
                        
                    }
                }
                catch (Exception ex) {
                    System.out.println(ex);
                    
                }                
            }
            catch (Exception e){
                System.out.println(e);
            }
        });
    }
     private void showMealsAcType(String mNmae) {
        height=60;
        background.removeAll();
        setTitle();
        Session session;
        if (Login.userType.equals("user")){
            session=HybernetSessionFctoryUser.getSessionFactory().openSession();
        }
        else{
            session=HybernetSessionFctory.getSessionFactory().openSession();
        }
        final AtomicReference<ResultSet> items=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call getMealListAcType (?)}" )){
               cst.setString(1, mNmae);
                
                cst.execute();
                items.set(cst.getResultSet());
                
                try(ResultSet rs =cst.getResultSet()){
                    if (rs.next()==false){
                        
                        background.removeAll();
                        background.setVisible(false);
                        background.setVisible(true);
                        mtype.setVisible(false);
                        mtype.setVisible(true);
                    }
                    else{
                        do{
                            JPanel addPanal = new JPanel();
                            JLabel mName = new JLabel();
                            JLabel mPrice = new JLabel();
                            JLabel mAvailability = new JLabel();
                            JLabel mID=new JLabel();
                            JButton more = new JButton();
                            JButton addToCart = new JButton();
                            JButton order = new JButton();
                            JButton edit = new JButton();
                            JButton delete = new JButton();
                            JButton addToBuyList = new JButton();

                            addPanal.setBackground(new java.awt.Color(102,204,255));
                            //addPanal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
                            addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            mName.setBackground(new java.awt.Color(204, 255, 255));
                            mName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            //itmName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            mName.setOpaque(true);


                            mPrice.setBackground(new java.awt.Color(204, 255, 255));
                            mPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                           // itmPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            mPrice.setOpaque(true);


                            mAvailability.setBackground(new java.awt.Color(204, 255, 255));
                            mAvailability.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            mAvailability.setOpaque(true);


                            more.setBackground(new java.awt.Color(204, 255, 255));
                            more.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            more.setText("More Info>>");
                            
                            addToCart.setBackground(new java.awt.Color(255, 255, 255));
                            addToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N


                            order.setBackground(new java.awt.Color(255, 255, 255));
                            order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order.png"))); // NOI18N
                            
                            edit.setBackground(new java.awt.Color(255, 255, 255));
                            edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.jpg"))); // NOI18N
                            
                            delete.setBackground(new java.awt.Color(255, 255, 255));
                            delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
                            
                            addToBuyList.setBackground(new java.awt.Color(255, 255, 255));
                            addToBuyList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buy.png"))); // NOI18N

                            mID.setText(rs.getString("id"));
                            mName.setText(rs.getString("foodName"));
                            mPrice.setText(rs.getString("price"));
                            mAvailability.setText(rs.getString("availability"));
                            
                            more.addMouseListener(new MouseAdapter() {                                
                                @Override
                                public void mouseClicked(MouseEvent e){
                                    MealID=Integer.parseInt(mID.getText());
                                    MealDescription updateMeals=new MealDescription(MealID,"m");
                                    updateMeals.setVisible(true);
                                    FrameDispose(); 
                                    
                                }
                            });
                            
                            edit.addMouseListener(new MouseAdapter() {                                
                                @Override
                                public void mouseClicked(MouseEvent e){
                                    MealID=Integer.parseInt(mID.getText());
                                    MealDescription updateMeals=new MealDescription(MealID);
                                    updateMeals.setVisible(true);
                                    FrameDispose();
                                }
                            });
                            
                            delete.addMouseListener(new MouseAdapter() {                                
                                @Override
                                public void mouseClicked(MouseEvent e){
                                    MealID=Integer.parseInt(mID.getText());
                                    RemovingData removingData=new RemovingData();
                                    removingData.deleteMeal(MealID);
                                    mtype.setSelectedIndex(0);
                                    showAllMeals();
                                    
                                }
                            });
                            
                            addToCart.addMouseListener(new MouseAdapter() {                                
                                @Override
                                public void mouseClicked(MouseEvent e){
                                    MealID=Integer.parseInt(mID.getText());
                                    JFrame frame=new JFrame();
                                    
                                    String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");
                                    
                                    if(in!=null){
                                        int amnt=Integer.parseInt(in);
                                        AddToCart.addToCart(MealID,amnt,"m");
                                        MyCart cart=new MyCart();
                                        cart.setVisible(true);
                                        FrameDispose();
                                    }

                                }
                            });
                            
                            addToBuyList.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                     
                                    if(mAvailability.getText().equals("Not Available")){
                                        JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
//                                         
                                    }
//                                     
                                    else if(mAvailability.getText().equals("Available")){
                                        MealID=Integer.parseInt(mID.getText());
                                        JFrame frame=new JFrame();
                                    
                                        String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");

                                        if(in!=null){
                                            int amnt=Integer.parseInt(in);
                                            AddItemToBuyList addItemToBuyList=new AddItemToBuyList();
                                            addItemToBuyList.addToBuyList(MealID,Float.parseFloat(mPrice.getText()), amnt, "m");
                                            ViewBuyingList bList=new ViewBuyingList();
                                            bList.setVisible(true);
                                            FrameDispose();
                                            
                                        }    
                                    }    
                                }
                            });
                            order.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                     
                                    if(mAvailability.getText().equals("Not Available")){
                                        JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
                                        
                                    }                                    
                                    else if(mAvailability.getText().equals("Available")){
                                        MealID=Integer.parseInt(mID.getText());
                                        JFrame frame=new JFrame();
                                    
                                        String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");

                                        if(in!=null){
                                            
                                            int amnt=Integer.parseInt(in);
                                            AddOrders addOrders=new AddOrders(MealID, amnt, Float.parseFloat(mPrice.getText())* amnt, Float.parseFloat(mPrice.getText()),"m","m");
                                            addOrders.setVisible(true);
                                            FrameDispose();
                                            
                                        }    
                                    }    
                                }
                            });
                            addPanal.add(mName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));
                            addPanal.add(mPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 40));
                            addPanal.add(mAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 40));
                            addPanal.add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 180, 40));

                            if (Login.userType.equals("admin")){
                                addPanal.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 40));
                                addPanal.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 40));
                            }

                            else if (Login.userType.equals("user")){
                                addPanal.add(addToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 40));
                                addPanal.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 40));
                                addPanal.add(addToBuyList, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 40, 40));
                            }

                            background.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 910, 60));
                            height=height+55;

                            background.setVisible(false);
                            background.setVisible(true);
                            
                        }while(rs.next());
                       
                    }
                       
                        
                    
                }
                catch (Exception ex) {
                    System.out.println(ex);
                    
                }                
            }
            catch (Exception e){
                System.out.println(e);
            }
        });
    }
     public void FrameDispose(){
         this.dispose();
     }

    public void setTitle(){
        JPanel titlePanal = new JPanel();
        JLabel titleItem1 = new JLabel();
        JLabel titleItem2 = new JLabel();
        JLabel titleItem3 = new JLabel();

        titlePanal.setBackground(new java.awt.Color(255, 255, 255));
        titlePanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleItem1.setBackground(new java.awt.Color(102, 204, 255));
        titleItem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem1.setText("                    Meal Name");
        titleItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titleItem1.setOpaque(true);
        titlePanal.add(titleItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));

        titleItem2.setBackground(new java.awt.Color(102, 204, 255));
        titleItem2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem2.setText("         Price");
        titleItem2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titleItem2.setOpaque(true);
        titlePanal.add(titleItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 40));

        titleItem3.setBackground(new java.awt.Color(102, 204, 255));
        titleItem3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem3.setText("    Availablity");
        titleItem3.setOpaque(true);
        titlePanal.add(titleItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, 40));

        background.add(titlePanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 910, 50));
    }
    

}
