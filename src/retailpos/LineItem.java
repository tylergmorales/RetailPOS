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
public class LineItem {
    private Product product;
    private int qty;
    private Database db = new Database();
    private double discountAmount;

    public LineItem(String prodId, int qty) {
        this.setProduct(db.queryProduct(prodId));
        this.setQty(qty);
    }
    
    public LineItem(Product p, int qty) {
        this.setProduct(p);
        this.setQty(qty);
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        if(qty > 0)
        {
            this.qty = qty;
        }
        else
        {
            throw new IllegalArgumentException("Enter quantity greater than 0");
        }
    }
    
    public final Database getDb() {
        return db;
    }

    public final void setDb(Database db) {
        this.db = db;
    }
    
    public final double getDiscountAmount()
    {
        double discountAmt = 0;
        if(this.product.getDiscountStrategy() instanceof FlatDiscount)
        {
            discountAmount = (this.product.getDiscountStrategy().getDiscountAmount() * qty); 
        }
        else if(this.product.getDiscountStrategy() instanceof PercentDiscount)
        {
            discountAmount = ((this.product.getDiscountStrategy().getDiscountAmount() * product.getPrice()) * qty);  
        }
        else if(this.product.getDiscountStrategy() instanceof QuantityDiscount && this.qty >= this.product.getDiscountStrategy().getRequiredQty())
        {
            discountAmount = ((this.product.getDiscountStrategy().getDiscountAmount() * product.getPrice()) * qty);
        }
        return discountAmount;
    }
    
    public final Product queryProduct(String prodId){
        product = db.queryProduct(prodId);
        return db.queryProduct(prodId);
        
    }
    
    @Override
    public final String toString(){
        //     ----PRODUCT ID-----            --PRODUCT NAME---             --PRODUCT PRICE--             QTY            -------------------SUBTOTAL---------------------            -------------------DISCOUNT-------------------             --------------------------------------TOTAL-----------------------------------
        return product.getProdId() + "\t\t" + product.toString() + "\t\t" + product.getPrice() + "\t\t" + qty + "\t\t" + String.format("%.2f", (qty * product.getPrice()))+ "\t\t" + String.format("%.2f", this.getDiscountAmount()) + "\t\t" + String.format("%.2f", ((qty * product.getPrice()) - this.getDiscountAmount()));
        
    }
}

    