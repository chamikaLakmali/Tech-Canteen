/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.User;

import CommonTasks.AddItemToBuyList;
import HybernetSession.HybernetSessionFctory;
import Pojos.Buylist;
import Pojos.Cart;
import Pojos.Meals;
import UI.ItemDescriptions;
import UI.Login;
import UI.MealDescription;
import CommonTasks.RemovingData;
import CommonTasks.UpdateData;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class MyCart extends javax.swing.JFrame {

    int height=10;
    String iName,iAvailability,i;
    int iPrice,orderedQuantity,totalPrice=0,id;
    ImageIcon imge;
            
    
    public MyCart() {
        initComponents();
        fill();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        buyListIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        background = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        backgroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Cart");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 190, -1));

        back.setBackground(new java.awt.Color(255, 204, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

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
                .addGap(0, 846, Short.MAX_VALUE)
                .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(background);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 930, 310));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Buy Cart");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Value of the Cart :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 210, -1));

        total.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        total.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 190, 30));

        backgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mealsbackground.jpg"))); // NOI18N
        jPanel1.add(backgroundImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

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
        UserDashboard dashboard=new UserDashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered

    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited

    }//GEN-LAST:event_backMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel backgroundImg;
    private javax.swing.ButtonGroup btn;
    private javax.swing.JLabel buyListIcon;
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

    
    public void fill(){
        height=10;
        background.removeAll();
        totalPrice=0;
        iPrice=0;
        
        
        
        Session csession = HybernetSessionFctory.getSessionFactory().openSession();
        final AtomicReference<ResultSet> cartSet= new AtomicReference<>();
        csession.doWork(connection -> {
            try (CallableStatement cst=connection.prepareCall(" { call viewMyCart(?) }")) {
                cst.setString(1, Login.userID);
                cst.execute();
                
                try (ResultSet rs=cst.getResultSet()) {
                    if (rs.next()==false){
                        // empty cart
                    }
                    else{
                        do{
    
                            orderedQuantity=rs.getInt("count");
                            
                            JPanel addPanal = new JPanel();
                            JLabel img = new JLabel();
                            JLabel jLabelName = new JLabel();
                            JLabel jLabelAvailability = new JLabel();
                            JLabel jLabelQuantity = new JLabel();
                            JButton more = new JButton();
                            JButton order = new JButton();
                            JButton update = new JButton();
                            JButton remove = new JButton();
                            JLabel quantity = new JLabel();
                            JLabel itmname = new JLabel();
                            JLabel availability = new JLabel();
                            JLabel increment = new JLabel();
                            JLabel decrement = new JLabel();
                            JLabel itmprice=new JLabel();
                            JLabel jLabelPrice=new JLabel();
                            JLabel cId=new JLabel();
                            JButton buyL=new JButton();
                           // 51, 204, 255
                            addPanal.setBackground(new java.awt.Color(204,255,255));
                            
                            addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                            img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                            


                            jLabelName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            jLabelName.setText("Item Name       :");
                            
                           
                            addPanal.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 140, 30));

                            jLabelAvailability.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
                            jLabelAvailability.setText("Availability           :");
                           


                            jLabelQuantity.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
                            jLabelQuantity.setText("Ordered quantity  : ");
                           
                            
                            jLabelPrice.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
                            jLabelPrice.setText("Unit Price              : ");
                         


                            more.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            more.setText("More >>");
                            
                            update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            update.setText("Update");

                            order.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            order.setText("Order");


                            remove.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            remove.setText("Remove");
                            
                            buyL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            buyL.setText("+ Buy List");


                            quantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                            quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));


                            itmname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                            itmprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));


                            availability.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));


                            increment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
                            increment.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    String q=quantity.getText();
                                    int qu=Integer.parseInt(q);                                  
                                    qu=qu+1;
                                    q=String.valueOf(qu);
                                    quantity.setText(q);      
                                }
                            });


                            decrement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus.png"))); // NOI18N
                            decrement.addMouseListener(new java.awt.event.MouseAdapter() {
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
                            
                            // get data from meal or item tables
                            id=rs.getInt("id");
                            i=String.valueOf(id);
                            cId.setText(i);  
                            if (rs.getString("type").equals("i")){
                                
                                getItemData(rs.getInt("itemId"));
                               
                            }
                            else if (rs.getString("type").equals("m")){
                                
                                getMealData(rs.getInt("itemId"));
                                
                                
                            }
                            String type=rs.getString("type");
                            
                            // setting values for labels
                            itmname.setText(iName);
                            String p=String.valueOf(iPrice);
                            itmprice.setText(p);
                            
                            // setting image
                            if (img!=null){
                                img.setIcon(imge);
                            }
                            
                            // changing the font color according to the availability
                            if (iAvailability.equals("Not Available")){
                                availability.setForeground(Color.red);
                            }
                            else{
                                availability.setForeground(Color.black); 
                            }
                            availability.setText(iAvailability);
                            totalPrice=totalPrice+(iPrice*orderedQuantity);
                            
                            String pr=String.valueOf(totalPrice);
                            total.setText("Rs: " +pr +".00");
                            
                            String quan=String.valueOf(rs.getInt("count"));
                            quantity.setText(quan);
                            
                          
                            remove.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                 public void mouseClicked(java.awt.event.MouseEvent evt) {

                                     i=cId.getText();
                                     id=Integer.parseInt(i);
                                    RemovingData re=new RemovingData();
                                    re.removeFromCart(id);
                                    fill();
                                    background.setVisible(false);
                                    background.setVisible(true);


                                 }
                             });
                            
                            update.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                 public void mouseClicked(java.awt.event.MouseEvent evt) {

                                    i=cId.getText();
                                    id=Integer.parseInt(i);
                                    UpdateData updateData=new UpdateData();
                                    updateData.updateCart(id, quantity.getText());
                                    fill();
                                    background.setVisible(false);
                                    background.setVisible(true);
                                      

                                 }
                             });
                            
                            int itId=rs.getInt("itemId");
                            
                            more.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                 public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        
                                    if(type.equals("i")){
                                        
                                        ItemDescriptions itemDescriptions=new ItemDescriptions(itId,"mc");
                                        itemDescriptions.setVisible(true);
                                        FrameDispose();  
                                        
                                    }
                                    
                                    else if (type.equals("m")){
                                        
                                        MealDescription updateMeals=new MealDescription(itId,"mc");
                                        updateMeals.setVisible(true);
                                        FrameDispose(); 
                                    }
                                   
                                    

                                 }
                             });
                            
                            order.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                 public void mouseClicked(java.awt.event.MouseEvent evt) {
                                     
                                    if(availability.getText().equals("Not Available")){
                                        JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
//                                         
                                    }
//                                     
                                    else if(availability.getText().equals("Available")){
                                        i=cId.getText();
                                        id=Integer.parseInt(i);
                                       
                                        AddOrders addOrders=new AddOrders(id,Integer.parseInt(quantity.getText()),Integer.parseInt(itmprice.getText())*Integer.parseInt(quantity.getText()),Integer.parseInt(itmprice.getText()),type,"c");
                                        
                                        addOrders.setVisible(true);
                                        FrameDispose();
                                        
                                        
                                    }
                                     
                                     
                                 }
                             });
                            
                            
                            buyL.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                 public void mouseClicked(java.awt.event.MouseEvent evt) {
                                     
                                    if(availability.getText().equals("Not Available")){
                                        JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
//                                         
                                    }
//                                     
                                    else if(availability.getText().equals("Available")){
                                        i=cId.getText();
                                        id=Integer.parseInt(i);
                                       
                                        AddItemToBuyList addItemToBuyList=new AddItemToBuyList();
                                        addItemToBuyList.addToBuyListFromCart(itId,Float.parseFloat(itmprice.getText()),Integer.parseInt(quantity.getText()),id,type);
                                        ViewBuyingList buyingList=new ViewBuyingList();
                                        buyingList.setVisible(true);
                                        FrameDispose();
                                        
                                    }
                                     
                                     
                                 }
                             });

                            
                            
                            

                            addPanal.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 160));
                            addPanal.add(jLabelAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 140, 30));
                            addPanal.add(jLabelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 140, 30));
                            addPanal.add(jLabelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 140, 30));
                            
                            addPanal.add(buyL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 110, 40));
                            addPanal.add(more, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 110, 40));
                            addPanal.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 100, 40));
                            addPanal.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 110, 40));
                            addPanal.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 110, 40));
                            
                            addPanal.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 60, 30));
                            addPanal.add(increment, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 30, 30));
                            addPanal.add(decrement, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 30, 30));
                            
                            addPanal.add(itmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 480, 30));
                            addPanal.add(itmprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 130, 30));
                            addPanal.add(availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 480, 30));
                            
                            background.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 910, 220)); 
                            height=height+230;
                            
                           
                            background.setVisible(false);
                            background.setVisible(true);
                           // imge=null;
                            
                        }while (rs.next());
                    }
                } catch (Exception e) {
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        });
    
            
    }
    
    public void getItemData(int itmId){
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
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
                        iPrice=rs.getInt("price");
                        int availableQuantity=rs.getInt("count");
                        
                        if (availableQuantity==0 || orderedQuantity > availableQuantity){
                            iAvailability="Not Available";
                            
                        }
                        
                        else{
                          iAvailability="Available";  
                        }
                  
                        if (rs.getBytes("image")!=null){
                            ByteArrayInputStream bis = new ByteArrayInputStream(rs.getBytes("image"));
                            BufferedImage buffrdImage = ImageIO.read(bis);
                            imge = new ImageIcon(buffrdImage);
                            
                        }
                        else if (rs.getBytes("image")==null){
                            imge=null;
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
    
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        
        String sql="FROM Meals";
        Query query=session.createQuery(sql);
        java.util.List <Meals>mealsList=query.list();
        
        for (Iterator<Meals> mealsIterator=mealsList.iterator();mealsIterator.hasNext();){
           
            Meals meal=mealsIterator.next();

            if (meal.getId()== mealId){
                iName=meal.getFoodName();
                iPrice=meal.getPrice();
               
                iAvailability=meal.getAvailability();
                 
                
                if(meal.getPicture()!=null){
                    
                    try {
                        ByteArrayInputStream bis = new ByteArrayInputStream(meal.getPicture());
                        BufferedImage buffrdImage = ImageIO.read(bis);
                        imge = new ImageIcon(buffrdImage);
                        imge=CommonTasks.ImageResize.resizeImg(imge);
                        

                    } catch (Exception e) {
                        System.out.println("error occured.."+e);
                    }
                }
                
                else if(meal.getPicture()==null){
                    imge=null;
                }
            }
        }
    }
    

    public void FrameDispose(){
       this.dispose();
    }
    
//    public void addToBuyList(int itmId,float price,int quantity,int id,String type){
//
//        float subtot=price*quantity;
//        int stat=1;
//        Session bSession=HybernetSessionFctory.getSessionFactory().openSession();
//        Transaction bt=bSession.beginTransaction();
//        
//        String bsql="FROM Buylist";
//        Query bquery=bSession.createQuery(bsql);
//        List<Buylist> bList=bquery.list();
//        
//        for(Iterator<Buylist> bIterator=bList.iterator();bIterator.hasNext();){
//            Buylist buylist=bIterator.next();
//            if (buylist.getUserId().equals(Login.userID) && buylist.getItmId()==itmId && buylist.getType().equals(type)){
//                stat=0;
//            }
//           
//            
//            //System.out.println(buylist.getId());
//        }
//        
//        if (stat==1){
//            Session session=HybernetSessionFctory.getSessionFactory().openSession();
//            Transaction t=session.beginTransaction();
//            Date in = new Date();
//            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
//            Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
//            Buylist b=new Buylist();
//            b.setUserId(Login.userID);
//            b.setItmId(itmId);
//            b.setPrice(price);
//            b.setQuantity(quantity);
//            b.setSubTotal(subtot);
//            b.setType(type);
//            b.setAddedDate(addDate);
//            session.save(b);
//            session.getTransaction().commit();
//            JOptionPane.showMessageDialog(null, "Item added to buying list successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
//            RemovingData re=new RemovingData();
//            re.removeFromCart(id);
//            fill();
//            background.setVisible(false);
//            background.setVisible(true);
//        }
//        else if (stat==0){
//            JOptionPane.showMessageDialog(null, "You have already added this item in to the Buing List", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        
//    }
}
