/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import CommonTasks.RetrieveData;
import UI.User.MyCart;
import CommonTasks.AddToCart;
import HybernetSession.HybernetSessionFctory;
import Pojos.Item;
import Pojos.Itemtype;
import Pojos.Model;
import CommonTasks.AddItemToBuyList;
import UI.User.AddOrders;
import UI.User.ViewBuyingList;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ItemDescriptions extends javax.swing.JFrame {

    int iTID;
    ImageIcon image,imge;
    String path="";
    String mStat="";
    RetrieveData retrieveData=new RetrieveData();
    public ItemDescriptions() {
        initComponents();
    }

    public ItemDescriptions(int iTID) {
        //findUser();
        initComponents();
        if(Login.userType.equals("admin")){
            cartIcon.setVisible(false);
            buyListIcon.setVisible(false);
        }
        else if(Login.userType.equals("user")){
            cartIcon.setVisible(true);
            buyListIcon.setVisible(true);
            addToBuyList.setVisible(true);
        }
        fillTypeCombo();
        fillModelCombo();
        this.iTID=iTID;
        
        order.setVisible(false);
        addCart.setVisible(false);
        fillData();
        
    }
    
    public ItemDescriptions(int iTID,String mStat) {
        //findUser();
        initComponents();
        fillTypeCombo();
        fillModelCombo();
        this.iTID=iTID;
        this.mStat=mStat;
        
        order.setVisible(false);
        addCart.setVisible(false);
        addToBuyList.setVisible(false);
        fillData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        order = new javax.swing.JButton();
        itemImg = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        count = new javax.swing.JTextField();
        imageUpload = new javax.swing.JButton();
        model = new javax.swing.JComboBox<>();
        Update = new javax.swing.JButton();
        addCart = new javax.swing.JButton();
        addToBuyList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        cartIcon = new javax.swing.JLabel();
        buyListIcon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl1.setText("Item Name");
        background.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 30));

        name.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        background.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 320, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl2.setText("Description");
        background.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 20));

        lbl3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl3.setText("Price");
        background.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, -1));

        price.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        background.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 320, -1));

        lbl4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl4.setText("Type");
        background.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 170, 20));

        lbl5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl5.setText("Item Model");
        background.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 180, -1));

        error.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        background.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 450, 30));

        order.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        order.setText("Order");
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        background.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 190, -1));

        itemImg.setBackground(new java.awt.Color(255, 255, 255));
        itemImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itemImg.setOpaque(true);
        background.add(itemImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 160, 160));

        lbl6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl6.setText("Count");
        background.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, -1));

        type.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        background.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 320, -1));

        count.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        background.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 320, -1));

        imageUpload.setText("Image Upload");
        imageUpload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageUploadMouseClicked(evt);
            }
        });
        imageUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUploadActionPerformed(evt);
            }
        });
        background.add(imageUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 120, 30));

        model.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });
        background.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 320, -1));

        Update.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        background.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 150, -1));

        addCart.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addCart.setText("Add to Cart");
        addCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCartMouseClicked(evt);
            }
        });
        addCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartActionPerformed(evt);
            }
        });
        background.add(addCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 190, -1));

        addToBuyList.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addToBuyList.setText("Add To Buy List");
        addToBuyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addToBuyListMouseClicked(evt);
            }
        });
        addToBuyList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBuyListActionPerformed(evt);
            }
        });
        background.add(addToBuyList, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 320, 80));

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
                .addGap(0, 804, Short.MAX_VALUE)
                .addComponent(buyListIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText("Update Item");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 480, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/i.jpeg"))); // NOI18N
        background.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
       
        if (mStat.equals("mc")){
            MyCart c=new MyCart();
            c.setVisible(true);
            this.dispose();   
        }
        
        else{
            ViewItems view=new ViewItems();
            view.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_backMouseClicked

    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
        
        JFrame frame=new JFrame();
        String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");

        if(in!=null){
            int amnt=Integer.parseInt(in);
            if (Integer.parseInt(count.getText())==0 || amnt>Integer.parseInt(count.getText())){
                JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                AddOrders addOrders=new AddOrders(iTID, amnt, Float.parseFloat(price.getText())* amnt, Float.parseFloat(price.getText()),"i","i");
                addOrders.setVisible(true);
                this.dispose();
            }
        }



           

    }//GEN-LAST:event_orderMouseClicked

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if (type.getSelectedIndex()!=0){
            String t=type.getSelectedItem().toString();
            fillModelAcType(t);
        }
    }//GEN-LAST:event_typeActionPerformed

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelActionPerformed

    private void imageUploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageUploadMouseClicked
        JFileChooser filechooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "jpeg", "gif", "png");
        filechooser.addChoosableFileFilter(filter);
        int x = filechooser.showOpenDialog(null);
        if (x == JFileChooser.APPROVE_OPTION) {
            File avatarIcon = filechooser.getSelectedFile();
            String path = avatarIcon.getAbsolutePath();
            this.path = path;
            image=CommonTasks.ImageResize.resize(path, itemImg.getHeight(), itemImg.getWidth());
            itemImg.setIcon(image);
        } else {
            itemImg.setIcon(null);
            itemImg.setBackground(Color.white);
            //System.out.println("cancelled by user");
        }
        itemImg.setVisible(true);
    }//GEN-LAST:event_imageUploadMouseClicked

    private void imageUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageUploadActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        updateData();
    }//GEN-LAST:event_UpdateMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateActionPerformed

    private void addCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCartMouseClicked
        JFrame frame=new JFrame();
        String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");
        if (in!=null){
            int amnt=Integer.parseInt(in);
            AddToCart.addToCart(iTID,amnt,"i");

            MyCart cart=new MyCart();
            cart.setVisible(true);
            this.dispose();
        }
      
    }//GEN-LAST:event_addCartMouseClicked

    private void addCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCartActionPerformed

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

    private void addToBuyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBuyListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addToBuyListActionPerformed

    private void addToBuyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addToBuyListMouseClicked
        
        JFrame frame=new JFrame();
        String in=JOptionPane.showInputDialog(frame,"Enter the amount you need (Enter in numbers): ");

        if(in!=null){
            int amnt=Integer.parseInt(in);
            if (Integer.parseInt(count.getText())==0 || amnt>Integer.parseInt(count.getText())){
                JOptionPane.showMessageDialog(null, "Sorry, This item or quantity you ordered is not available ", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                AddItemToBuyList addItemToBuyList=new AddItemToBuyList();
                addItemToBuyList.addToBuyList(iTID,Float.parseFloat(price.getText()), amnt, "i");
                ViewBuyingList bList=new ViewBuyingList();
                bList.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_addToBuyListMouseClicked

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
            java.util.logging.Logger.getLogger(ItemDescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemDescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemDescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemDescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemDescriptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton addCart;
    private javax.swing.JButton addToBuyList;
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel buyListIcon;
    private javax.swing.JLabel cartIcon;
    private javax.swing.JLabel close;
    private javax.swing.JTextField count;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel error;
    private javax.swing.JButton imageUpload;
    private javax.swing.JLabel img;
    private javax.swing.JLabel itemImg;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> model;
    private javax.swing.JTextField name;
    private javax.swing.JButton order;
    private javax.swing.JTextField price;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

   
    private void fillData() {
        
        if (mStat.equals("m")){
            title.setText("Item Description");
     
        }
        
        if (Login.userType.equals("user")){
            if(mStat.equals("mc")){
                title.setText("Item Description");
                addCart.setVisible(false);
                order.setVisible(false);
                Update.setVisible(false);
                addToBuyList.setVisible(false);
            }
            else{
                order.setVisible(true);
                addCart.setVisible(true);
                addToBuyList.setVisible(true);
                
            }
            Update.setVisible(false);
            imageUpload.setVisible(false);
            name.setEditable(false);
            description.setEditable(false);
            price.setEditable(false);
            type.setEnabled(false);
            model.setEnabled(false);
            count.setEditable(false);
            
        }
       
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        final AtomicReference<ResultSet> itemTypes=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call getItem(?)}" )){
                
                cst.setInt(1, iTID);
                cst.execute();
                itemTypes.set(cst.getResultSet());
                
                try(ResultSet rs =cst.getResultSet()){
                    while(rs.next()){

                        name.setText(rs.getString("name"));
                        description.setText(rs.getString("description"));
                        price.setText(rs.getString("price"));
                        
                        
                        String ty=retrieveData.getTypeName(rs.getInt("typeID"));
                        type.setSelectedItem(ty);
                       // type.setText(ty);
                        
                        String mdl=retrieveData.getModelName(rs.getInt("mdlID"));
                        //model.setText(mdl);
                        model.setSelectedItem(mdl);
                        count.setText(rs.getString("count"));
                        
                        if (rs.getBytes("image")!=null){
                            ByteArrayInputStream bis = new ByteArrayInputStream(rs.getBytes("image"));
                            BufferedImage buffrdImage = ImageIO.read(bis);
                            imge = new ImageIcon(buffrdImage);
                            itemImg.setIcon(CommonTasks.ImageResize.resizeImg(imge));
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
    
    
    public void fillModelCombo(){
        Session tsession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t=tsession.beginTransaction();
        
        String sql="FROM Model";
        Query query=tsession.createQuery(sql);
        List <Model> typeList=query.list();
        for (Iterator<Model> typeI=typeList.iterator();typeI.hasNext();){
            Model mdl=typeI.next();
            model.addItem(mdl.getName());
        }
       
    }
    
    public void fillTypeCombo(){
        Session tsession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t=tsession.beginTransaction();
        
        String sql="FROM Itemtype";
        Query query=tsession.createQuery(sql);
        List <Itemtype> typeList=query.list();
        for (Iterator<Itemtype> typeI=typeList.iterator();typeI.hasNext();){
            Itemtype itmType=typeI.next();
            type.addItem(itmType.getName());
        }
       
   }
    
    private void fillModelAcType(String t) {
        
        model.removeAllItems();
       
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        final AtomicReference<ResultSet> itemTypes=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call getModelList(?)}" )){
                
                cst.setString(1, t);
                cst.execute();
                itemTypes.set(cst.getResultSet());
                
                try(ResultSet rs =cst.getResultSet()){
                    while(rs.next()){
                        String name=rs.getString("name");
                        model.addItem(name);
                        
                    }
                }
                catch (Exception ex) {
                    System.out.println("e1:"+ex);
                    
                }                
            }
            catch (Exception e){
                System.out.println("e2:"+e);
            }
        });
        
    }
    
    
    
    
   
    public void updateData(){
        if (name.getText().equals("") || price.getText().equals("") || type.getSelectedItem().equals("Please select Item Type") || model.getSelectedItem().equals("Please select Item model") || count.getText().equals("")){
           
            error.setText("Please fill all the required fields...");
        }
        else{

            Session iSession=HybernetSessionFctory.getSessionFactory().openSession();
            Transaction it=iSession.beginTransaction();

            String iSql="FROM Item";
            Query iQuery=iSession.createQuery(iSql);
            List<Item> itemList=iQuery.list();

            for(Iterator<Item> itemIterator=itemList.iterator();itemIterator.hasNext();){
                Item item=itemIterator.next();

                if (item.getId()==iTID){
                    error.setText("");
                    String numPtn = "\\d+";
                    if (Pattern.compile(numPtn).matcher(count.getText()).matches()) { 
                        error.setText("");
                        int mdl=retrieveData.getModelId(model.getSelectedItem().toString());
                        int tpe=retrieveData.getTypeID(type.getSelectedItem().toString());
                        float p=Float.parseFloat(price.getText());
                        
                        item.setName(name.getText());
                        item.setDescription(description.getText());
                        item.setPrice(p);
                        item.setCount(Integer.parseInt(count.getText()));
                        item.setMdlId(mdl);
                        item.setTypeId(tpe);

                        if (itemImg.getIcon()!=null){
                            if (!path.equals("")){
                                byte[] imageData = null;
                                try {
                                    BufferedImage bImage = ImageIO.read(new File(path));
                                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                                    ImageIO.write(bImage, "jpg", bos);
                                    imageData = bos.toByteArray();
                                    item.setImage(imageData);
                                }
                                catch(Exception e){
                                    System.out.println("Error occured : "+e);
                                    error.setText("Error occured in loading the image.");
                                }
                            }
                            
                        }
                        else if (itemImg.getIcon()==null){
                            item.setImage(null);                   
                        }
                        iSession.save(item);
                        iSession.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Details updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
                        ViewItems viewItems=new ViewItems();
                        viewItems.setVisible(true);
                        this.dispose();
                        
                    }
                 
                }

            }
        }
    }
   
}
