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

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null || name.length() > 0 ){
            this.name = name;
        }
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        if(custId != null || custId.length() > 0 ){
            this.custId = custId;
        }
    }
    
    
}
