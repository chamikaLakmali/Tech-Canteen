/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.User;

import CommonTasks.RemovingData;
import CommonTasks.RetrieveData;
import CommonTasks.UpdateData;
import HybernetSession.HybernetSessionFctory;
import HybernetSession.HybernetSessionFctoryUser;
import Pojos.Buylist;
import Pojos.Item;
import Pojos.Meals;
import UI.Login;
import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chamika
 */
public class ViewBuyingList extends javax.swing.JFrame {

    int height=60,orderedQuantity,iId,stat;
    String iName,iAvailability;
    RetrieveData retrieveData=new RetrieveData();
    RemovingData removingData=new RemovingData();
    UpdateData updateData=new UpdateData();
    public ViewBuyingList() {
        initComponents();
        if(Login.userType.equals("admin")){
            cartIcn.setVisible(false);
        }
        else if(Login.userType.equals("user")){
            cartIcn.setVisible(true);
        }
        setTitle();
        fill();
    }

    
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
        cartIcn = new javax.swing.JLabel();
        orderAll = new javax.swing.JButton();
        imgLayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(background);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 930, 330));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Buying List");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 846, Short.MAX_VALUE)
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
                .addComponent(cartIcn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        orderAll.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        orderAll.setText("Buy All");
        orderAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderAllMouseClicked(evt);
            }
        });
        orderAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderAllActionPerformed(evt);
            }
        });
        jPanel1.add(orderAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

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
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.setVisible(true);
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

    private void orderAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderAllActionPerformed

    private void orderAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderAllMouseClicked
        buyAll();
        
    }//GEN-LAST:event_orderAllMouseClicked

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
            java.util.logging.Logger.getLogger(ViewBuyingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBuyingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBuyingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBuyingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBuyingList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel cartIcn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel imgLayer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JButton orderAll;
    // End of variables declaration//GEN-END:variables
    public void setTitle(){
        JPanel titlePanal = new JPanel();
        JLabel titleItem1 = new JLabel();
        JLabel titleItem2 = new JLabel();
        JLabel titleItem3 = new JLabel();

        titlePanal.setBackground(new java.awt.Color(255, 255, 255));
        titlePanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleItem1.setBackground(new java.awt.Color(102, 204, 255));
        titleItem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem1.setText("                   Item Name");
        titleItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titleItem1.setOpaque(true);
        titlePanal.add(titleItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));

        titleItem2.setBackground(new java.awt.Color(102, 204, 255));
        titleItem2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem2.setText("    Price");
        titleItem2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titleItem2.setOpaque(true);
        titlePanal.add(titleItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 40));

        titleItem3.setBackground(new java.awt.Color(102, 204, 255));
        titleItem3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleItem3.setText("              Quantity");
        titleItem3.setOpaque(true);
        titlePanal.add(titleItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 240, 40));

        background.add(titlePanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 910, 50));
    }
    
    public void fill(){
        height=60;
        background.removeAll();
        setTitle();
        Session lsession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        AtomicReference<ResultSet> bList=new AtomicReference<>();
        
        lsession.doWork(connection ->{
            try (CallableStatement cst=connection.prepareCall("{call viewMyBuyList(?) }")){
                cst.setString(1, Login.userID);
                
                cst.execute();
                
                try (ResultSet rs=cst.getResultSet()) {
                    if (rs.next()==false){
                        System.out.println("no data");
                    }
                    else{
                        do{
                            if (rs.getString("type").equals("i")){
                                getItemData(rs.getInt("itmId"));
                            }
                            
                            else if (rs.getString("type").equals("m")){
                                getMealData(rs.getInt("itmId"));
                            }
                            orderedQuantity=rs.getInt("quantity");
                           
                            JPanel addPanal = new JPanel();
                            JLabel Name = new JLabel();
                            JLabel Price = new JLabel();
                            JLabel quantity = new JLabel();
                            JLabel mID=new JLabel();
                            JButton more = new JButton();
                            JButton addToCart = new JButton();
                            JButton order = new JButton();
                            JButton edit = new JButton();
                            JButton delete = new JButton();
                            JLabel plus = new JLabel();
                            JLabel minus = new JLabel();
                            JLabel cId=new JLabel();
                            JLabel avail=new JLabel();

                            addPanal.setBackground(new java.awt.Color(102,204,255));
                            
                            addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            cId.setText(rs.getString("id"));
                            avail.setText(iAvailability);
                            Name.setBackground(new java.awt.Color(204, 255, 255));
                            Name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            
                            Name.setText(iName);
                            //itmName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            Name.setOpaque(true);


                            Price.setBackground(new java.awt.Color(204, 255, 255));
                            Price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            Price.setText(rs.getString("price"));
                           // itmPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            Price.setOpaque(true);


                            quantity.setBackground(new java.awt.Color(204, 255, 255));
                            quantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            quantity.setText(rs.getString("quantity"));
                            quantity.setOpaque(true);

                            plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
                            minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N

                            order.setBackground(new java.awt.Color(255, 255, 255));
                            order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order.png"))); // NOI18N

                            edit.setBackground(new java.awt.Color(255, 255, 255));
                            edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.jpg"))); // NOI18N
                            
                            delete.setBackground(new java.awt.Color(255, 255, 255));
                            delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
                            
                            if (iAvailability.equals("Not Available")){
                                addPanal.setBackground(Color.red);
                            }
                            else if (iAvailability.equals("Available")){
                                addPanal.setBackground(new java.awt.Color(102,204,255));
                            }
                            
                            plus.addMouseListener(new java.awt.event.MouseAdapter() {
                                @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    String q=quantity.getText();
                                    int qu=Integer.parseInt(q);                                  
                                    qu=qu+1;
                                    q=String.valueOf(qu);
                                    quantity.setText(q);      
                                }
                            });
                            
                            minus.addMouseListener(new java.awt.event.MouseAdapter() {
                                @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    String q=quantity.getText();
                                    int qu=Integer.parseInt(q);
                                    if (qu!=1){
                                       qu=qu-1;
                                       q=String.valueOf(qu);
                                       quantity.setText(q);
                                    }
                                }
                            });
                            
                            delete.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    
                                    int id=Integer.parseInt(cId.getText());
                                    removingData.removefromBuyList(id);  
                                }
                            });
                            edit.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    
                                    int id=Integer.parseInt(cId.getText());
                                    updateData.updateBuyList(id,quantity.getText()); 
                                    JOptionPane.showMessageDialog(null, "Buying quantity has Updated ", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                    fill();
                                    
                                }
                            });
                            int oid=rs.getInt(3);
                            int oQuantity=rs.getInt("quantity");
                            float osubtot=rs.getFloat("subTotal");
                            float uprice=rs.getFloat("price");
                            String t=rs.getString("type");
                            
                            order.addMouseListener(new java.awt.event.MouseAdapter() {
                                @Override
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    
                                    if (avail.getText().equals("Not Available")){
                                        JOptionPane.showMessageDialog(null, "This item/ quantity you ordered is not available at this moment.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                    else{
                                        int id=Integer.parseInt(cId.getText());
                                       
                                        AddOrders addOrders=new AddOrders(oid,oQuantity,osubtot,uprice,t,"b");
                                        removingData.removefromBuyList(id);  
                                        addOrders.setVisible(true);
                                        FrameDispose();
                                    }
                                    
                                }
                            });
                            


                            addPanal.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));
                            addPanal.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 40));
                            addPanal.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 40, 40));
                            addPanal.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 150, 40));
                            addPanal.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 40, 40));

                            addPanal.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 40, 40));
                            addPanal.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 40));
                            addPanal.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 40));

                            background.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10,height , 910, 60));
                            height=height+70;
                            
                        }while (rs.next());
                    }
                }
            } catch (Exception e) {
                System.out.println("error occure "+e);
            }
        });
        
        background.setVisible(false);
        background.setVisible(true);
   
        
    }
    
    public void getItemData(int itmId){
        Session session=HybernetSessionFctoryUser.getSessionFactory().openSession();
        final AtomicReference<ResultSet> itemTypes=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call getItem(?)}" )){
                
                cst.setInt(1, itmId);
                cst.execute();
                itemTypes.set(cst.getResultSet());
                
                try(ResultSet rs =cst.getResultSet()){
                    while(rs.next()){
                        iName=rs.getString("name");
                        
                        int availableQuantity=rs.getInt("count");
                        
                        if (availableQuantity==0 || orderedQuantity > availableQuantity){
                            iAvailability="Not Available";
                            
                        }
                        
                        else{
                          iAvailability="Available";  
                        }
                        
                    }
                }
                catch (Exception ex) {
                    System.out.println("e3:"+ex);
                    
                }                
            }
            catch (Exception e){
                System.out.println("e4:"+e);
            }
        });
    
        
    }
    
    public void getMealData(int mealId){
    
        Session session=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        
        String sql="FROM Meals";
        Query query=session.createQuery(sql);
        java.util.List <Meals>mealsList=query.list();
        
        for (Iterator<Meals> mealsIterator=mealsList.iterator();mealsIterator.hasNext();){
           
            Meals meal=mealsIterator.next();

            if (meal.getId()== mealId){
                iName=meal.getFoodName();
               

               
                iAvailability=meal.getAvailability();
//                 
            }
        }
    }
    

    public void FrameDispose(){
        this.dispose();
    }
    
    
    
    
    public void buyAll(){

        Session bSession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction bt=bSession.beginTransaction();
        
        String bsql="From Buylist";
        Query bquery=bSession.createQuery(bsql);
        
        List<Buylist> bList=bquery.list();
        for (Iterator<Buylist> bIterator=bList.iterator();bIterator.hasNext();){
            Buylist b=bIterator.next();
            
            if(b.getUserId().equals(Login.userID)){
                if (b.getType().equals("i")){
                    stat=retrieveData.getItemAvailability(b.getItmId(), b.getQuantity());
                    if(stat==0){  
                        break;    
                    }
                }else if (b.getType().equals("m")){
                    stat=retrieveData.getMealAvailability(b.getItmId());
                    if(stat==0){
                        break;    
                    }               
                } 
            }
            
                        
        }
        
        if(stat==1){
            AddOrders addOrders=new AddOrders("m");
            addOrders.setVisible(true);
            this.dispose();
            
        }
        else if(stat==0){
            JOptionPane.showMessageDialog(null, "Sorry..! Some items you have ordered are not available.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
