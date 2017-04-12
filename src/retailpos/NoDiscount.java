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
public class NoDiscount implements DiscountStrategy {
    private final double DISCOUNT_RATE = 0;
    private int requiredQty = 0;

    public NoDiscount() {
    }
    
    public int getRequiredQty() {
        return requiredQty;
    }

    @Override
    public final double getDiscountRate() {
        return DISCOUNT_RATE;
    }

    public final void setDiscountAmount(double discountAmount) {

    }    
}
    

