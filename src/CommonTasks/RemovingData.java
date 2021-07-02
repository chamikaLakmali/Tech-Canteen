/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonTasks;

import HybernetSession.HybernetSessionFctory;
import HybernetSession.HybernetSessionFctoryUser;
import Pojos.Admin;
import Pojos.Buylist;
import Pojos.Cart;
import Pojos.Item;
import Pojos.Meals;
import Pojos.Studentnstaff;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Chamika
 */
public class RemovingData {
    
    public void removeFromCart(int Id){
       
        Session deleteSession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction t3=deleteSession.beginTransaction();
        
        Cart cart= (Cart) deleteSession.load(Cart.class, Id);
        deleteSession.delete(cart);
        t3.commit();
        //JOptionPane.showMessageDialog(null, "Item deleted successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);

     
    }
    
    public void deleteMeal(int id){
        Session deleteSession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t3=deleteSession.beginTransaction();
        Meals Meals = (Meals) deleteSession.load(Meals.class, id);
        deleteSession.delete(Meals);
        t3.commit();
        JOptionPane.showMessageDialog(null, "Details deleted successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public void deleteItem(int id){
        Session deleteSession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t3=deleteSession.beginTransaction();
        Item Meals = (Item) deleteSession.load(Item.class, id);
        deleteSession.delete(Meals);
        t3.commit();
        JOptionPane.showMessageDialog(null, "Item deleted successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
        
    }
    public void removefromBuyList(int Id){
        Session deleteSession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction t3=deleteSession.beginTransaction();
        
        Buylist buylist= (Buylist) deleteSession.load(Buylist.class, Id);
        deleteSession.delete(buylist);
        t3.commit();
    }
    
    public void removeCustomer(String id){
        Session deleteSession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t3=deleteSession.beginTransaction();
        Studentnstaff  customer = (Studentnstaff) deleteSession.load(Studentnstaff.class, id);
        deleteSession.delete(customer);
        t3.commit();
        JOptionPane.showMessageDialog(null, "User deleted successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void removeAdmin(String id){
        Session deleteSession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t3=deleteSession.beginTransaction();
        Admin  admin = (Admin) deleteSession.load(Admin.class, id);
        deleteSession.delete(admin);
        t3.commit();
        JOptionPane.showMessageDialog(null, "Admin deleted successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void removeOrder(int oId){
        
        Session session=HybernetSessionFctoryUser.getSessionFactory().openSession();
        final AtomicReference<ResultSet> orderList=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ call removeOrders(?)}" )){
                
                cst.setInt(1, oId);
                cst.execute();
                
                             
            }
            catch (Exception e){
                System.out.println(e);
            }
        });
        JOptionPane.showMessageDialog(null, "Order cancelled successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
