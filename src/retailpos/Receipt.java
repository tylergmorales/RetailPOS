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
    private LineItem[] lineItems = new LineItem[0];
    
    public Receipt(){
        this.db = new Database();
        
    }
    
        public void addItemToSale(String prodId, int qty) {
        //create a new LineItem object, passing in prodID and qty
        // in the LineItem contructor call a helper method to find a product by id
        // store the product found as a LineITem property, and the qty
        // add the lineItem created to the lineItems array
            addToArray(new LineItem(prodId, qty));
            
        }
    
    public final Customer queryCustomer(String custId){
        return db.queryCustomer(custId);  
    }
    
//    public final Product queryProduct(int prodId)
//    {
//        
//    }
    
    public void buildAndOutputReceipt()
    {
        System.out.println("ID\t\tItem\t\tPrice\t\tQty\t\tSubtotal\t\tDiscount");
        for(int i = 0; i < lineItems.length; i++)
        {
            System.out.println(lineItems[i]);
        }
        
    }
    
    private void addToArray(final LineItem item) 
    {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        for(int i=0; i < lineItems.length; i++) 
        {
            tempItems[i] = lineItems[i];
        }
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }
}
