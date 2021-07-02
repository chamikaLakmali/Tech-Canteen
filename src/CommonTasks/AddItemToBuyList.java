/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonTasks;
import Pojos.Buylist;
import UI.Login;
import HybernetSession.HybernetSessionFctoryUser;
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
public class AddItemToBuyList {
    public void addToBuyListFromCart(int itmId,float price,int quantity,int id,String type){

        float subtot=price*quantity;
        int stat=1;
        Session bSession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction bt=bSession.beginTransaction();
        
        String bsql="FROM Buylist";
        Query bquery=bSession.createQuery(bsql);
        List<Buylist> bList=bquery.list();
        
        for(Iterator<Buylist> bIterator=bList.iterator();bIterator.hasNext();){
            Buylist buylist=bIterator.next();
            if (buylist.getUserId().equals(Login.userID) && buylist.getItmId()==itmId && buylist.getType().equals(type)){
                stat=0;
            }

        }
        
        if (stat==1){
            Session session=HybernetSessionFctoryUser.getSessionFactory().openSession();
            Transaction t=session.beginTransaction();
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
            Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            Buylist b=new Buylist();
            b.setUserId(Login.userID);
            b.setItmId(itmId);
            b.setPrice(price);
            b.setQuantity(quantity);
            b.setSubTotal(subtot);
            b.setType(type);
            b.setAddedDate(addDate);
            session.save(b);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Item added to buying list successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
            RemovingData removingData=new RemovingData();
            removingData.removeFromCart(id);
        }
        else if (stat==0){
            JOptionPane.showMessageDialog(null, "You have already added this item in to the Buing List", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void addToBuyList(int itmId,float price,int quantity,String type){

        float subtot=price*quantity;
        int stat=1;
        Session bSession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction bt=bSession.beginTransaction();
        
        String bsql="FROM Buylist";
        Query bquery=bSession.createQuery(bsql);
        List<Buylist> bList=bquery.list();
        
        for(Iterator<Buylist> bIterator=bList.iterator();bIterator.hasNext();){
            Buylist buylist=bIterator.next();
            if (buylist.getUserId().equals(Login.userID) && buylist.getItmId()==itmId && buylist.getType().equals(type)){
                stat=0;
            }

        }
        
        if (stat==1){
            Session session=HybernetSessionFctoryUser.getSessionFactory().openSession();
            Transaction t=session.beginTransaction();
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
            Date addDate = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            Buylist b=new Buylist();
            b.setUserId(Login.userID);
            b.setItmId(itmId);
            b.setPrice(price);
            b.setQuantity(quantity);
            b.setSubTotal(subtot);
            b.setType(type);
            b.setAddedDate(addDate);
            session.save(b);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Item added to buying list successfully", "Successful", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if (stat==0){
            JOptionPane.showMessageDialog(null, "You have already added this item in to the Buing List", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    
    
    
    
}
