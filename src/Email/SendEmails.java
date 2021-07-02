/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;

import HybernetSession.HybernetSessionFctory;
import Pojos.Orders;
import com.email.durgesh.Email;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Chamika
 */
public class SendEmails {
    public void sendEmailToSt(String mailAddress){
         try {
            Email email=new Email("fottechcanteen@gmail.com","TecCanteen123%");
            email.setFrom("fottechcanteen@gmail.com","Tech Canteen");
            email.setSubject("User Registration Confirmation");
            email.setContent("<h1>You have successfully created an account in the TechCanteen Online Food Ordering System.  </h1><br> <h2>Thank you for connecting with us.</h2>", "text/html");
            email.addRecipient(mailAddress);
            email.send();
        } catch (Exception e) {
            System.out.println("error occured.."+e);
        }
    }
    
    public void sendEmailToAdmin(String mailAddress){
        try {
            Email email=new Email("fottechcanteen@gmail.com","TecCanteen123%");
            email.setFrom("fottechcanteen@gmail.com","Tech Canteen");
            email.setSubject("Admin Registration Confirmation");
            email.setContent("<h1>You have been added as an admin in the TechCanteen Online Food Ordering System.  </h1><br> <h2>Thank you for connecting with us.</h2>", "text/html");
            email.addRecipient(mailAddress);
            email.send();
        } catch (Exception e) {
            System.out.println("error occured.."+e);
        }
    }
    
    public static void VerifyIdentity(String generatedString,String mailAddress){
         
        try {
             
            Email email=new Email("fottechcanteen@gmail.com","TecCanteen123%");
            email.setFrom("fottechcanteen@gmail.com","Tech Canteen");
            email.setSubject("Verify Identity");
            email.setContent("<h1> Please enter below number as your confirmation code.  </h1><br> <h2>$rand</h2> ", "text/html");
            email.setContent(generatedString, "text/html");
            //email.setContent("<script></script>");
            
            email.addRecipient(mailAddress);
            email.send();
        } catch (Exception e) {
            System.out.println("error occured.."+e);
        }   
    }
    
    public static void sendInvoice(int oID,String mail){
        try {
             
            Email email=new Email("fottechcanteen@gmail.com","TecCanteen123%");
            email.setFrom("fottechcanteen@gmail.com","Tech Canteen");
            email.setSubject("Order Confirmation");
            
            Session odSession=HybernetSessionFctory.getSessionFactory().openSession();
            Transaction odt=odSession.beginTransaction();
            String sql="From Orders";
            Query query=odSession.createQuery(sql);
            List<Orders> odList=query.list();
            for(Iterator<Orders> oI=odList.iterator();oI.hasNext();){
                Orders orders=oI.next();
                if(orders.getOrderId()==oID){
                    email.setContent("<center> Your order has been confirmed. <br><h2>Order Details </h2><br></center>Order id :"+orders.getOrderId()+"<br>Ordered Date : "+orders.getOrderedDate()+"<br><b>Total Billed amount: Rs."+orders.getTotal()+"<br><br></b>Thank you..! Come Again....", "text/html");
                }
            }
            email.addRecipient(mail);
            email.send();
        } catch (Exception e) {
            System.out.println("error occured.."+e);
        }         
            
    }
    
    public static void sendOrderRejectionAlert(int oID,String mail,String reason){
        try {
             
            Email email=new Email("fottechcanteen@gmail.com","TecCanteen123%");
            email.setFrom("fottechcanteen@gmail.com","Tech Canteen");
            email.setSubject("Order Rejection Alert");
            
            Session odSession=HybernetSessionFctory.getSessionFactory().openSession();
            Transaction odt=odSession.beginTransaction();
            String sql="From Orders";
            Query query=odSession.createQuery(sql);
            List<Orders> odList=query.list();
            for(Iterator<Orders> oI=odList.iterator();oI.hasNext();){
                Orders orders=oI.next();
                if(orders.getOrderId()==oID){
                    email.setContent("<center> <h3>Sorry <br> Your order no: "+oID+" has been rejected. <br> Reason : "+reason +"</h3></center><br><br></b>Thank you..! Come Again....", "text/html");
                }
            }
            email.addRecipient(mail);
            email.send();
        } catch (Exception e) {
            System.out.println("error occured.."+e);
        } 
        
        
        
 
            
            
    }
     
     
    
}
