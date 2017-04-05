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
public class RetailPOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input is: optional customer id
        //mandatory prodID and qty for each item ordered
        PosTerminal pos = new PosTerminal();
        pos.startNewSale();
        
        pos.addCustomerToSale("A102");
        
        pos.addItemToSale("00001", 2);
        pos.addItemToSale("00001", 7);
        pos.addItemToSale("00002", 4);
        pos.addItemToSale("00003", 6);
        pos.addItemToSale("00004", 5);

        
        pos.endSale();
    }
    
}
