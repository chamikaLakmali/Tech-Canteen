/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonTasks;

import HybernetSession.HybernetSessionFctory;
import HybernetSession.HybernetSessionFctoryUser;
import Pojos.Buylist;
import Pojos.Cart;
import Pojos.Item;
import Pojos.OrderDetails;
import Pojos.Orders;
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
public class UpdateData {
    public void updateCart(int id,String quant){
        
        int quantity=Integer.parseInt(quant);
        System.out.println(quantity);
        
        Date in = new Date();
        LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        
        
        Session updteCrt= HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction t=updteCrt.beginTransaction();
        
        String csql="FROM Cart";
        Query q=updteCrt.createQuery(csql);
        List<Cart> cartList=q.list();
        for (Iterator <Cart> cIterator=cartList.iterator();cIterator.hasNext();){
            Cart cart=cIterator.next();
            if (cart.getId()==id){
                //System.out.println("ok");
                cart.setCount(quantity);
                cart.setAddedDate(addDate);
                updteCrt.save(cart);
                updteCrt.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Your cart has been updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
            }           
        } 
        
    }
    
    public void updateOrderStat(int oID,String stat){
        System.out.println("inside o");
        Session orderSession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction ordert=orderSession.beginTransaction();
        String sql="From Orders";
        Query oQuery=orderSession.createQuery(sql);
        List<Orders> oList=oQuery.list();
        
        for(Iterator<Orders> oIterator=oList.iterator();oIterator.hasNext();){
            Orders o=oIterator.next();
            if(o.getOrderId()==oID){
                o.setOrderStatus(stat);
                orderSession.save(o);
               
            }
        }
         
        orderSession.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Order status been updated successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);

    }
    
    // update after confirming orders
    public void updateItemQuantity(int itmId,int oQuantity){
        
        
        Session isession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction it=isession.beginTransaction();
        String isql="FROM Item";
        Query iquery=isession.createQuery(isql);
        List<Item> itemList=iquery.list();
        for(Iterator<Item> iIterator=itemList.iterator();iIterator.hasNext();){
            Item i=iIterator.next();
            if(itmId==i.getId()){
                i.setCount(i.getCount()-oQuantity);
                isession.save(i);
                
                
            }
        }
        isession.getTransaction().commit();
        
    }
    
     // update after confirming orders
    public void getDataToBeUpdated(int oderId){
        Session osession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction it=osession.beginTransaction();
        String isql="FROM OrderDetails";
        Query iquery=osession.createQuery(isql);
        List<OrderDetails> oList=iquery.list();
        for(Iterator<OrderDetails> oIterator=oList.iterator();oIterator.hasNext();){
            OrderDetails o=oIterator.next();
            if(oderId==o.getOrderId()){
                if(o.getType().equals("i")){
                    updateItemQuantity(o.getItemId(),o.getQuantity());
                }    
                
            }
        }
        
    }
    
    public void updateBuyList(int id,String quant){
        
        int quantity=Integer.parseInt(quant);
        Date in = new Date();
        LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        
        Session ubdtebList= HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction t=ubdtebList.beginTransaction();
        
        String bsql="FROM Buylist";
        Query q=ubdtebList.createQuery(bsql);
        List<Buylist> bList=q.list();
        for (Iterator <Buylist> bIterator=bList.iterator();bIterator.hasNext();){
            Buylist b=bIterator.next();
            if (b.getId()==id){
                b.setQuantity(quantity);
                b.setSubTotal(quantity*b.getPrice());
                b.setAddedDate(addDate);
                
                ubdtebList.save(b);
                ubdtebList.getTransaction().commit();
            }
            
        }
        
        
    }
            
    
    
}
