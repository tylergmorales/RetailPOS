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
public class QuantityDiscount implements DiscountStrategy, QuantityDiscountStrategy {
    private double discountAmount = .25;
    private int requiredQty;

    public QuantityDiscount(double discountAmount, int requiredQty)
    {
        this.setDiscountAmount(discountAmount);
        this.setRequiredQty(requiredQty);
    }
    
    @Override
    public double getDiscountAmount() {
        return discountAmount;
    }

    public final void setDiscountAmount(double discountAmount) {
        if(discountAmount > 0)
        {
            this.discountAmount = discountAmount;
        }
        else
        {
            throw new IllegalArgumentException("Please enter discount amount greater than 0");
        }
    }

    public final int getRequiredQty() {
        return requiredQty;
    }

    public final void setRequiredQty(int requiredQty) {
        if(requiredQty > 0)
        {
            this.requiredQty = requiredQty;
        }
        else
        {
            throw new IllegalArgumentException("Please enter required quantity greater than 0");
        }
    }
    

    
    
}
