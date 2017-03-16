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
public class PercentDiscount implements DiscountStrategy {
    private double discountAmount = .15;

    public PercentDiscount(double discountAmount) {
        this.setDiscountAmount(discountAmount);
    }

    public final double getDiscountAmount() {
        return discountAmount;
    }

    public final void setDiscountAmount(double discountAmount) {
        if(discountAmount > .01){
            this.discountAmount = discountAmount;
        }
    }

    
    
    @Override
    public final double getDiscount() {
        return discountAmount;
    }
    
    
}
    

