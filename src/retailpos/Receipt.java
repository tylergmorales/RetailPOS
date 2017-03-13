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
class Receipt {
    
    private Database db;
    public Receipt(){
        this.db = new Database();
        
    }
    
    public Customer queryCustomer(String custId){
        return db.queryCustomer(custId);
        
    }
}
