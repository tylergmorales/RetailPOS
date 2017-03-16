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
public class Customer {
    private String name;
    private String custId;

    public Customer(String custId, String name) {
        this.setName(name);
        this.setCustId(custId);
    }

    
    
    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name != null || name.length() > 0 ){
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Please enter customer name longer than 0 characters");
        }
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        if(custId != null || custId.length() > 0 ){
            this.custId = custId;
        }
        else
        {
            throw new IllegalArgumentException("Please enter valid customer ID");
        }
    }
    
    public String toString()
    {
        return name;
    }
    
    
}
