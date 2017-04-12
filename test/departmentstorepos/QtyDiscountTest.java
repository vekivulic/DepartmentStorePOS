/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentstorepos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vekivulic
 */
public class QtyDiscountTest {
  private  QtyDiscount qtyDiscount ;
    
    public QtyDiscountTest() {
        qtyDiscount=new QtyDiscount(.10,1);
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDiscountAmt method, of class QtyDiscount.
     */
    @Test
    public void testGetDiscountAmt() {
        System.out.println("getDiscountAmt");
        double unitPrice = 0.0;
        int qty = 0;
        QtyDiscount instance = null;
        double expResult = 0.0;
        double result = instance.getDiscountAmt(unitPrice, qty);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinQty method, of class QtyDiscount.
     */
    @Test
    public void testGetMinQty() {
        System.out.println("getMinQty");
        QtyDiscount instance = null;
        int expResult = 0;
        int result = instance.getMinQty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinQty method, of class QtyDiscount.
     */
    @Test
    public void testSetMinQty() {
        System.out.println("setMinQty");
        int minQty = 0;
        QtyDiscount instance = null;
        instance.setMinQty(minQty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscountRate method, of class QtyDiscount.
     */
    @Test
    public void testGetDiscountRate() {
        System.out.println("getDiscountRate");
        QtyDiscount instance = null;
        double expResult = 0.0;
        double result = instance.getDiscountRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiscountRate method, of class QtyDiscount.
     */
    @Test
    public void testSetDiscountRate() {
        System.out.println("setDiscountRate");
        double discountRate = 0.0;
        QtyDiscount instance = null;
        instance.setDiscountRate(discountRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test (expected=IllegalArgumentException.class)
    public void testSetDiscountRateShouldNotAllowValueLessThenZero() {
       qtyDiscount.setDiscountRate(0);
       
    }
}
