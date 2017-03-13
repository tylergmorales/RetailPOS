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
public class FlatDiscount implements DiscountStrat {
    private int discountAmount = 5;

    public FlatDiscount(int discount) {
        this.setDiscountAmount(discount);
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        if(discountAmount > .01){
            this.discountAmount = discountAmount;
        }
    }

    
    
    @Override
    public double getDiscountedPrice() {
        return discountAmount;
        
    }
}
