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
    


    public Product(String prodId, String prodName, double price, DiscountStrategy discount) {
        this.setProdId(prodId);
        this.setProdName(prodName);
        this.setPrice(price);
        this.setDiscount(discount);
        }
    

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        if(Integer.parseInt(prodId) >= 1){
            this.prodId = prodId;
        }
        else
        {
            throw new IllegalArgumentException("Please enter product ID greater than 00000");
        }
        
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        if(prodName != null || prodName.length() > 1){
            this.prodName = prodName;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > .01){
            this.price = price;
        }
    }

    public DiscountStrategy getDiscountStrategy() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public String toString()
    {
        return prodName;
        
    }
}