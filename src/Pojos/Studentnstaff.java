package Pojos;
// Generated Jul 1, 2021 10:20:18 PM by Hibernate Tools 4.3.1



/**
 * Studentnstaff generated by hbm2java
 */
public class Studentnstaff  implements java.io.Serializable {


     private String regNo;
     private String name;
     private String residence;
     private String tele;
     private String email;
     private String password;
     private int points;

    public Studentnstaff() {
    }

    public Studentnstaff(String regNo, String name, String residence, String tele, String email, String password, int points) {
       this.regNo = regNo;
       this.name = name;
       this.residence = residence;
       this.tele = tele;
       this.email = email;
       this.password = password;
       this.points = points;
    }
   
    public String getRegNo() {
        return this.regNo;
    }
    
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getResidence() {
        return this.residence;
    }
    
    public void setResidence(String residence) {
        this.residence = residence;
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
    public int getPoints() {
        return this.points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }




}


