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
    
    private int prodId;
    private String prodName;
    private double price;
    private DiscountStrat discount;
    


    public Product(int prodId, String prodName, double price, DiscountStrat discount) {
        this.setProdId(prodId);
        this.setProdName(prodName);
        this.setPrice(price);
        this.setDiscount(discount);
        }
    

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        if(prodId > 1){
            this.prodId = prodId;
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

    public DiscountStrat getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrat discount) {
        this.discount = discount;
    }
    
    
}
