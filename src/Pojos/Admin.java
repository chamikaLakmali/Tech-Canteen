package Pojos;
// Generated Jul 1, 2021 10:20:18 PM by Hibernate Tools 4.3.1



/**
 * Admin generated by hbm2java
 */
public class Admin  implements java.io.Serializable {


     private String adminId;
     private String name;
     private String tele;
     private String email;
     private String password;

    public Admin() {
    }

    public Admin(String adminId, String name, String tele, String email, String password) {
       this.adminId = adminId;
       this.name = name;
       this.tele = tele;
       this.email = email;
       this.password = password;
    }
   
    public String getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getTele() {
        return this.tele;
    }
    
    public void setTele(String tele) {
        this.tele = tele;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


