/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailpos;



/**
 *
 * @author tmorales3
 */
public class Product {
    
    private String prodId;
    private String prodName;
    private double price;
    private DiscountStrategy discount;
    private QuantityDiscountStrategy qtyDiscount;
    


    public Product(String prodId, String prodName, double price, DiscountStrategy discount) {
        try{
            this.setProdId(prodId);
            this.setProdName(prodName);
            this.setPrice(price);
            this.setDiscountStrategy(discount);
        } catch (IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
    }

    
    public Product(String prodId, String prodName, double price, QuantityDiscountStrategy discount) {
        try{ 
            this.setProdId(prodId);
            this.setProdName(prodName);
            this.setPrice(price);
            this.setQtyDiscount(discount);
        } catch (IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
    }
    

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) throws IllegalArgumentException {
        if(Integer.parseInt(prodId) >= 1){
            this.prodId = prodId;
        }
        else
        {
            throw new IllegalArgumentException("Please enter product ID greater than 00000");
        }
        
    }
    
    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) throws IllegalArgumentException {
        if(prodName != null || prodName.length() >= 1){
            this.prodName = prodName;
        }
        else
        {
            throw new IllegalArgumentException("Please enter a name of at least 1 characters.");
        }
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) throws IllegalArgumentException{
        if(price > .01){
            this.price = price;
        }
        else
        {
            throw new IllegalArgumentException("Please enter price greater than .01");
        }
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discount;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final QuantityDiscountStrategy getQtyDiscountStrategy() {
        return qtyDiscount;
    }
    
    public final void setDiscountStrategy(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public final void setQtyDiscount(QuantityDiscountStrategy discount) {
        this.qtyDiscount = discount;
    }
    
    public String toString()
    {
        return prodName;
        
    }
}