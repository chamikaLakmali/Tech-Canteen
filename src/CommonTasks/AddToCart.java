/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonTasks;


import HybernetSession.HybernetSessionFctoryUser;
import Pojos.Cart;
import UI.Login;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chamika
 */
public class AddToCart {
    public static void addToCart(int itmID,int count,String type){
        int stat=1;
        String uId=Login.userID;
        Session csession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction ct=csession.beginTransaction();
        
        String cartSql="FROM Cart";
        Query cartQuery=csession.createQuery(cartSql);
        List<Cart> cartList=cartQuery.list();
        
        for(Iterator<Cart> citerator=cartList.iterator();citerator.hasNext();){
            Cart cart=citerator.next();
            if (cart.getItemId()==itmID && cart.getType().equals(type) && cart.getUserId().equals(uId)){
                stat=0;
            }            
        }
        if (stat==1){
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
            Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            
            Cart incart=new Cart();
            incart.setUserId(Login.userID);
            incart.setItemId(itmID);
            incart.setCount(count);
            incart.setAddedDate(addDate);
            incart.setType(type);
            
            csession.save(incart);
            csession.getTransaction().commit(); 
            JOptionPane.showMessageDialog(null, "Item added to cart successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
            
           
        }
        else {
            JOptionPane.showMessageDialog(null, "You have already added this item in to cart", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        
    }
}
