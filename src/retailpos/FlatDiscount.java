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
public class FlatDiscount implements DiscountStrategy {
    private int discountRate = 5;
    private int requiredQty = 0;

    public FlatDiscount(int discount) {
        this.setDiscountAmount(discount);
    }
    
    public int getRequiredQty(){
        return requiredQty;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountAmount(int discountAmount) {
        if(discountAmount > .01){
            this.discountRate = discountAmount;
        }
    }
}
