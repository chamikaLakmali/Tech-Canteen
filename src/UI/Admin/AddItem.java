/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import UI.Admin.AddModels;
import UI.ViewItems;
import HybernetSession.HybernetSessionFctory;
import Pojos.Item;
import Pojos.Itemtype;
import Pojos.Model;
import UI.Login;
import java.awt.Color;
import java.awt.image.BufferedImage;
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

/**
 *
 * @author Chamika
 */
public class AddItem extends javax.swing.JFrame {
    String path;
    ImageIcon image;
   int typeStatus=1;
    public AddItem() {
        initComponents();
        fillTypeCombo();
        fillModelCombo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        error = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        addModel = new javax.swing.JLabel();
        addType = new javax.swing.JLabel();
        itemImg = new javax.swing.JLabel();
        imageUpload = new javax.swing.JButton();
        model = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        count = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl1.setText("Item Name");
        jPanel2.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 30));

        name.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 320, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 50));

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl2.setText("Description");
        jPanel2.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 20));

        lbl4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl4.setText("Price");
        jPanel2.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, -1));

        price.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceFocusGained(evt);
            }
        });
        jPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 320, -1));

        lbl5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl5.setText("Type");
        jPanel2.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 170, 20));

        lbl6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl6.setText("Item Model");
        jPanel2.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 180, -1));

        type.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select Item Type" }));
        type.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeItemStateChanged(evt);
            }
        });
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 320, -1));

        error.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 450, 30));

        add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 150, -1));

        addModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        addModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addModelMouseClicked(evt);
            }
        });
        jPanel2.add(addModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 30, 40));

        addType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        addType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTypeMouseClicked(evt);
            }
        });
        jPanel2.add(addType, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 30, 40));

        itemImg.setBackground(new java.awt.Color(255, 255, 255));
        itemImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itemImg.setOpaque(true);
        jPanel2.add(itemImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 160, 160));

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
        jPanel2.add(imageUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 120, 30));

        model.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select Item model" }));
        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });
        jPanel2.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 320, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Count");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, -1));

        count.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        count.setForeground(new java.awt.Color(102, 102, 102));
        count.setText("      Enter only in numbers");
        count.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                countFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                countFocusLost(evt);
            }
        });
        count.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                countMouseClicked(evt);
            }
        });
        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });
        jPanel2.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 320, -1));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 320, 80));

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        title.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        title.setText("Add Inventory Items");
        jPanel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 480, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/i.jpeg"))); // NOI18N
        jPanel2.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        AdminDashboard admin=new AdminDashboard();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if (name.getText().equals("") || price.getText().equals("") || model.getSelectedItem().equals("Please select Item model") || count.getText().equals("") || count.getText().equals("      Enter only in numbers")){
            
            error.setText("Please fill all the required fields...");
        }
        else{
            
            error.setText("");
            String numPtn = "\\d+";
            if (Pattern.compile(numPtn).matcher(count.getText()).matches()) { 
                error.setText("");
                int mdl=getModelId(model.getSelectedItem().toString());
                int tpe=typeID(type.getSelectedItem().toString());


                float p=Float.parseFloat(price.getText());
                Session session=HybernetSessionFctory.getSessionFactory().openSession();
                Transaction t=session.beginTransaction();
                Item item=new Item();
                item.setName(name.getText());
                item.setDescription(description.getText());
                item.setPrice(p);
                item.setCount(Integer.parseInt(count.getText()));
                item.setMdlId(mdl);
               
                item.setTypeId(tpe);

                if (itemImg.getIcon()!=null){
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
                else if (itemImg.getIcon()==null){
                    item.setImage(null);                   
                }

               session.save(item);
               session.getTransaction().commit();
               JOptionPane.showMessageDialog(null, "Item added successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
               ViewItems view=new ViewItems();
               view.setVisible(true);
               this.dispose();
               
               

            }
            else{
                error.setText("Invalid inputs for count");
            }
            
        }
       
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void imageUploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageUploadMouseClicked
        itemImg.setIcon(null);
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
            System.out.println("cancelled by user");
        }
        itemImg.setVisible(true);
            
    }//GEN-LAST:event_imageUploadMouseClicked

    private void imageUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imageUploadActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login log=new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelActionPerformed

    private void addModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addModelMouseClicked
        if (type.getSelectedIndex()!=0){
            String t=type.getSelectedItem().toString();
            AddModels mdl=new AddModels(t);
            mdl.setVisible(true);
        }
        else{
            AddModels mdl=new AddModels();
            mdl.setVisible(true);
        }
       
        fillTypeCombo();
        
        
    }//GEN-LAST:event_addModelMouseClicked

    
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
    private void addTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTypeMouseClicked
       
        error.setText("");
        JFrame frame = new JFrame();
        String type = JOptionPane.showInputDialog(frame, "Enter new type name:");
        
        if (type!=null){
            Session tsession=HybernetSessionFctory.getSessionFactory().openSession();
            Transaction t=tsession.beginTransaction();

            String sql="FROM Itemtype";
            Query query=tsession.createQuery(sql);
            List <Itemtype> typeList=query.list();
            for (Iterator<Itemtype> typeI=typeList.iterator();typeI.hasNext();){
                Itemtype itmType=typeI.next();
                if (type.equals(itmType.getName())){
                    typeStatus=0;
                }
            }

            if (typeStatus==1){
                Itemtype itmT=new Itemtype();
                itmT.setName(type);
                tsession.save(itmT);
                tsession.getTransaction().commit();
                fillTypeCombo();
                JOptionPane.showMessageDialog(null, "Item added successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_addTypeMouseClicked

    private void typeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeItemStateChanged
        //System.out.println("changed");
    }//GEN-LAST:event_typeItemStateChanged

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
       
        if (type.getSelectedIndex()!=0){
            String t=type.getSelectedItem().toString();
            fillModelAcType(t);
        }      
        
    }//GEN-LAST:event_typeActionPerformed

    private void priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusGained
       
    }//GEN-LAST:event_priceFocusGained

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countActionPerformed

    private void countFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countFocusGained
        
    }//GEN-LAST:event_countFocusGained

    private void countFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countFocusLost
        
    }//GEN-LAST:event_countFocusLost

    private void countMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_countMouseClicked
        if (count.getText().equals("      Enter only in numbers")){
            count.setText("");
            count.setForeground(Color.black);
        }
    }//GEN-LAST:event_countMouseClicked

    
    
   
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
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel addModel;
    private javax.swing.JLabel addType;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JTextField count;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel error;
    private javax.swing.JButton imageUpload;
    private javax.swing.JLabel img;
    private javax.swing.JLabel itemImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel logout;
    private javax.swing.JComboBox<String> model;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JLabel title;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

    // Load models according to the selected type (Stored procedures)
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
                    System.out.println(ex);
                    
                }                
            }
            catch (Exception e){
                System.out.println(e);
            }
        });
        
    }
    
    public int getModelId(String mName){
        
        int mID=0;
       // String m=model.getSelectedItem().toString();
        Session tsession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction tT=tsession.beginTransaction();

        String msql="FROM Model";
        Query mquery=tsession.createQuery(msql);
        List <Model> mList=mquery.list();
        for (Iterator<Model> MI=mList.iterator();MI.hasNext();){
            Model mdl=MI.next();

            if (mName.equals(mdl.getName())){
                mID=mdl.getId();
            }
           
        }
//        System.out.println(mID);
        return mID;
    }
    
    public int typeID(String tName){
        int tID=0;
       // String m=model.getSelectedItem().toString();
        Session tsession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction tT=tsession.beginTransaction();

        String tsql="FROM Itemtype";
        Query tquery=tsession.createQuery(tsql);
        List <Itemtype> tList=tquery.list();
        for (Iterator<Itemtype> TI=tList.iterator();TI.hasNext();){
            Itemtype itm=TI.next();

            if (tName.equals(itm.getName())){
                tID=itm.getId();
            }
        }
        
        return tID;
    }

    private void clearData() {
        name.setText("");
        description.setText("");
        price.setText("");
        count.setText("");
        type.setSelectedIndex(0);
        model.setSelectedIndex(0);
        itemImg.setIcon(null);
    }
}
