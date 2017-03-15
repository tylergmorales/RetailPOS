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
        pos.addItemToSale("00001", 1);
        //wont work for some reason, make it work
        //pos.addItemToSale("00002", 2);
        pos.addCustomerToSale("A101");
        pos.endSale();
    }
    
}
