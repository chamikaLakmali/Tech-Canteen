/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonTasks;

import HybernetSession.HybernetSessionFctory;
import HybernetSession.HybernetSessionFctoryUser;
import Pojos.Item;
import Pojos.Itemtype;
import Pojos.Meals;
import Pojos.Model;
import UI.Login;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class RetrieveData {
    String email="",name="", unmae="";
    
    public String getItemName(int itmId){
        String name="";
        Session isession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction it=isession.beginTransaction();
        String isql="FROM Item";
        Query iquery=isession.createQuery(isql);
        List<Item> itemList=iquery.list();
        for(Iterator<Item> iIterator=itemList.iterator();iIterator.hasNext();){
            Item i=iIterator.next();
            if(itmId==i.getId()){
                name=i.getName();
                
            }
        }
        return name;    
    }
    
     public String getMealName(int mealId){
    
        String name="";
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        
        String sql="FROM Meals";
        Query query=session.createQuery(sql);
        java.util.List <Meals>mealsList=query.list();
        
        for (Iterator<Meals> mealsIterator=mealsList.iterator();mealsIterator.hasNext();){
           
            Meals meal=mealsIterator.next();
            if(meal.getId()==mealId){
                name=meal.getFoodName();
            }

            
        }
        return name;
    }
     
    public String getEmailAddress(String uId){
        
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        
        final AtomicReference<String> Email=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ ?=call getEmail(?)}" )){
                cst.registerOutParameter(1,Types.VARCHAR); // registering the output parameter
                cst.setString(2, uId);
                cst.execute(); 
                email=cst.getString(1);
               
                
            }
        });
        return email;
    }
    
    public String getiNames(int itID,String type){
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        
        final AtomicReference<String> Email=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ ?=call getItemName(?,?)}" )){
                cst.registerOutParameter(1,Types.VARCHAR); // registering the output parameter
                //cst.setString(2,9);
                cst.setInt(2, itID);
                cst.setString(3,type);
                cst.execute(); 
                name=cst.getString(1);
               
                
            }
        });
        
        return name;
        
    }
    public void getSalesData(){
//        Session odSession=HybernetSessionFctory.getSessionFactory().openSession();
//        Transaction odt=odSession.beginTransaction();
//        String odsql="From"
    }
    
    public String getTypeName(int tid){
        String tName="";
        Session tsession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction tT=tsession.beginTransaction();

        String tsql="FROM Itemtype";
        Query tquery=tsession.createQuery(tsql);
        List <Itemtype> tList=tquery.list();
        for (Iterator<Itemtype> TI=tList.iterator();TI.hasNext();){
            Itemtype type=TI.next();

            if (tid==type.getId()){
                tName=type.getName();
            }
        }
        
        return tName;
    }
    
    public String getModelName(int mid){
        String mName="";
        Session msession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction mT=msession.beginTransaction();

        String msql="FROM Model";
        Query tquery=msession.createQuery(msql);
        List <Model> mList=tquery.list();
        for (Iterator<Model> TI=mList.iterator();TI.hasNext();){
            Model model=TI.next();

            if (mid==model.getId()){
                mName=model.getName();
            }
        }
        
        return mName;
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
    
    public int getTypeID(String tName){
        int t=0;
       // String m=model.getSelectedItem().toString();
        Session tsession=HybernetSessionFctory.getSessionFactory().openSession();
        Transaction tT=tsession.beginTransaction();

        String tsql="FROM Itemtype";
        Query tquery=tsession.createQuery(tsql);
        List <Itemtype> tList=tquery.list();
        for (Iterator<Itemtype> TI=tList.iterator();TI.hasNext();){
            Itemtype itm=TI.next();

            if (tName.equals(itm.getName())){
                t=itm.getId();
            }
        }
        
        return t;
    }
    
    public int getMealAvailability(int mealId){
    
        int stat=1;
        Session session=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        
        String sql="FROM Meals";
        Query query=session.createQuery(sql);
        java.util.List <Meals>mealsList=query.list();
        
        for (Iterator<Meals> mealsIterator=mealsList.iterator();mealsIterator.hasNext();){
           
            Meals meal=mealsIterator.next();

            if (meal.getId()== mealId){
                if (meal.getAvailability().equals("Not Available")){
                    stat=0;
                }
                               
            }
        }
        return stat;
    }
    
    //buyAll viewbuying list
    public int getItemAvailability(int itmId,int oqunatity){
        int stat=1;
        Session isession=HybernetSessionFctoryUser.getSessionFactory().openSession();
        Transaction it=isession.beginTransaction();
        String isql="FROM Item";
        Query iquery=isession.createQuery(isql);
        List<Item> itemList=iquery.list();
        for(Iterator<Item> iIterator=itemList.iterator();iIterator.hasNext();){
            Item i=iIterator.next();
            if(itmId==i.getId()){
                if (i.getCount()==0 || oqunatity > i.getCount()){
                    stat=0;

                }
            }   
        } 
        return stat;
    }
    
    public String generateRandomString(){
        // generating random string
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
        return generatedString;
        
    }
      
    public String getUserName(){
        
        Session session=HybernetSessionFctory.getSessionFactory().openSession();
        
        final AtomicReference<String> uerName=new AtomicReference<>();
        session.doWork(connection->{
            try(CallableStatement cst=connection.prepareCall(
                    "{ ?=call getUserName(?)}" )){
                cst.registerOutParameter(1,Types.VARCHAR); // registering the output parameter
                cst.setString(2, Login.userID);
                cst.execute();
                
                unmae=cst.getString(1);
                
                
            }
        });
        
        return unmae;
    }
}
