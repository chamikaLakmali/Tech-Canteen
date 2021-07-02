package StudentNstaffPojos;
// Generated Jul 1, 2021 10:29:44 PM by Hibernate Tools 4.3.1



/**
 * OrderDetails generated by hbm2java
 */
public class OrderDetails  implements java.io.Serializable {


     private Integer id;
     private int orderId;
     private int itemId;
     private int quantity;
     private float unitPrice;
     private String type;
     private float subTotal;

    public OrderDetails() {
    }

    public OrderDetails(int orderId, int itemId, int quantity, float unitPrice, String type, float subTotal) {
       this.orderId = orderId;
       this.itemId = itemId;
       this.quantity = quantity;
       this.unitPrice = unitPrice;
       this.type = type;
       this.subTotal = subTotal;
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
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public float getSubTotal() {
        return this.subTotal;
    }
    
    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }




}


