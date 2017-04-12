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
    private double discountRate = .15;
    private int requiredQty = 0;

    public PercentDiscount(double discountAmount) {
        this.setDiscountAmount(discountAmount);
    }

    public int getRequiredQty(){
        return requiredQty;
    }
    
    @Override
    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountAmount(double discountAmount) {
        if(discountAmount > .01){
            this.discountRate = discountAmount;
        }
    }  
}
    

