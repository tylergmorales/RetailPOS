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
    
    private Customer[] custArray = {new Customer("A101", "John Doe"), new Customer("A102", "Jane Doe"), new Customer("A103", "Jimmy Doe"), new Customer("A104", "Jesse Doe")};
    private Product[] prodArray = {new Product("00001", "Hat", 9.99, new QuantityDiscount(.1, 3)), new Product("00002", "Jeans", 29.99, new PercentDiscount(.20)), new Product("00003", "Sweater", 39.99, new FlatDiscount(10))};
    
    public final Customer queryCustomer(String custId){
        for(int i = 0; i < custArray.length; i++)
        {
            if(custArray[i].getCustId().equals(custId)){
                return custArray[i];
            }
        }
        throw new IllegalArgumentException("No customer with this ID was found!");
    }
    
        public final Product queryProduct(String prodId){
        Product foundProduct = prodArray[0];
        for(int i = 0; i <= prodArray.length; i++)
        {
            if(prodArray[i].getProdId().equals(prodId)) {
                return prodArray[i];
            }
        }
        throw new IllegalArgumentException("No product with this ID was found!");
        
    }
}

