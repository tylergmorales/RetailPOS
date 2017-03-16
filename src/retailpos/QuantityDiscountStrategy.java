/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailpos;

/**
 *
 * @author Tyler
 */
public interface QuantityDiscountStrategy {
    public abstract int getRequiredQty();
    public abstract double getDiscountAmount();
}
