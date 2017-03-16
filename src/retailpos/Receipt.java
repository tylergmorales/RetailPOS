/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailpos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tmorales3
 */
class Receipt {
    
    private Database db;
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm/dd/yyyy hh:mm:ss");
    
    public Receipt(){
        this.db = new Database();
        
    }
    
    public final void addItemToSale(String prodId, int qty) {
        //create a new LineItem object, passing in prodID and qty
        // in the LineItem contructor call a helper method to find a product by id
        // store the product found as a LineITem property, and the qty
        // add the lineItem created to the lineItems array
            addToArray(new LineItem(prodId, qty));
            
        }
    
    public final void queryCustomer(String custId){
        customer = db.queryCustomer(custId);  
    }
    
//    public final Product queryProduct(int prodId)
//    {
//        
//    }
    
    public final void buildAndOutputReceipt()
    {
        System.out.println("\t\t\t\t\tWelcome to Kohl's! \n\t\t\t\t\t1725 Slough Avenue \n\t\t\t\t\tScranton, PA 18505\n");
        if (customer != null)
        {
            System.out.println("Customer Rewards Enabled: " + customer);
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Date: " + dtf.format(now));
            System.out.println("");
        }
        System.out.println("ID\t\tItem\t\tPrice\t\tQty\t\tSubtotal\tDiscount\tTotal");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < lineItems.length; i++)
        {
            System.out.println(lineItems[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.print("\t\t\t\t\t\tTotal:\t\t" + String.format("%.2f", getTotalSubtotalAmount()));
        System.out.print("\t\t" + String.format("%.2f", getTotalDiscountAmount()));
        System.out.println("\t\t" + String.format("%.2f", getTotalAmount()));
        
    }
    
    private final void addToArray(final LineItem item) 
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
    
    public final double getTotalDiscountAmount()
    {
        double totalDiscountAmount = 0;
        for(int i = 0; i < lineItems.length; i++)
        {
            totalDiscountAmount += lineItems[i].getDiscountAmount();
        }
        return totalDiscountAmount;
    }
    
    public final double getTotalSubtotalAmount()
    {
        double totalSubtotalAmount = 0;
        for(int i = 0; i < lineItems.length; i++)
        {
            totalSubtotalAmount += (lineItems[i].getProduct().getPrice() * lineItems[i].getQty());
        }
        return totalSubtotalAmount;
    }
    
    public final double getTotalAmount()
    {
        double totalAmount = 0;
        for(int i = 0; i < lineItems.length; i++)
        {
            totalAmount += ((lineItems[i].getQty() * lineItems[i].getProduct().getPrice()) - lineItems[i].getDiscountAmount());
        }
        return totalAmount;
    }
}
