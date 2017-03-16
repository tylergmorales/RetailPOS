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
    private final double DISCOUNT_AMOUNT = 0;

    public NoDiscount() {
    }

    @Override
    public final double getDiscountAmount() {
        return DISCOUNT_AMOUNT;
    }

    public final void setDiscountAmount(double discountAmount) {

    }    
}
    

