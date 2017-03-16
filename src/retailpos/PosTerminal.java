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


    private Receipt receipt;
    
    public void startNewSale() {
         receipt = new Receipt();
    }

    public void addItemToSale(String prodId, int qty) {

        receipt.addItemToSale(prodId, qty);

        
    }

    public void addCustomerToSale(String custID) {
        receipt.queryCustomer(custID);
    }
    
    public void addCustomerToSale()
    {
        
    }

    public void endSale() {
        receipt.buildAndOutputReceipt();
    }
   

}
