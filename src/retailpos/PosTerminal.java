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
        //pass these values to a method in the Receipt class, such as
        receipt.addItemToSale(prodId, qty);
        
//        for(int i = 0; i > qty; i++)
//        {
//            addToProductArray(receipt.queryProduct(prodID));
//        }
        
    }

    public void addCustomerToSale(String custID) {
        receipt.queryCustomer(custID);
    }

    public void endSale() {
        receipt.buildAndOutputReceipt();
    }
   

}
