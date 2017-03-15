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
class LineItem {
    private Product product;
    private int qty;
    private Database db = new Database();
    private double discountAmount;

    public LineItem(String prodId, int qty) {
        this.setProduct(db.queryProduct(prodId));
        this.setQty(qty);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty > 0)
        {
            this.qty = qty;
        }
        else
        {
            throw new IllegalArgumentException("Enter quantity greater than 0");
        }
    }
    
    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
    
    public void getDiscountAmount()
    {
        if(this.product.getDiscountStrategy() instanceof FlatDiscount)
        {
            discountAmount = (this.product.getDiscountStrategy().getDiscount() * qty); 
        }
        else if(this.product.getDiscountStrategy() instanceof PercentDiscount)
        {
            discountAmount = ((this.product.getDiscountStrategy().getDiscount() * product.getPrice()) * qty);  
        }
    }
    
    public final Product queryProduct(String prodId){
        product = db.queryProduct(prodId);
        return db.queryProduct(prodId);
        
    }
    
    public String toString(){
        return product.getProdId() + "\t\t" + product.toString() + "\t\t" + product.getPrice() + "\t\t" + qty + "\t\t" + (qty * product.getPrice())+ "\t\t" + this.discountAmount;
        
    }
}

    