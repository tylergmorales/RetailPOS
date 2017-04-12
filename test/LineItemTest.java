/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import retailpos.FlatDiscount;
import retailpos.PercentDiscount;
import retailpos.Product;
import retailpos.QuantityDiscount;
import retailpos.LineItem;

/**
 *
 * @author tmorales3
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({})
public class LineItemTest extends TestCase{
    public LineItemTest(String testName) {
        super(testName);
    }  

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        
    }
    
    
    public void testPercentDiscountCalculatesCorrectly()
    {
        Product p = new Product("00001", "Shirt", 3.99, new PercentDiscount(.25));
        LineItem lI = new LineItem(p, 4);
        double temp = lI.getQty() * p.getPrice() * p.getDiscountStrategy().getDiscountAmount();
        double temp2 = ((p.getDiscountStrategy().getDiscountAmount() * p.getPrice()) * lI.getQty());
        assertEquals(temp, temp2);
    }
    
    public void testFlatDiscountCalculatesCorrectly()
    {
        Product p = new Product("00001", "Shirt", 3.99, new FlatDiscount(5));
        LineItem lI = new LineItem(p, 4);
        double temp = lI.getQty() * p.getDiscountStrategy().getDiscountAmount();
        double temp2 = p.getDiscountStrategy().getDiscountAmount() * lI.getQty();
        assertEquals(temp, temp2);
    }
    
    public void testQuantityDiscountCalculatesCorrectlyWhenQtyIsTooSmall()
    {
        double temp1;
        double temp2;
        Product p = new Product("00001", "Shirt", 3.99, new QuantityDiscount(.25, 5));
        LineItem lI = new LineItem(p, 4);
        temp1 = 0;
        if(lI.getQty() >= p.getDiscountStrategy().getRequiredQty()){
            temp2 = ((p.getDiscountStrategy().getDiscountAmount() * p.getPrice()) * lI.getQty());
        } else {
            temp2 = 0;
        }
        assertEquals(temp1, temp2);
    }
    
        public void testQuantityDiscountCalculatesCorrectlyWhenQtyIsSufficient()
    {
        double temp1;
        double temp2;
        Product p = new Product("00001", "Shirt", 3.99, new QuantityDiscount(.25, 5));
        LineItem lI = new LineItem(p, 6);
        temp1 = (p.getDiscountStrategy().getDiscountAmount() * p.getPrice()) * lI.getQty();
        if(lI.getQty() >= p.getDiscountStrategy().getRequiredQty()){
            temp2 = ((p.getDiscountStrategy().getDiscountAmount() * p.getPrice()) * lI.getQty());
        } else {
            temp2 = 0;
        }
        assertEquals(temp1, temp2);
    }
    
    
    
}
