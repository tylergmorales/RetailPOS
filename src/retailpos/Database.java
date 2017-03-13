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
public class Database {
    
    private Customer[] custArray = {new Customer("0000", "No Customer Entered"), new Customer("A101", "John Doe"), new Customer("A102", "Jane Doe"), new Customer("A103", "Jimmy Doe"), new Customer("A104", "Jesse Doe")};
    private Product[] prodArray = {new Product(00001, "Red Hat", 9.99, new FlatDiscount(5)), new Product(00002, "Blue Jeans", 29.99, new PercentDiscount(.20)), new Product(00003, "Green Sweater", 39.99, new PercentDiscount(.25))};
    
    public Customer queryCustomer(String custId){
        Customer foundCustomer = custArray[0];
        for(int i = 0; i < custArray.length; i++)
        {
            if(custArray[i].getCustId().equals(custId)){
                foundCustomer = custArray[i];
            }
        }
        return foundCustomer;
    }
    
        public Product queryProduct(String prodId){
        Product foundProduct = prodArray[0];
        for(int i = 0; i < prodArray.length; i++)
        {
            if(prodArray[i].getProdId() == prodId) {
                foundProduct = prodArray[i];
            }
        }
        return foundProduct;
    }
}

