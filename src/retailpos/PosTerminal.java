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
public class PosTerminal {


    private Receipt receipt = new Receipt();
    
    public void startNewSale() {
        
    }

    public void addItemToSale(int prodID, int qty) {
        
    }

    public void addCustomerToSale(String custID) {
        receipt.queryCustomer(custID);
    }

    public void endSale() {
        
    }
    
}
