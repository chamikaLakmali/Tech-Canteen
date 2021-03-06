package Pojos;
// Generated Jul 1, 2021 10:20:18 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Orders generated by hbm2java
 */
public class Orders  implements java.io.Serializable {


     private Integer id;
     private int orderId;
     private String userId;
     private Date orderedDate;
     private String deliveryRequirement;
     private String deliveryLocation;
     private String dateToBeDelivered;
     private String orderStatus;
     private Float total;

    public Orders() {
    }

	
    public Orders(int orderId, String userId, Date orderedDate, String deliveryRequirement, String orderStatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderedDate = orderedDate;
        this.deliveryRequirement = deliveryRequirement;
        this.orderStatus = orderStatus;
    }
    public Orders(int orderId, String userId, Date orderedDate, String deliveryRequirement, String deliveryLocation, String dateToBeDelivered, String orderStatus, Float total) {
       this.orderId = orderId;
       this.userId = userId;
       this.orderedDate = orderedDate;
       this.deliveryRequirement = deliveryRequirement;
       this.deliveryLocation = deliveryLocation;
       this.dateToBeDelivered = dateToBeDelivered;
       this.orderStatus = orderStatus;
       this.total = total;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Date getOrderedDate() {
        return this.orderedDate;
    }
    
    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }
    public String getDeliveryRequirement() {
        return this.deliveryRequirement;
    }
    
    public void setDeliveryRequirement(String deliveryRequirement) {
        this.deliveryRequirement = deliveryRequirement;
    }
    public String getDeliveryLocation() {
        return this.deliveryLocation;
    }
    
    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
    public String getDateToBeDelivered() {
        return this.dateToBeDelivered;
    }
    
    public void setDateToBeDelivered(String dateToBeDelivered) {
        this.dateToBeDelivered = dateToBeDelivered;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }
    
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Float getTotal() {
        return this.total;
    }
    
    public void setTotal(Float total) {
        this.total = total;
    }




}


