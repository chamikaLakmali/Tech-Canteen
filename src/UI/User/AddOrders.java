/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.User;

import CommonTasks.RemovingData;
import HybernetSession.HybernetSessionFctoryUser;
import Pojos.Buylist;
import Pojos.Cart;
import Pojos.OrderDetails;
import Pojos.Orders;
import UI.Admin.AdminDashboard;
import UI.Login;
import UI.ViewItems;
import UI.ViewMeals;
import java.sql.CallableStatement;
import java.sql.Types;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;  
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chamika
 */
public class AddOrders extends javax.swing.JFrame {

    int oitmd,oQuantity;
    float osubtot,uprice;
    String num,type,b;
    public AddOrders() {
        initComponents();
        if(Login.userType.equals("admin")){
            cartIcon.setVisible(false);
        }
        else if(Login.userType.equals("user")){
            cartIcon.setVisible(true);
        }
        fill();
        oIdIN.setVisible(false);
    }

    public AddOrders(int oitmd, int oQuantity, float osubtot,float uprice,String type,String b) {
        initComponents();
        if(Login.userType.equals("admin")){
            cartIcon.setVisible(false);
        }
        else if(Login.userType.equals("user")){
            cartIcon.setVisible(true);
        }
        fill();
        this.oitmd=oitmd;
        this.oQuantity=oQuantity;
        this.osubtot=osubtot;
        this.uprice=uprice;
        this.type=type;
        num="s";
        this.b=b;
    }

    public AddOrders(String m) {
        initComponents();
        if(Login.userType.equals("admin")){
            cartIcon.setVisible(false);
        }
        else if(Login.userType.equals("user")){
            cartIcon.setVisible(true);
        }
        
        num="m";
        fill();
        oIdIN.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        cartIcon = new javax.swing.JLabel();
        buyListIcon = new javax.swing.JLabel();
        order1 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deliStat = new javax.swing.JComboBox<>();
        lLbl = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        dlbl = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        dDate = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        order = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        oIdIN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

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
                .addComponent(cartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(cartIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        order1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        order1.setText("Order");
        order1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order1MouseClicked(evt);
            }
        });
        background.add(order1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText("Order Details");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 380, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Do you need delivery facility :");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 200, 30));

        deliStat.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        deliStat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        deliStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliStatActionPerformed(evt);
            }
        });
        background.add(deliStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 90, 30));

        lLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lLbl.setText("Delivery Location                  :");
        background.add(lLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 200, 30));

        location.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        background.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 370, 30));

        dlbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        dlbl.setText("Date to be Delivered            :");
        background.add(dlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        error.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 51));
        background.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 410, 30));

        dDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        dDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dDateMouseClicked(evt);
            }
        });
        background.add(dDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 275, 370, 30));

        cancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        background.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        order.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        order.setText("Order");
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        background.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wall paper.jpg"))); // NOI18N
        background.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        oIdIN.setText("jLabel2");
        background.add(oIdIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        if (b.equals("c")){
            MyCart cart=new MyCart();
            cart.setVisible(true);
            this.dispose();  
            
        }else if (b.equals("b")){
            ViewBuyingList bList=new ViewBuyingList();
            bList.setVisible(true);
            this.dispose();
            
        }
        else if (b.equals("i")){
            ViewItems viewItems=new ViewItems();
            viewItems.setVisible(true);
            this.dispose();
            
        }
        else if (b.equals("m")){
            ViewMeals viewMeals=new ViewMeals();
            viewMeals.setVisible(true);
            this.dispose();
            
        }
        else if(Login.userType.equals("user")){
            UserDashboard dashboard=new UserDashboard();
            dashboard.setVisible(true);
            this.dispose();
        }
        else if(Login.userType.equals("admin")){
            AdminDashboard dashboard=new AdminDashboard();
            dashboard.setVisible(true);
            this.dispose();
        }
       
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void deliStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliStatActionPerformed
        fill();
    }//GEN-LAST:event_deliStatActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        UserDashboard userdash=new UserDashboard();
        userdash.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
        if (deliStat.getSelectedIndex()==0){
            if (num.equals("m")){
                getBuyingList();
            }

            else if(num.equals("s")){
                orderSingleItem();
            }
        }
        else if(deliStat.getSelectedIndex()==1){
            if(location.getText().equals("") || dDate.getText().equals("")|| dDate.getText().equals("Please enter in YYYY-MM-DD Format")){
                error.setText("Please fill all the fields..");
            }
            else{
                error.setText("");
                if (num.equals("m")){
                    getBuyingList();
                }
                
                else if(num.equals("s")){
                    orderSingleItem();
                }
                
            }   
           
        }
    }//GEN-LAST:event_orderMouseClicked

    private void dDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dDateMouseClicked
        dDate.setText("");
    }//GEN-LAST:event_dDateMouseClicked

    private void order1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order1MouseClicked
        if (deliStat.getSelectedIndex()==0){
            if (num.equals("m")){
                getBuyingList();
            }

            else if(num.equals("s")){
                orderSingleItem();
            }
        }
        else if(deliStat.getSelectedIndex()==1){
            if(location.getText().equals("") || dDate.getText().equals("")|| dDate.getText().equals("Please enter in YYYY-MM-DD Format")){
                error.setText("Please fill all the fields..");
            }
            else{
                error.setText("");
                if (num.equals("m")){
                    getBuyingList();
                }
                
                else if(num.equals("s")){
                    orderSingleItem();
                }
                
            }   
           
        }
    }//GEN-LAST:event_order1MouseClicked

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

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

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
            java.util.logging.Logger.getLogger(AddOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel buyListIcon;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel cartIcon;
    private javax.swing.JLabel close;
    private javax.swing.JTextField dDate;
    private javax.swing.JComboBox<String> deliStat;
    private javax.swing.JLabel dlbl;
    private javax.swing.JLabel error;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lLbl;
    private javax.swing.JTextField location;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel oIdIN;
    private javax.swing.JButton order;
    private javax.swing.JButton order1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void fill(){
        
        
        if (deliStat.getSelectedItem().equals("No")){
            
            lLbl.setVisible(false);
            location.setVisible(false);
            dlbl.setVisible(false);
            
            dDate.setVisible(false);
            order1.setVisible(true);
            order.setVisible(false);
            cancel.setVisible(false);
        }
        else if(deliStat.getSelectedItem().equals("Yes")){
            
            lLbl.setVisible(true);
            location.setVisible(true);
            dlbl.setVisible(true);
            dDate.setVisible(true);
            dDate.setText("Please enter in YYYY-MM-DD Format");
            
           
            cancel.setVisible(true);
            
            order1.setVisible(false);
            order.setVisible(true);
            background.setVisible(false);
            background.setVisible(true);
        }
       
    }
    
    public void orderSingleItem(){

        Random random = new Random();  
        int oderId = random.nextInt(1000000000);
        
        int stat=checkAvailability(oderId);
        
        if (stat!=1){
            while(stat!=1){
                
                oderId = random.nextInt(100);
                stat=checkAvailability(oderId);
                
            }
           
        }
        else if(stat==1){
            
            
           // saving data to order table
           
            Session osession=HybernetSessionFctoryUser.getSessionFactory().openSession();
            Transaction t=osession.beginTransaction();
            
            Orders orders=new Orders();
            
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
            Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            orders.setOrderId(oderId);
            orders.setUserId(Login.userID);
            orders.setOrderedDate(addDate);
            
            orders.setDeliveryRequirement(deliStat.getSelectedItem().toString());
            if(deliStat.getSelectedIndex()==1){
                orders.setDeliveryLocation(location.getText());
                orders.setDateToBeDelivered(dDate.getText());
            }
            
            orders.setOrderStatus("Pending");
            
            orders.setTotal(osubtot);
            osession.save(orders);
            
            osession.getTransaction().commit();
            osession.close();
            
      
            
             //saving data to order details
            Session odsession=HybernetSessionFctoryUser.getSessionFactory().openSession();
            Transaction odt=odsession.beginTransaction();
            OrderDetails orderDetails=new OrderDetails();
            orderDetails.setOrderId(oderId);
            orderDetails.setItemId(oitmd);
            orderDetails.setQuantity(oQuantity);
            orderDetails.setUnitPrice(uprice);
            orderDetails.setSubTotal(osubtot);
            orderDetails.setType(type);
            odsession.save(orderDetails);
            odsession.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Order added successfully. You will receive a copy of the invoice after the confirmation", "Successful", JOptionPane.INFORMATION_MESSAGE);
            odsession.close();
     
        }

    }

    public int checkAvailability(int oderId) {
        int stat=1;
        Session os=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction st=os.beginTransaction();
        
        String oSql="FROM Orders";
        Query oquer=os.createQuery(oSql);
        List<Orders> olist=oquer.list();
        
        for (Iterator<Orders> oI=olist.iterator();oI.hasNext();){
            Orders o=oI.next();
            if (o.getOrderId()==oderId){
                stat=0;
            }
        }
        return stat;
    }
    
    public void orderMultipleItems(int orderId,int itId,int quantity,float unitPrice,float subTotal,String type){
        Session insOrders=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction t=insOrders.beginTransaction();
        OrderDetails orderDetails=new OrderDetails();
        orderDetails.setItemId(itId);
        orderDetails.setOrderId(orderId);
        orderDetails.setQuantity(quantity);
        orderDetails.setUnitPrice(unitPrice);
        orderDetails.setType(type);
        orderDetails.setSubTotal(subTotal);
        
        insOrders.save(orderDetails);
        insOrders.getTransaction().commit();
        

    }
    
    public void getBuyingList(){
        Random random = new Random();  
        int oderId = random.nextInt(1000000000);
        oIdIN.setText(String.valueOf(oderId));
        
        int stat=checkAvailability(oderId);
       
        if (stat!=1){
            while(stat!=1){
                
                oderId = random.nextInt(100);
                stat=checkAvailability(oderId);   
            }         
        }
        else if(stat==1){
            Session bSession=HybernetSessionFctoryUser.getSessionFactory().openSession();
            Transaction bt=bSession.beginTransaction();

            String bsql="From Buylist";
            Query bquery=bSession.createQuery(bsql);

            List<Buylist> bList=bquery.list();
            for (Iterator<Buylist> bIterator=bList.iterator();bIterator.hasNext();){
                Buylist b=bIterator.next();
                if(b.getUserId().equals(Login.userID)){
                    orderMultipleItems(oderId,b.getItmId(),b.getQuantity(),b.getPrice(),b.getSubTotal(),b.getType());
                    RemovingData data=new RemovingData();
                    data.removefromBuyList(b.getId());
                        
                }
            }
            
            bSession.close();
            
            Session osession=HybernetSessionFctoryUser.getSessionFactory().openSession();
            Transaction ot=osession.beginTransaction();
            
            Orders orders=new Orders();
            
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
            Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            orders.setOrderId(oderId);
            orders.setUserId(Login.userID);
            orders.setOrderedDate(addDate);
            orders.setDeliveryRequirement(deliStat.getSelectedItem().toString());
            
            if(deliStat.getSelectedIndex()==1){
                orders.setDeliveryLocation(location.getText());
                orders.setDateToBeDelivered(dDate.getText());
            }
            orders.setOrderStatus("Pending");
            
            //calling function to get total
            Session session=HybernetSessionFctoryUser.getSessionFactory().openSession();
            
            final AtomicReference<Float> tot=new AtomicReference<>();
            session.doWork(connection->{
                try(CallableStatement cst=connection.prepareCall(
                        "{ ?=call getTotal(?)}" )){
                    cst.registerOutParameter(1,Types.VARCHAR); // registering the output parameter
                    int orderId=Integer.parseInt(oIdIN.getText());
                    cst.setInt(2, orderId);
                    cst.execute();
                    orders.setTotal(cst.getFloat(1));
                   

                }
            });
            
            
            osession.save(orders);
            
            osession.getTransaction().commit();
            osession.close();
            JOptionPane.showMessageDialog(null, "Order added successfully. You will receive a copy of the invoice after the confirmation", "Successful", JOptionPane.INFORMATION_MESSAGE);
            
            
    
        }
    }
  
    
}