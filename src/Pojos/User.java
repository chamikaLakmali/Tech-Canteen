package Pojos;
// Generated Jul 1, 2021 10:20:18 PM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String userId;
     private String password;
     private String position;

    public User() {
    }

    public User(String userId, String password, String position) {
       this.userId = userId;
       this.password = password;
       this.position = position;
    }
   
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }




}


